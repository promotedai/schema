#!/usr/bin/env bash
# Regenerates the `generated/cpp/` directory.
#
# Options
# -s => skip bazel build.  Used since GitHub Actions caching is broken.

# For debugging: set -eux
set -eu

current_dir=$(basename "$PWD")
if [[ "$current_dir" != "schema" &&  "$current_dir" != "generated-public" ]]; then
    echo "script must be run the schema directory"
    exit 1
fi

BUILD=true
while getopts ":s" opt; do
    case $opt in
        s)
            BUILD=false
            ;;
        \?)
            echo "Invalid option: -$OPTARG" >&2
            exit 1
            ;;
        :)
            echo "Option -$OPTARG requires an argument." >&2
            exit 1
            ;;
    esac
done

if [ "$BUILD" = true ]; then
    # Usually already cached.
    bazel build proto/... tests/... || exit 1
fi

# Our version of rules_proto_grpc requires a specific version of Protobuf and protoc.
echo "Downloading protoc."
rm -rf .local
PB_REL="https://github.com/protocolbuffers/protobuf/releases"

architecture=$(uname -m)
os_name=$(uname -s)

if [[ "$os_name" == "Darwin" ]]; then
    if [[ "$architecture" == "arm64" ]]; then
        export PROTOC=protoc-27.1-osx-aarch_64
    else
        export PROTOC=protoc-27.1-osx-x86_64
    fi
elif [[ "$os_name" == "Linux" ]]; then
    if [[ "$architecture" == "arm64" ]]; then
        export PROTOC=protoc-27.1-linux-aarch_64
    else
        export PROTOC=protoc-27.1-linux-x86_64
    fi
else
    echo "Unknown operating system."
    exit 1
fi

curl -LO $PB_REL/download/v27.1/$PROTOC.zip
unzip $PROTOC.zip -d .local/
rm $PROTOC.zip
./.local/bin/protoc --version || exit 1

# Use Bazel's proto output.  Move the bazel-bin files to generated output directory.
# Using Bazel helps keep the generated code in sync with the Bazel rules.
sudo rm -rf generated/java
export BAZEL_BIN=$(bazel info bazel-bin)
for DIR in $(find proto -type d);
do
    echo "Process $DIR"
    for JAVA_DIR in $(ls -1 $BAZEL_BIN/$DIR | grep -E '_java_(proto|grpc)_srcjar$');
    do
        mkdir -p generated/java/$DIR
        unzip -o "$BAZEL_BIN/$DIR/$JAVA_DIR/*.srcjar" -d generated/java
        echo "Copied generated protos to generated/java/$DIR"
    done
done
