// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/blender.proto

package ai.promoted.proto.delivery;

public interface HyperloopConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:delivery.HyperloopConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint64, .delivery.HyperloopParameter&gt; parameters = 1 [json_name = "parameters"];</code>
   */
  int getParametersCount();
  /**
   * <code>map&lt;uint64, .delivery.HyperloopParameter&gt; parameters = 1 [json_name = "parameters"];</code>
   */
  boolean containsParameters(
      long key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, ai.promoted.proto.delivery.HyperloopParameter>
  getParameters();
  /**
   * <code>map&lt;uint64, .delivery.HyperloopParameter&gt; parameters = 1 [json_name = "parameters"];</code>
   */
  java.util.Map<java.lang.Long, ai.promoted.proto.delivery.HyperloopParameter>
  getParametersMap();
  /**
   * <code>map&lt;uint64, .delivery.HyperloopParameter&gt; parameters = 1 [json_name = "parameters"];</code>
   */

  ai.promoted.proto.delivery.HyperloopParameter getParametersOrDefault(
      long key,
      ai.promoted.proto.delivery.HyperloopParameter defaultValue);
  /**
   * <code>map&lt;uint64, .delivery.HyperloopParameter&gt; parameters = 1 [json_name = "parameters"];</code>
   */

  ai.promoted.proto.delivery.HyperloopParameter getParametersOrThrow(
      long key);
}