// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/common/retained_user.proto

package ai.promoted.proto.common;

public interface RetainedUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.RetainedUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 platform_id = 1 [json_name = "platformId"];</code>
   * @return The platformId.
   */
  long getPlatformId();

  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string retained_user_id = 3 [json_name = "retainedUserId"];</code>
   * @return The retainedUserId.
   */
  java.lang.String getRetainedUserId();
  /**
   * <code>string retained_user_id = 3 [json_name = "retainedUserId"];</code>
   * @return The bytes for retainedUserId.
   */
  com.google.protobuf.ByteString
      getRetainedUserIdBytes();

  /**
   * <code>uint64 create_event_api_time_millis = 4 [json_name = "createEventApiTimeMillis"];</code>
   * @return The createEventApiTimeMillis.
   */
  long getCreateEventApiTimeMillis();

  /**
   * <code>uint64 process_time_millis = 5 [json_name = "processTimeMillis"];</code>
   * @return The processTimeMillis.
   */
  long getProcessTimeMillis();

  /**
   * <code>uint64 last_forgotten_time_millis = 6 [json_name = "lastForgottenTimeMillis"];</code>
   * @return The lastForgottenTimeMillis.
   */
  long getLastForgottenTimeMillis();
}
