// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/blender.proto

package ai.promoted.proto.delivery;

public final class Blender {
  private Blender() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_LeafExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_LeafExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_Lookup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_Lookup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_BlenderConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_BlenderConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_BlenderExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_BlenderExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_BlenderArithmeticExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_BlenderArithmeticExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_BlenderConditionalExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_BlenderConditionalExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_BlenderSortKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_BlenderSortKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopConfig_ParametersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopConfig_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopParameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopGeneratorExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopGeneratorExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopUniformGenerator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopUniformGenerator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopUniformMultiGenerator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopUniformMultiGenerator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopConditionalExpression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopConditionalExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopLog_ParameterLogsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopLog_ParameterLogsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_HyperloopParameterLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_HyperloopParameterLog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034proto/delivery/blender.proto\022\010delivery" +
      "\"V\n\016LeafExpression\022*\n\007lookups\030\001 \003(\0132\020.de" +
      "livery.LookupR\007lookups\022\030\n\007default\030\002 \001(\002R" +
      "\007default\"_\n\006Lookup\022\037\n\nfeature_id\030\001 \001(\004H\000" +
      "R\tfeatureId\022%\n\rparameter_key\030\002 \001(\004H\000R\014pa" +
      "rameterKeyB\r\n\013lookup_type\"\206\001\n\rBlenderCon" +
      "fig\022@\n\rquality_score\030\001 \001(\0132\033.delivery.Bl" +
      "enderExpressionR\014qualityScore\0223\n\010sort_ke" +
      "y\030\002 \001(\0132\030.delivery.BlenderSortKeyR\007sortK" +
      "ey\"\362\001\n\021BlenderExpression\022.\n\004leaf\030\001 \001(\0132\030" +
      ".delivery.LeafExpressionH\000R\004leaf\022N\n\016arit" +
      "hmetic_exp\030\002 \001(\0132%.delivery.BlenderArith" +
      "meticExpressionH\000R\rarithmeticExp\022Q\n\017cond" +
      "itional_exp\030\003 \001(\0132&.delivery.BlenderCond" +
      "itionalExpressionH\000R\016conditionalExpB\n\n\010e" +
      "xp_type\"\206\002\n\033BlenderArithmeticExpression\022" +
      ">\n\002op\030\001 \001(\0162..delivery.BlenderArithmetic" +
      "Expression.OperatorR\002op\0223\n\006inputs\030\002 \003(\0132" +
      "\033.delivery.BlenderExpressionR\006inputs\"r\n\010" +
      "Operator\022\013\n\007UNKNOWN\020\000\022\007\n\003ADD\020\001\022\014\n\010MULTIP" +
      "LY\020\002\022\014\n\010SUBTRACT\020\003\022\n\n\006DIVIDE\020\004\022\007\n\003MIN\020\005\022" +
      "\007\n\003MAX\020\006\022\t\n\005FLOOR\020\007\022\013\n\007CEILING\020\010\"\260\003\n\034Ble" +
      "nderConditionalExpression\022?\n\002op\030\001 \001(\0162/." +
      "delivery.BlenderConditionalExpression.Op" +
      "eratorR\002op\022@\n\rpredicate_lhs\030\002 \001(\0132\033.deli" +
      "very.BlenderExpressionR\014predicateLhs\022@\n\r" +
      "predicate_rhs\030\003 \001(\0132\033.delivery.BlenderEx" +
      "pressionR\014predicateRhs\022<\n\013then_branch\030\004 " +
      "\001(\0132\033.delivery.BlenderExpressionR\nthenBr" +
      "anch\022<\n\013else_branch\030\005 \001(\0132\033.delivery.Ble" +
      "nderExpressionR\nelseBranch\"O\n\010Operator\022\013" +
      "\n\007UNKNOWN\020\000\022\t\n\005EQUAL\020\001\022\020\n\014GREATER_THAN\020\002" +
      "\022\031\n\025GREATER_THAN_OR_EQUAL\020\003\"I\n\016BlenderSo" +
      "rtKey\0227\n\010elements\030\001 \003(\0132\033.delivery.Blend" +
      "erExpressionR\010elements\"\271\001\n\017HyperloopConf" +
      "ig\022I\n\nparameters\030\001 \003(\0132).delivery.Hyperl" +
      "oopConfig.ParametersEntryR\nparameters\032[\n" +
      "\017ParametersEntry\022\020\n\003key\030\001 \001(\004R\003key\0222\n\005va" +
      "lue\030\002 \001(\0132\034.delivery.HyperloopParameterR" +
      "\005value:\0028\001\"`\n\022HyperloopParameter\0220\n\006grou" +
      "ps\030\001 \003(\0132\030.delivery.HyperloopGroupR\006grou" +
      "ps\022\030\n\007default\030\002 \001(\002R\007default\"\201\001\n\016Hyperlo" +
      "opGroup\022\035\n\nlow_bucket\030\001 \001(\005R\tlowBucket\022\037" +
      "\n\013high_bucket\030\002 \001(\005R\nhighBucket\022/\n\003exp\030\003" +
      " \001(\0132\035.delivery.HyperloopExpressionR\003exp" +
      "\"\366\001\n\023HyperloopExpression\022.\n\004leaf\030\001 \001(\0132\030" +
      ".delivery.LeafExpressionH\000R\004leaf\022M\n\rgene" +
      "rator_exp\030\002 \001(\0132&.delivery.HyperloopGene" +
      "ratorExpressionH\000R\014generatorExp\022S\n\017condi" +
      "tional_exp\030\003 \001(\0132(.delivery.HyperloopCon" +
      "ditionalExpressionH\000R\016conditionalExpB\013\n\t" +
      "node_type\"\275\001\n\034HyperloopGeneratorExpressi" +
      "on\022?\n\007uniform\030\001 \001(\0132#.delivery.Hyperloop" +
      "UniformGeneratorH\000R\007uniform\022O\n\runiform_m" +
      "ulti\030\002 \001(\0132(.delivery.HyperloopUniformMu" +
      "ltiGeneratorH\000R\014uniformMultiB\013\n\tgenerato" +
      "r\"W\n\031HyperloopUniformGenerator\022\033\n\tlow_bo" +
      "und\030\001 \001(\002R\010lowBound\022\035\n\nhigh_bound\030\002 \001(\002R" +
      "\thighBound\"J\n\036HyperloopUniformMultiGener" +
      "ator\022\022\n\004base\030\001 \001(\002R\004base\022\024\n\005multi\030\002 \001(\002R" +
      "\005multi\"\274\003\n\036HyperloopConditionalExpressio" +
      "n\022A\n\002op\030\001 \001(\01621.delivery.HyperloopCondit" +
      "ionalExpression.OperatorR\002op\022B\n\rpredicat" +
      "e_lhs\030\002 \001(\0132\035.delivery.HyperloopExpressi" +
      "onR\014predicateLhs\022B\n\rpredicate_rhs\030\003 \001(\0132" +
      "\035.delivery.HyperloopExpressionR\014predicat" +
      "eRhs\022>\n\013then_branch\030\004 \001(\0132\035.delivery.Hyp" +
      "erloopExpressionR\nthenBranch\022>\n\013else_bra" +
      "nch\030\005 \001(\0132\035.delivery.HyperloopExpression" +
      "R\nelseBranch\"O\n\010Operator\022\013\n\007UNKNOWN\020\000\022\t\n" +
      "\005EQUAL\020\001\022\020\n\014GREATER_THAN\020\002\022\031\n\025GREATER_TH" +
      "AN_OR_EQUAL\020\003\"\303\001\n\014HyperloopLog\022P\n\016parame" +
      "ter_logs\030\001 \003(\0132).delivery.HyperloopLog.P" +
      "arameterLogsEntryR\rparameterLogs\032a\n\022Para" +
      "meterLogsEntry\022\020\n\003key\030\001 \001(\004R\003key\0225\n\005valu" +
      "e\030\002 \001(\0132\037.delivery.HyperloopParameterLog" +
      "R\005value:\0028\001\"E\n\025HyperloopParameterLog\022\026\n\006" +
      "bucket\030\001 \001(\005R\006bucket\022\024\n\005value\030\002 \001(\002R\005val" +
      "ueBu\n\032ai.promoted.proto.deliveryB\007Blende" +
      "rP\001Z8github.com/promotedai/schema/genera" +
      "ted/go/proto/delivery\252\002\021Promoted.Deliver" +
      "yb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_delivery_LeafExpression_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_delivery_LeafExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_LeafExpression_descriptor,
        new java.lang.String[] { "Lookups", "Default", });
    internal_static_delivery_Lookup_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_delivery_Lookup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_Lookup_descriptor,
        new java.lang.String[] { "FeatureId", "ParameterKey", "LookupType", });
    internal_static_delivery_BlenderConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_delivery_BlenderConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_BlenderConfig_descriptor,
        new java.lang.String[] { "QualityScore", "SortKey", });
    internal_static_delivery_BlenderExpression_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_delivery_BlenderExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_BlenderExpression_descriptor,
        new java.lang.String[] { "Leaf", "ArithmeticExp", "ConditionalExp", "ExpType", });
    internal_static_delivery_BlenderArithmeticExpression_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_delivery_BlenderArithmeticExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_BlenderArithmeticExpression_descriptor,
        new java.lang.String[] { "Op", "Inputs", });
    internal_static_delivery_BlenderConditionalExpression_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_delivery_BlenderConditionalExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_BlenderConditionalExpression_descriptor,
        new java.lang.String[] { "Op", "PredicateLhs", "PredicateRhs", "ThenBranch", "ElseBranch", });
    internal_static_delivery_BlenderSortKey_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_delivery_BlenderSortKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_BlenderSortKey_descriptor,
        new java.lang.String[] { "Elements", });
    internal_static_delivery_HyperloopConfig_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_delivery_HyperloopConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopConfig_descriptor,
        new java.lang.String[] { "Parameters", });
    internal_static_delivery_HyperloopConfig_ParametersEntry_descriptor =
      internal_static_delivery_HyperloopConfig_descriptor.getNestedTypes().get(0);
    internal_static_delivery_HyperloopConfig_ParametersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopConfig_ParametersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_delivery_HyperloopParameter_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_delivery_HyperloopParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopParameter_descriptor,
        new java.lang.String[] { "Groups", "Default", });
    internal_static_delivery_HyperloopGroup_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_delivery_HyperloopGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopGroup_descriptor,
        new java.lang.String[] { "LowBucket", "HighBucket", "Exp", });
    internal_static_delivery_HyperloopExpression_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_delivery_HyperloopExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopExpression_descriptor,
        new java.lang.String[] { "Leaf", "GeneratorExp", "ConditionalExp", "NodeType", });
    internal_static_delivery_HyperloopGeneratorExpression_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_delivery_HyperloopGeneratorExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopGeneratorExpression_descriptor,
        new java.lang.String[] { "Uniform", "UniformMulti", "Generator", });
    internal_static_delivery_HyperloopUniformGenerator_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_delivery_HyperloopUniformGenerator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopUniformGenerator_descriptor,
        new java.lang.String[] { "LowBound", "HighBound", });
    internal_static_delivery_HyperloopUniformMultiGenerator_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_delivery_HyperloopUniformMultiGenerator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopUniformMultiGenerator_descriptor,
        new java.lang.String[] { "Base", "Multi", });
    internal_static_delivery_HyperloopConditionalExpression_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_delivery_HyperloopConditionalExpression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopConditionalExpression_descriptor,
        new java.lang.String[] { "Op", "PredicateLhs", "PredicateRhs", "ThenBranch", "ElseBranch", });
    internal_static_delivery_HyperloopLog_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_delivery_HyperloopLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopLog_descriptor,
        new java.lang.String[] { "ParameterLogs", });
    internal_static_delivery_HyperloopLog_ParameterLogsEntry_descriptor =
      internal_static_delivery_HyperloopLog_descriptor.getNestedTypes().get(0);
    internal_static_delivery_HyperloopLog_ParameterLogsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopLog_ParameterLogsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_delivery_HyperloopParameterLog_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_delivery_HyperloopParameterLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_HyperloopParameterLog_descriptor,
        new java.lang.String[] { "Bucket", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}