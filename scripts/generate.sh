#!/usr/bin/env bash

PROTOC_VERSION="26.0"
PROTOC_ZIP="protoc-${PROTOC_VERSION}-linux-x86_64.zip"

PROTO_ROOT="proto"
GENERATED_CPP_ROOT="generated/cpp"
GENERATED_CSHARP_ROOT="generated/csharp"
GENERATED_PYTHON_ROOT="schema_internal"
GENERATED_GO_ROOT="generated/go"

current_dir=$(basename "$PWD")
if [[ "$current_dir" != "schema" &&  "$current_dir" != "generated-public" ]]; then
    echo "script must be run the schema directory"
    exit 1
fi

export DEBIAN_FRONTEND=noninteractive
sudo apt-get update
sudo apt-get install -y  \
    wget \
    ninja-build

# Install the version of protoc we need.
TEMP_DIR="$(mktemp -d)"
echo "Downloading protoc ${PROTOC_VERSION}..."
wget "https://github.com/protocolbuffers/protobuf/releases/download/v${PROTOC_VERSION}/${PROTOC_ZIP}" -O "${TEMP_DIR}/${PROTOC_ZIP}"
echo "Installing protoc..."
unzip "${TEMP_DIR}/${PROTOC_ZIP}" -d "$TEMP_DIR"
export PATH="$TEMP_DIR/bin:$PATH"

# Verify protoc installation.
if ! command -v protoc >/dev/null; then
    echo "protoc installation failed"
    exit 1
fi

# Unclear where the issue is sneaking in, but there's an incompatibility with
# Abseil (required by gRPC) and most versions of CMake.
# https://github.com/open-telemetry/opentelemetry-cpp/issues/2998#issuecomment-2220777779
(
    cd "$(mktemp -d)" || exit
    wget https://github.com/Kitware/CMake/releases/download/v3.28.6/cmake-3.28.6.tar.gz
    tar -xzf cmake-3.28.6.tar.gz
    cd cmake-3.28.6 || exit
    ./bootstrap --generator=Ninja
    ninja
    sudo ninja install
)

# We have to build any gRPC protoc plugins from source.
(
    cd "$(mktemp -d)" || exit
    git clone -b v1.64.2 https://github.com/grpc/grpc
    cd grpc || exit
    # For now don't do --recursive because it saves multiple minutes.
    # This could start failing one day.
    git submodule update --init
    mkdir -p build
    cd build || exit
    cmake -G "Ninja" -DgRPC_BUILD_TESTS=OFF ..
    ninja grpc_cpp_plugin
    cp grpc_cpp_plugin /usr/local/bin/
    ninja grpc_csharp_plugin
    cp grpc_csharp_plugin /usr/local/bin/
    ninja grpc_python_plugin
    cp grpc_python_plugin /usr/local/bin/
)

# Verify gRPC plugin installations.
if ! command -v grpc_cpp_plugin >/dev/null; then
    echo "grpc_cpp_plugin installation failed"
    exit 1
fi
if ! command -v grpc_csharp_plugin >/dev/null; then
    echo "grpc_csharp_plugin installation failed"
    exit 1
fi
if ! command -v grpc_python_plugin >/dev/null; then
    echo "grpc_python_plugin installation failed"
    exit 1
fi

# Golang plugins are installed differently.
go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.31.0
go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v1.2.0
if ! command -v protoc-gen-go >/dev/null; then
    echo "protoc-gen-go installation failed"
    exit 1
fi
if ! command -v protoc-gen-go-grpc >/dev/null; then
    echo "protoc-gen-go-grpc installation failed"
    exit 1
fi

