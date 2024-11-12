cmake_minimum_required(VERSION 3.28.6)
project(promoted_schema CXX)

option(ENABLE_GRPC "Should we include gRPC-related files and link to gRPC" OFF)

# We force the static library to simplify the... complex state of libprotobuf.
set(Protobuf_USE_STATIC_LIBS ON)
find_package(Protobuf 5.26.0 REQUIRED)
find_package(PkgConfig REQUIRED)
pkg_check_modules(PROTOBUF_PKG REQUIRED IMPORTED_TARGET protobuf=26.0.0)

file(GLOB_RECURSE SRCS generated/cpp/*.cc)
if (NOT ENABLE_GRPC)
    list(FILTER SRCS EXCLUDE REGEX "grpc")
endif()
add_library(promoted_protobuf STATIC ${SRCS})
# Protobuf messed up their CMake and their target doesn't link to the (many)
# Abseil dependencies appropriately. That said, their pkg-config files are
# correct so we can steal the necessary dependencies from there. Idea taken from
# https://github.com/protocolbuffers/protobuf/issues/12637#issuecomment-1871458639
#
# Since this is cumbersome, we also mark everything PUBLIC and just use this
# target as a universal way to access Protobuf.
if (ENABLE_GRPC)
    target_link_libraries(promoted_protobuf PUBLIC grpc++)
endif()
target_link_libraries(promoted_protobuf PUBLIC ${PROTOBUF_LIBRARIES} PkgConfig::PROTOBUF_PKG)
target_include_directories(promoted_protobuf PUBLIC ${PROJECT_SOURCE_DIR}/generated/cpp ${PROTOBUF_INCLUDE_DIRS})
