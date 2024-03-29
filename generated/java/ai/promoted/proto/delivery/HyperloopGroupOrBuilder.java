// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/blender.proto

package ai.promoted.proto.delivery;

public interface HyperloopGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:delivery.HyperloopGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 low_bucket = 1 [json_name = "lowBucket"];</code>
   * @return The lowBucket.
   */
  int getLowBucket();

  /**
   * <code>int32 high_bucket = 2 [json_name = "highBucket"];</code>
   * @return The highBucket.
   */
  int getHighBucket();

  /**
   * <code>.delivery.HyperloopExpression exp = 3 [json_name = "exp"];</code>
   * @return Whether the exp field is set.
   */
  boolean hasExp();
  /**
   * <code>.delivery.HyperloopExpression exp = 3 [json_name = "exp"];</code>
   * @return The exp.
   */
  ai.promoted.proto.delivery.HyperloopExpression getExp();
  /**
   * <code>.delivery.HyperloopExpression exp = 3 [json_name = "exp"];</code>
   */
  ai.promoted.proto.delivery.HyperloopExpressionOrBuilder getExpOrBuilder();
}
