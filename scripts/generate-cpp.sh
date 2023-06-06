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
    bazel build ... || exit 1
fi

# Our version of rules_proto_grpc requires a specific version of Protobuf and protoc.
echo "Downloading protoc."
rm -rf .local
PB_REL="https://github.com/protocolbuffers/protobuf/releases"
curl -LO $PB_REL/download/v3.15.3/protoc-3.15.3-linux-x86_64.zip
unzip protoc-3.15.3-linux-x86_64.zip -d .local/
rm protoc-3.15.3-linux-x86_64.zip
./.local/bin/protoc --version || exit 1

# Use Bazel's proto output.  Move the bazel-bin files to generated output directory.
# Using Bazel helps keep the generated code in sync with the Bazel rules.
# Using Bazel helps 
rm -rf generated/cpp
export BAZEL_BIN=$(bazel info bazel-bin)
for DIR in $(find proto -type d);
do
    echo "Process $DIR"
    for CPP_DIR in $(ls -1 $BAZEL_BIN/$DIR | grep '_cpp_proto_pb$');
    do
        LEAF_DIR="$(basename $DIR)"
        mkdir -p generated/cpp/$DIR
        sudo cp $BAZEL_BIN/$DIR/$CPP_DIR/$DIR/*.pb.h generated/cpp/$DIR/
        sudo cp $BAZEL_BIN/$DIR/$CPP_DIR/$DIR/*.pb.cc generated/cpp/$DIR/
        echo "Copied generated protos to to generated/cpp/$DIR"
    done
done
