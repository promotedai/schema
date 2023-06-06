# This minimum was taken from the LLVM docs.
cmake_minimum_required(VERSION 3.13.4)
project(promoted_schema CXX)

# If this fails, make sure your machine has libprotobuf-dev.
include(FindProtobuf)
find_package(Protobuf REQUIRED)

file(GLOB_RECURSE HDRS generated/cpp/*.h)
file(GLOB_RECURSE SRCS generated/cpp/*.cc)
add_library(promoted_protos ${HDRS} ${SRCS})
target_link_libraries(promoted_protos PUBLIC ${PROTOBUF_LIBRARIES})
target_include_directories(promoted_protos PUBLIC ${PROTOBUF_INCLUDE_DIRS} ${PROJECT_SOURCE_DIR}/generated/cpp)
