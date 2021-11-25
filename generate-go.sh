#!/usr/bin/env bash
# Regenerates the `generated/go/` directory.
#
# Options
# -s => skip bazel build.  Used since GitHub Actions caching is broken.
#
# Known issues:
# Go


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
# Using Bazel helps 
rm -rf generated/go
export BAZEL_BIN=$(bazel info bazel-bin)
for DIR in $(find proto -type d);
do
    echo "Process $DIR"
    for GO_DIR in $(ls -1 $BAZEL_BIN/$DIR | grep '_go_proto_$');
    do
        LEAF_DIR="$(basename $DIR)"
        if [[ "$GO_DIR" == *"grpc"* ]]; then
            mkdir -p generated/go/$DIR/grpc
            cp $BAZEL_BIN/$DIR/$GO_DIR/github.com/promotedai/schema/generated/go/$DIR/grpc/*.pb.go generated/go/$DIR/grpc
            echo "Copied generated protos to to generated/go/$DIR/grpc"
        else
            mkdir -p generated/go/$DIR
            cp $BAZEL_BIN/$DIR/$GO_DIR/github.com/promotedai/schema/generated/go/$DIR/*.pb.go generated/go/$DIR/
            echo "Copied generated protos to to generated/go/$DIR"
        fi
    done
done

go mod tidy
