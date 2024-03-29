// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

public interface ActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event.Action)
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
   * <code>string action_id = 6 [json_name = "actionId"];</code>
   * @return The actionId.
   */
  java.lang.String getActionId();
  /**
   * <code>string action_id = 6 [json_name = "actionId"];</code>
   * @return The bytes for actionId.
   */
  com.google.protobuf.ByteString
      getActionIdBytes();

  /**
   * <code>string impression_id = 7 [json_name = "impressionId"];</code>
   * @return The impressionId.
   */
  java.lang.String getImpressionId();
  /**
   * <code>string impression_id = 7 [json_name = "impressionId"];</code>
   * @return The bytes for impressionId.
   */
  com.google.protobuf.ByteString
      getImpressionIdBytes();

  /**
   * <code>string insertion_id = 8 [json_name = "insertionId"];</code>
   * @return The insertionId.
   */
  java.lang.String getInsertionId();
  /**
   * <code>string insertion_id = 8 [json_name = "insertionId"];</code>
   * @return The bytes for insertionId.
   */
  com.google.protobuf.ByteString
      getInsertionIdBytes();

  /**
   * <code>string request_id = 9 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <code>string request_id = 9 [json_name = "requestId"];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <code>string view_id = 11 [json_name = "viewId"];</code>
   * @return The viewId.
   */
  java.lang.String getViewId();
  /**
   * <code>string view_id = 11 [json_name = "viewId"];</code>
   * @return The bytes for viewId.
   */
  com.google.protobuf.ByteString
      getViewIdBytes();

  /**
   * <code>string auto_view_id = 23 [json_name = "autoViewId"];</code>
   * @return The autoViewId.
   */
  java.lang.String getAutoViewId();
  /**
   * <code>string auto_view_id = 23 [json_name = "autoViewId"];</code>
   * @return The bytes for autoViewId.
   */
  com.google.protobuf.ByteString
      getAutoViewIdBytes();

  /**
   * <code>string session_id = 10 [json_name = "sessionId"];</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <code>string session_id = 10 [json_name = "sessionId"];</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <code>string content_id = 21 [json_name = "contentId"];</code>
   * @return The contentId.
   */
  java.lang.String getContentId();
  /**
   * <code>string content_id = 21 [json_name = "contentId"];</code>
   * @return The bytes for contentId.
   */
  com.google.protobuf.ByteString
      getContentIdBytes();

  /**
   * <code>string name = 12 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 12 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.event.ActionType action_type = 14 [json_name = "actionType"];</code>
   * @return The enum numeric value on the wire for actionType.
   */
  int getActionTypeValue();
  /**
   * <code>.event.ActionType action_type = 14 [json_name = "actionType"];</code>
   * @return The actionType.
   */
  ai.promoted.proto.event.ActionType getActionType();

  /**
   * <code>string custom_action_type = 15 [json_name = "customActionType"];</code>
   * @return The customActionType.
   */
  java.lang.String getCustomActionType();
  /**
   * <code>string custom_action_type = 15 [json_name = "customActionType"];</code>
   * @return The bytes for customActionType.
   */
  com.google.protobuf.ByteString
      getCustomActionTypeBytes();

  /**
   * <code>string element_id = 17 [json_name = "elementId"];</code>
   * @return The elementId.
   */
  java.lang.String getElementId();
  /**
   * <code>string element_id = 17 [json_name = "elementId"];</code>
   * @return The bytes for elementId.
   */
  com.google.protobuf.ByteString
      getElementIdBytes();

  /**
   * <code>.event.NavigateAction navigate_action = 18 [json_name = "navigateAction"];</code>
   * @return Whether the navigateAction field is set.
   */
  boolean hasNavigateAction();
  /**
   * <code>.event.NavigateAction navigate_action = 18 [json_name = "navigateAction"];</code>
   * @return The navigateAction.
   */
  ai.promoted.proto.event.NavigateAction getNavigateAction();
  /**
   * <code>.event.NavigateAction navigate_action = 18 [json_name = "navigateAction"];</code>
   */
  ai.promoted.proto.event.NavigateActionOrBuilder getNavigateActionOrBuilder();

  /**
   * <code>bool has_superimposed_views = 22 [json_name = "hasSuperimposedViews"];</code>
   * @return The hasSuperimposedViews.
   */
  boolean getHasSuperimposedViews();

  /**
   * <code>.event.IndexPath client_position = 24 [json_name = "clientPosition"];</code>
   * @return Whether the clientPosition field is set.
   */
  boolean hasClientPosition();
  /**
   * <code>.event.IndexPath client_position = 24 [json_name = "clientPosition"];</code>
   * @return The clientPosition.
   */
  ai.promoted.proto.event.IndexPath getClientPosition();
  /**
   * <code>.event.IndexPath client_position = 24 [json_name = "clientPosition"];</code>
   */
  ai.promoted.proto.event.IndexPathOrBuilder getClientPositionOrBuilder();

  /**
   * <code>.event.IdentifierProvenances id_provenances = 25 [json_name = "idProvenances"];</code>
   * @return Whether the idProvenances field is set.
   */
  boolean hasIdProvenances();
  /**
   * <code>.event.IdentifierProvenances id_provenances = 25 [json_name = "idProvenances"];</code>
   * @return The idProvenances.
   */
  ai.promoted.proto.event.IdentifierProvenances getIdProvenances();
  /**
   * <code>.event.IdentifierProvenances id_provenances = 25 [json_name = "idProvenances"];</code>
   */
  ai.promoted.proto.event.IdentifierProvenancesOrBuilder getIdProvenancesOrBuilder();

  /**
   * <code>.common.Properties properties = 20 [json_name = "properties"];</code>
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   * <code>.common.Properties properties = 20 [json_name = "properties"];</code>
   * @return The properties.
   */
  ai.promoted.proto.common.Properties getProperties();
  /**
   * <code>.common.Properties properties = 20 [json_name = "properties"];</code>
   */
  ai.promoted.proto.common.PropertiesOrBuilder getPropertiesOrBuilder();

  /**
   * <code>.common.Device device = 26 [json_name = "device"];</code>
   * @return Whether the device field is set.
   */
  boolean hasDevice();
  /**
   * <code>.common.Device device = 26 [json_name = "device"];</code>
   * @return The device.
   */
  ai.promoted.proto.common.Device getDevice();
  /**
   * <code>.common.Device device = 26 [json_name = "device"];</code>
   */
  ai.promoted.proto.common.DeviceOrBuilder getDeviceOrBuilder();

  /**
   * <code>.event.Cart cart = 28 [json_name = "cart"];</code>
   * @return Whether the cart field is set.
   */
  boolean hasCart();
  /**
   * <code>.event.Cart cart = 28 [json_name = "cart"];</code>
   * @return The cart.
   */
  ai.promoted.proto.event.Cart getCart();
  /**
   * <code>.event.Cart cart = 28 [json_name = "cart"];</code>
   */
  ai.promoted.proto.event.CartOrBuilder getCartOrBuilder();

  public ai.promoted.proto.event.Action.ActionCase getActionCase();
}
