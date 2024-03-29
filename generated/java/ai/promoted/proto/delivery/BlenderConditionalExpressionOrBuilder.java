// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/blender.proto

package ai.promoted.proto.delivery;

public interface BlenderConditionalExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:delivery.BlenderConditionalExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.delivery.BlenderConditionalExpression.Operator op = 1 [json_name = "op"];</code>
   * @return The enum numeric value on the wire for op.
   */
  int getOpValue();
  /**
   * <code>.delivery.BlenderConditionalExpression.Operator op = 1 [json_name = "op"];</code>
   * @return The op.
   */
  ai.promoted.proto.delivery.BlenderConditionalExpression.Operator getOp();

  /**
   * <code>.delivery.BlenderExpression predicate_lhs = 2 [json_name = "predicateLhs"];</code>
   * @return Whether the predicateLhs field is set.
   */
  boolean hasPredicateLhs();
  /**
   * <code>.delivery.BlenderExpression predicate_lhs = 2 [json_name = "predicateLhs"];</code>
   * @return The predicateLhs.
   */
  ai.promoted.proto.delivery.BlenderExpression getPredicateLhs();
  /**
   * <code>.delivery.BlenderExpression predicate_lhs = 2 [json_name = "predicateLhs"];</code>
   */
  ai.promoted.proto.delivery.BlenderExpressionOrBuilder getPredicateLhsOrBuilder();

  /**
   * <code>.delivery.BlenderExpression predicate_rhs = 3 [json_name = "predicateRhs"];</code>
   * @return Whether the predicateRhs field is set.
   */
  boolean hasPredicateRhs();
  /**
   * <code>.delivery.BlenderExpression predicate_rhs = 3 [json_name = "predicateRhs"];</code>
   * @return The predicateRhs.
   */
  ai.promoted.proto.delivery.BlenderExpression getPredicateRhs();
  /**
   * <code>.delivery.BlenderExpression predicate_rhs = 3 [json_name = "predicateRhs"];</code>
   */
  ai.promoted.proto.delivery.BlenderExpressionOrBuilder getPredicateRhsOrBuilder();

  /**
   * <code>.delivery.BlenderExpression then_branch = 4 [json_name = "thenBranch"];</code>
   * @return Whether the thenBranch field is set.
   */
  boolean hasThenBranch();
  /**
   * <code>.delivery.BlenderExpression then_branch = 4 [json_name = "thenBranch"];</code>
   * @return The thenBranch.
   */
  ai.promoted.proto.delivery.BlenderExpression getThenBranch();
  /**
   * <code>.delivery.BlenderExpression then_branch = 4 [json_name = "thenBranch"];</code>
   */
  ai.promoted.proto.delivery.BlenderExpressionOrBuilder getThenBranchOrBuilder();

  /**
   * <code>.delivery.BlenderExpression else_branch = 5 [json_name = "elseBranch"];</code>
   * @return Whether the elseBranch field is set.
   */
  boolean hasElseBranch();
  /**
   * <code>.delivery.BlenderExpression else_branch = 5 [json_name = "elseBranch"];</code>
   * @return The elseBranch.
   */
  ai.promoted.proto.delivery.BlenderExpression getElseBranch();
  /**
   * <code>.delivery.BlenderExpression else_branch = 5 [json_name = "elseBranch"];</code>
   */
  ai.promoted.proto.delivery.BlenderExpressionOrBuilder getElseBranchOrBuilder();
}
