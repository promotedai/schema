#!/usr/bin/env bash
# Regenerates the `generated/py/` directory.
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

# We currently download protoc again so it can recognize mypy-protobuf.
# The protoc installed with Bazel does not recognize it.
if [ -f "./.local/bin/protoc" ]; then
    echo "Found previous protoc."
else
    echo "Downloading protoc."
    # If this block gets changed, I'd recommend renaming `.local` and deleting the old `.local`.
    PB_REL="https://github.com/protocolbuffers/protobuf/releases"
    if [[ "$OSTYPE" == "darwin"* ]]; then
        curl -LO $PB_REL/download/v3.15.8/protoc-3.15.8-osx-x86_64.zip
        unzip protoc-3.15.8-osx-x86_64.zip -d .local/
        rm protoc-3.15.8-osx-x86_64.zip
    else
        curl -LO $PB_REL/download/v3.15.8/protoc-3.15.8-linux-x86_64.zip
        unzip protoc-3.15.8-linux-x86_64.zip -d .local/
        rm protoc-3.15.8-linux-x86_64.zip
    fi
    ./.local/bin/protoc --version || exit 1
fi
pipenv install --dev  || exit 1

rm -rf generated/py
export BAZEL_BIN=$(bazel info bazel-bin)
for DIR in $(find proto -type d);
do
    if [[ $(find $BAZEL_BIN/$DIR/ -type f -name "*.py") ]]; then
        mkdir -p generated/py/$DIR
        touch generated/py/$DIR/__init__.py
        touch generated/py/$DIR/py.typed
        if [ $DIR != "proto" ]; then
            echo "Copy pb2s over from $DIR to generated"
            cp $BAZEL_BIN/$DIR/*_pb2.py generated/py/$DIR/
            pipenv run ./.local/bin/protoc --mypy_out=generated/py $DIR/*.proto || exit 1
        fi
    fi
done
