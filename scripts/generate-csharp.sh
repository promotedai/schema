#!/usr/bin/env bash
# Regenerates the `generated/csharp/` directory.
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

# Use Bazel's proto output.  Move the bazel-bin files to generated output directory.
# Using Bazel helps keep the generated code in sync with the Bazel rules.
rm -rf generated/csharp
export BAZEL_BIN=$(bazel info bazel-bin)
for DIR in $(find proto -type d);
do
    echo "Process $DIR"
    for CSHARP_DIR in $(ls -1 $BAZEL_BIN/$DIR | grep -E '_csharp_(proto|grpc)$');
    do
        mkdir -p generated/csharp
        sudo cp $BAZEL_BIN/$DIR/$CSHARP_DIR/*.cs generated/csharp/
        echo "Copied generated protos to generated/csharp"
    done
done
