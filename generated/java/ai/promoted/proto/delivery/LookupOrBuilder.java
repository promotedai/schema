// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/blender.proto

package ai.promoted.proto.delivery;

public interface LookupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:delivery.Lookup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 feature_id = 1 [json_name = "featureId"];</code>
   * @return Whether the featureId field is set.
   */
  boolean hasFeatureId();
  /**
   * <code>uint64 feature_id = 1 [json_name = "featureId"];</code>
   * @return The featureId.
   */
  long getFeatureId();

  /**
   * <code>uint64 parameter_key = 2 [json_name = "parameterKey"];</code>
   * @return Whether the parameterKey field is set.
   */
  boolean hasParameterKey();
  /**
   * <code>uint64 parameter_key = 2 [json_name = "parameterKey"];</code>
   * @return The parameterKey.
   */
  long getParameterKey();

  public ai.promoted.proto.delivery.Lookup.LookupTypeCase getLookupTypeCase();
}
