// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/common/common.proto

package ai.promoted.proto.common;

public interface BrowserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.Browser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_agent = 1 [json_name = "userAgent"];</code>
   * @return The userAgent.
   */
  java.lang.String getUserAgent();
  /**
   * <code>string user_agent = 1 [json_name = "userAgent"];</code>
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString
      getUserAgentBytes();

  /**
   * <code>.common.Size viewport_size = 2 [json_name = "viewportSize"];</code>
   * @return Whether the viewportSize field is set.
   */
  boolean hasViewportSize();
  /**
   * <code>.common.Size viewport_size = 2 [json_name = "viewportSize"];</code>
   * @return The viewportSize.
   */
  ai.promoted.proto.common.Size getViewportSize();
  /**
   * <code>.common.Size viewport_size = 2 [json_name = "viewportSize"];</code>
   */
  ai.promoted.proto.common.SizeOrBuilder getViewportSizeOrBuilder();

  /**
   * <code>.common.ClientHints client_hints = 3 [json_name = "clientHints"];</code>
   * @return Whether the clientHints field is set.
   */
  boolean hasClientHints();
  /**
   * <code>.common.ClientHints client_hints = 3 [json_name = "clientHints"];</code>
   * @return The clientHints.
   */
  ai.promoted.proto.common.ClientHints getClientHints();
  /**
   * <code>.common.ClientHints client_hints = 3 [json_name = "clientHints"];</code>
   */
  ai.promoted.proto.common.ClientHintsOrBuilder getClientHintsOrBuilder();

  /**
   * <code>string referrer = 4 [json_name = "referrer"];</code>
   * @return The referrer.
   */
  java.lang.String getReferrer();
  /**
   * <code>string referrer = 4 [json_name = "referrer"];</code>
   * @return The bytes for referrer.
   */
  com.google.protobuf.ByteString
      getReferrerBytes();
}