function compile_proto_file {
    local file_path=$1
    local out_arg=$2          # e.g., "cpp_out", "csharp_out", "python_out", "go_out=paths=source_relative"
    local generated_root=$3
    local grpc_out_arg=$4     # e.g., "grpc_out", "go-grpc_out=paths=source_relative"
    local grpc_plugin=$5      # e.g., "grpc_cpp_plugin", "grpc_csharp_plugin", "grpc_python_plugin", ""
    local extra_options=$6    # e.g., extra options like "--csharp_opt=base_namespace=Promoted"

    local protoc_cmd="protoc -I. $extra_options"
    if [[ "$out_arg" == go_out* ]]; then
        # For Golang, use ':' to separate options and output directory
        protoc_cmd+=" --$out_arg:$generated_root"
    else
        protoc_cmd+=" --$out_arg=$generated_root"
    fi
    # We check if the file actually defines any RPCs.
    # Otherwise protoc will force the generation of effectively-empty files.
    if grep -q " rpc " "$file_path"; then
        if [[ "$grpc_out_arg" == go-grpc_out* ]]; then
            protoc_cmd+=" --$grpc_out_arg:$generated_root"
        else
            protoc_cmd+=" --$grpc_out_arg=$generated_root"
            if [ -n "$grpc_plugin" ]; then
                protoc_cmd+=" --plugin=protoc-gen-grpc=$(which "$grpc_plugin")"
            fi
        fi
    fi
    protoc_cmd+=" $file_path"

    if ! $protoc_cmd; then
        echo "Failed to compile: $file_path"
        exit 1
    fi

    echo "Compiled: $file_path into $generated_root"
}

# Find and process all .proto files.
mapfile -t proto_files < <(find "$PROTO_ROOT" -type f -name "*.proto")

mkdir -p $GENERATED_CPP_ROOT
for proto_file in "${proto_files[@]}"; do
    compile_proto_file "$proto_file" "cpp_out" "$GENERATED_CPP_ROOT" "grpc_out" "grpc_cpp_plugin" ""
done

mkdir -p $GENERATED_CSHARP_ROOT
for proto_file in "${proto_files[@]}"; do
    # The health check proto requires specialized namespaces.
    if [[ "$proto_file" == "proto/health/health.proto" ]]; then
        compile_proto_file "$proto_file" "csharp_out" "$GENERATED_CSHARP_ROOT" "grpc_out" "grpc_csharp_plugin" ""
    else
        compile_proto_file "$proto_file" "csharp_out" "$GENERATED_CSHARP_ROOT" "grpc_out" "grpc_csharp_plugin" "--csharp_opt=base_namespace=Promoted"
    fi
done

mkdir -p $GENERATED_GO_ROOT
for proto_file in "${proto_files[@]}"; do
    compile_proto_file "$proto_file" "go_out=paths=source_relative" "$GENERATED_GO_ROOT" "go-grpc_out=paths=source_relative" "" ""
done

# Complications for Python generation:
# 1. the root directory needs to be the name of the package "schema_internal".
# 2. Protoc of Python infers the package from the path.
#
# So we'll copy the protos to the desired path, generate the Python files and then remove the proto files.

echo "Generate Python files"

rm -rf $GENERATED_PYTHON_ROOT
mkdir -p $GENERATED_PYTHON_ROOT

# Copy the protos to the desired path.  Change the import paths.
for proto_file in "${proto_files[@]}"; do
    proto_dir=$(dirname "$proto_file")
    new_proto_dir="$GENERATED_PYTHON_ROOT/$proto_dir"
    new_proto_file="$GENERATED_PYTHON_ROOT/$proto_file"
    mkdir -p "$new_proto_dir"
    cp "$proto_file" "$new_proto_file"
    # Fix imports to fix the paths.
    sed -i "s/import \"proto/import \"schema_internal\/proto/g" "$new_proto_file"
done

# Generate the Python files from the copied proto files.
for proto_file in "${proto_files[@]}"; do
    new_proto_file="$GENERATED_PYTHON_ROOT/$proto_file"
    compile_proto_file "$new_proto_file" "python_out" "." "grpc_out" "grpc_python_plugin" ""
done

# Remove the copied proto files.
for proto_file in "${proto_files[@]}"; do
    new_proto_file="$GENERATED_PYTHON_ROOT/$proto_file"
    rm "$new_proto_file"
done

echo "All C++, C#, Go, Python files generated successfully"
