// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/common/retained_user.proto

package ai.promoted.proto.common;

public final class RetainedUserOuterClass {
  private RetainedUserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_RetainedUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_RetainedUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_AnonUserRetainedUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_AnonUserRetainedUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n proto/common/retained_user.proto\022\006comm" +
      "on\"\237\002\n\014RetainedUser\022\037\n\013platform_id\030\001 \001(\004" +
      "R\nplatformId\022\027\n\007user_id\030\002 \001(\tR\006userId\022(\n" +
      "\020retained_user_id\030\003 \001(\tR\016retainedUserId\022" +
      ">\n\034create_event_api_time_millis\030\004 \001(\004R\030c" +
      "reateEventApiTimeMillis\022.\n\023process_time_" +
      "millis\030\005 \001(\004R\021processTimeMillis\022;\n\032last_" +
      "forgotten_time_millis\030\006 \001(\004R\027lastForgott" +
      "enTimeMillis\"\337\001\n\024AnonUserRetainedUser\022\037\n" +
      "\013platform_id\030\001 \001(\004R\nplatformId\022 \n\014anon_u" +
      "ser_id\030\002 \001(\tR\nanonUserId\022(\n\020retained_use" +
      "r_id\030\003 \001(\tR\016retainedUserId\022*\n\021event_time" +
      "_millis\030\004 \001(\004R\017eventTimeMillis\022.\n\023proces" +
      "s_time_millis\030\005 \001(\004R\021processTimeMillisBT" +
      "\n\030ai.promoted.proto.commonP\001Z6github.com" +
      "/promotedai/schema/generated/go/proto/co" +
      "mmonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_common_RetainedUser_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_common_RetainedUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_RetainedUser_descriptor,
        new java.lang.String[] { "PlatformId", "UserId", "RetainedUserId", "CreateEventApiTimeMillis", "ProcessTimeMillis", "LastForgottenTimeMillis", });
    internal_static_common_AnonUserRetainedUser_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_common_AnonUserRetainedUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_AnonUserRetainedUser_descriptor,
        new java.lang.String[] { "PlatformId", "AnonUserId", "RetainedUserId", "EventTimeMillis", "ProcessTimeMillis", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
