# This minimum was taken from the LLVM docs.
cmake_minimum_required(VERSION 3.13.4)
project(promoted_schema CXX)

file(GLOB_RECURSE HDRS generated/cpp/*.h)
file(GLOB_RECURSE SRCS generated/cpp/*.cc)
add_library(promoted_protos ${HDRS} ${SRCS})
# Assume that Protobuf and gRPC are available.
target_link_libraries(promoted_protos PUBLIC ${PROTOBUF_LIBRARIES} grpc++)
target_include_directories(promoted_protos PUBLIC ${PROTOBUF_INCLUDE_DIRS} ${PROJECT_SOURCE_DIR}/generated/cpp)
