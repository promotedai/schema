// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/execution.proto

package ai.promoted.proto.delivery;

public interface DeliveryLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:delivery.DeliveryLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 platform_id = 1 [json_name = "platformId"];</code>
   * @return The platformId.
   */
  long getPlatformId();

  /**
   * <code>.delivery.Request request = 2 [json_name = "request"];</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <code>.delivery.Request request = 2 [json_name = "request"];</code>
   * @return The request.
   */
  ai.promoted.proto.delivery.Request getRequest();
  /**
   * <code>.delivery.Request request = 2 [json_name = "request"];</code>
   */
  ai.promoted.proto.delivery.RequestOrBuilder getRequestOrBuilder();

  /**
   * <code>.delivery.Response response = 3 [json_name = "response"];</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <code>.delivery.Response response = 3 [json_name = "response"];</code>
   * @return The response.
   */
  ai.promoted.proto.delivery.Response getResponse();
  /**
   * <code>.delivery.Response response = 3 [json_name = "response"];</code>
   */
  ai.promoted.proto.delivery.ResponseOrBuilder getResponseOrBuilder();

  /**
   * <code>.delivery.DeliveryExecution execution = 4 [json_name = "execution"];</code>
   * @return Whether the execution field is set.
   */
  boolean hasExecution();
  /**
   * <code>.delivery.DeliveryExecution execution = 4 [json_name = "execution"];</code>
   * @return The execution.
   */
  ai.promoted.proto.delivery.DeliveryExecution getExecution();
  /**
   * <code>.delivery.DeliveryExecution execution = 4 [json_name = "execution"];</code>
   */
  ai.promoted.proto.delivery.DeliveryExecutionOrBuilder getExecutionOrBuilder();
}
