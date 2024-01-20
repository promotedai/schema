// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/delivery.proto

package ai.promoted.proto.delivery;

public final class Delivery {
  private Delivery() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_Paging_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_Paging_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_PagingInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_PagingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_delivery_Insertion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_delivery_Insertion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035proto/delivery/delivery.proto\022\010deliver" +
      "y\032\034google/protobuf/struct.proto\032\031proto/c" +
      "ommon/common.proto\"\261\006\n\007Request\022\037\n\013platfo" +
      "rm_id\030\001 \001(\004R\nplatformId\022-\n\tuser_info\030\002 \001" +
      "(\0132\020.common.UserInfoR\010userInfo\022&\n\006timing" +
      "\030\003 \001(\0132\016.common.TimingR\006timing\0223\n\013client" +
      "_info\030\004 \001(\0132\022.common.ClientInfoR\nclientI" +
      "nfo\022&\n\006device\030\022 \001(\0132\016.common.DeviceR\006dev" +
      "ice\022\035\n\nrequest_id\030\006 \001(\tR\trequestId\022\027\n\007vi" +
      "ew_id\030\007 \001(\tR\006viewId\022 \n\014auto_view_id\030\023 \001(" +
      "\tR\nautoViewId\022\035\n\nsession_id\030\010 \001(\tR\tsessi" +
      "onId\022*\n\021client_request_id\030\016 \001(\tR\017clientR" +
      "equestId\022,\n\010use_case\030\t \001(\0162\021.delivery.Us" +
      "eCaseR\007useCase\022!\n\014search_query\030\n \001(\tR\013se" +
      "archQuery\022(\n\006paging\030\021 \001(\0132\020.delivery.Pag" +
      "ingR\006paging\0221\n\tinsertion\030\013 \003(\0132\023.deliver" +
      "y.InsertionR\tinsertion\0228\n\030insertion_matr" +
      "ix_headers\030\024 \003(\tR\026insertionMatrixHeaders" +
      "\022E\n\020insertion_matrix\030\025 \001(\0132\032.google.prot" +
      "obuf.ListValueR\017insertionMatrix\0222\n\nprope" +
      "rties\030\r \001(\0132\022.common.PropertiesR\npropert" +
      "ies\0227\n\027disable_personalization\030\026 \001(\010R\026di" +
      "sablePersonalizationJ\004\010\005\020\006J\004\010\017\020\020J\004\010\014\020\r\"y" +
      "\n\006Paging\022\033\n\tpaging_id\030\001 \001(\tR\010pagingId\022\022\n" +
      "\004size\030\002 \001(\005R\004size\022\030\n\006cursor\030\003 \001(\tH\000R\006cur" +
      "sor\022\030\n\006offset\030\004 \001(\005H\000R\006offsetB\n\n\010startin" +
      "g\"\344\001\n\010Response\0221\n\tinsertion\030\002 \003(\0132\023.deli" +
      "very.InsertionR\tinsertion\0225\n\013paging_info" +
      "\030\003 \001(\0132\024.delivery.PagingInfoR\npagingInfo" +
      "\0222\n\022introspection_data\030\004 \001(\tH\000R\021introspe" +
      "ctionData\210\001\001\022\035\n\nrequest_id\030\005 \001(\tR\treques" +
      "tIdB\025\n\023_introspection_dataJ\004\010\001\020\002\"A\n\nPagi" +
      "ngInfo\022\033\n\tpaging_id\030\001 \001(\tR\010pagingId\022\026\n\006c" +
      "ursor\030\002 \001(\tR\006cursor\"\206\005\n\tInsertion\022\037\n\013pla" +
      "tform_id\030\001 \001(\004R\nplatformId\022-\n\tuser_info\030" +
      "\002 \001(\0132\020.common.UserInfoR\010userInfo\022&\n\006tim" +
      "ing\030\003 \001(\0132\016.common.TimingR\006timing\0223\n\013cli" +
      "ent_info\030\004 \001(\0132\022.common.ClientInfoR\nclie" +
      "ntInfo\022!\n\014insertion_id\030\006 \001(\tR\013insertionI" +
      "d\022\035\n\nrequest_id\030\007 \001(\tR\trequestId\022\027\n\007view" +
      "_id\030\t \001(\tR\006viewId\022 \n\014auto_view_id\030\025 \001(\tR" +
      "\nautoViewId\022\035\n\nsession_id\030\010 \001(\tR\tsession" +
      "Id\022\035\n\ncontent_id\030\n \001(\tR\tcontentId\022\037\n\010pos" +
      "ition\030\014 \001(\004H\000R\010position\210\001\001\0222\n\nproperties" +
      "\030\r \001(\0132\022.common.PropertiesR\nproperties\022*" +
      "\n\016retrieval_rank\030\023 \001(\004H\001R\rretrievalRank\210" +
      "\001\001\022,\n\017retrieval_score\030\024 \001(\002H\002R\016retrieval" +
      "Score\210\001\001B\013\n\t_positionB\021\n\017_retrieval_rank" +
      "B\022\n\020_retrieval_scoreJ\004\010\005\020\006J\004\010\013\020\014J\004\010\016\020\017J\004" +
      "\010\017\020\020J\004\010\021\020\022J\004\010\022\020\023J\004\010\026\020\027J\004\010\027\020\030*\332\001\n\007UseCase" +
      "\022\024\n\020UNKNOWN_USE_CASE\020\000\022\n\n\006CUSTOM\020\001\022\n\n\006SE" +
      "ARCH\020\002\022\026\n\022SEARCH_SUGGESTIONS\020\003\022\010\n\004FEED\020\004" +
      "\022\023\n\017RELATED_CONTENT\020\005\022\014\n\010CLOSE_UP\020\006\022\024\n\020C" +
      "ATEGORY_CONTENT\020\007\022\016\n\nMY_CONTENT\020\010\022\024\n\020MY_" +
      "SAVED_CONTENT\020\t\022\022\n\016SELLER_CONTENT\020\n\022\014\n\010D" +
      "ISCOVER\020\013Bv\n\032ai.promoted.proto.deliveryB" +
      "\010DeliveryP\001Z8github.com/promotedai/schem" +
      "a/generated/go/proto/delivery\252\002\021Promoted" +
      ".Deliveryb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          ai.promoted.proto.common.CommonProto.getDescriptor(),
        });
    internal_static_delivery_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_delivery_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_Request_descriptor,
        new java.lang.String[] { "PlatformId", "UserInfo", "Timing", "ClientInfo", "Device", "RequestId", "ViewId", "AutoViewId", "SessionId", "ClientRequestId", "UseCase", "SearchQuery", "Paging", "Insertion", "InsertionMatrixHeaders", "InsertionMatrix", "Properties", "DisablePersonalization", });
    internal_static_delivery_Paging_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_delivery_Paging_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_Paging_descriptor,
        new java.lang.String[] { "PagingId", "Size", "Cursor", "Offset", "Starting", });
    internal_static_delivery_Response_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_delivery_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_Response_descriptor,
        new java.lang.String[] { "Insertion", "PagingInfo", "IntrospectionData", "RequestId", "IntrospectionData", });
    internal_static_delivery_PagingInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_delivery_PagingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_PagingInfo_descriptor,
        new java.lang.String[] { "PagingId", "Cursor", });
    internal_static_delivery_Insertion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_delivery_Insertion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_delivery_Insertion_descriptor,
        new java.lang.String[] { "PlatformId", "UserInfo", "Timing", "ClientInfo", "InsertionId", "RequestId", "ViewId", "AutoViewId", "SessionId", "ContentId", "Position", "Properties", "RetrievalRank", "RetrievalScore", "Position", "RetrievalRank", "RetrievalScore", });
    com.google.protobuf.StructProto.getDescriptor();
    ai.promoted.proto.common.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}