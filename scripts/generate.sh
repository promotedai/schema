#!/usr/bin/env bash
# Regenerates the `generated/` directory.
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

./scripts/generate-go.sh "$@"

./scripts/generate-python.sh "$@"

./scripts/generate-cpp.sh "$@"
