// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

public interface DiagnosticsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event.Diagnostics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 platform_id = 1 [json_name = "platformId"];</code>
   * @return The platformId.
   */
  long getPlatformId();

  /**
   * <code>.common.UserInfo user_info = 2 [json_name = "userInfo"];</code>
   * @return Whether the userInfo field is set.
   */
  boolean hasUserInfo();
  /**
   * <code>.common.UserInfo user_info = 2 [json_name = "userInfo"];</code>
   * @return The userInfo.
   */
  ai.promoted.proto.common.UserInfo getUserInfo();
  /**
   * <code>.common.UserInfo user_info = 2 [json_name = "userInfo"];</code>
   */
  ai.promoted.proto.common.UserInfoOrBuilder getUserInfoOrBuilder();

  /**
   * <code>.common.Timing timing = 3 [json_name = "timing"];</code>
   * @return Whether the timing field is set.
   */
  boolean hasTiming();
  /**
   * <code>.common.Timing timing = 3 [json_name = "timing"];</code>
   * @return The timing.
   */
  ai.promoted.proto.common.Timing getTiming();
  /**
   * <code>.common.Timing timing = 3 [json_name = "timing"];</code>
   */
  ai.promoted.proto.common.TimingOrBuilder getTimingOrBuilder();

  /**
   * <code>.common.ClientInfo client_info = 4 [json_name = "clientInfo"];</code>
   * @return Whether the clientInfo field is set.
   */
  boolean hasClientInfo();
  /**
   * <code>.common.ClientInfo client_info = 4 [json_name = "clientInfo"];</code>
   * @return The clientInfo.
   */
  ai.promoted.proto.common.ClientInfo getClientInfo();
  /**
   * <code>.common.ClientInfo client_info = 4 [json_name = "clientInfo"];</code>
   */
  ai.promoted.proto.common.ClientInfoOrBuilder getClientInfoOrBuilder();

  /**
   * <code>.event.MobileDiagnostics mobile_diagnostics = 5 [json_name = "mobileDiagnostics"];</code>
   * @return Whether the mobileDiagnostics field is set.
   */
  boolean hasMobileDiagnostics();
  /**
   * <code>.event.MobileDiagnostics mobile_diagnostics = 5 [json_name = "mobileDiagnostics"];</code>
   * @return The mobileDiagnostics.
   */
  ai.promoted.proto.event.MobileDiagnostics getMobileDiagnostics();
  /**
   * <code>.event.MobileDiagnostics mobile_diagnostics = 5 [json_name = "mobileDiagnostics"];</code>
   */
  ai.promoted.proto.event.MobileDiagnosticsOrBuilder getMobileDiagnosticsOrBuilder();

  public ai.promoted.proto.event.Diagnostics.DiagnosticsMessageCase getDiagnosticsMessageCase();
}
