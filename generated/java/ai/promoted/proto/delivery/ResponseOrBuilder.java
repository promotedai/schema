// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/delivery.proto

package ai.promoted.proto.delivery;

public interface ResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:delivery.Response)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .delivery.Insertion insertion = 2 [json_name = "insertion"];</code>
   */
  java.util.List<ai.promoted.proto.delivery.Insertion> 
      getInsertionList();
  /**
   * <code>repeated .delivery.Insertion insertion = 2 [json_name = "insertion"];</code>
   */
  ai.promoted.proto.delivery.Insertion getInsertion(int index);
  /**
   * <code>repeated .delivery.Insertion insertion = 2 [json_name = "insertion"];</code>
   */
  int getInsertionCount();
  /**
   * <code>repeated .delivery.Insertion insertion = 2 [json_name = "insertion"];</code>
   */
  java.util.List<? extends ai.promoted.proto.delivery.InsertionOrBuilder> 
      getInsertionOrBuilderList();
  /**
   * <code>repeated .delivery.Insertion insertion = 2 [json_name = "insertion"];</code>
   */
  ai.promoted.proto.delivery.InsertionOrBuilder getInsertionOrBuilder(
      int index);

  /**
   * <code>.delivery.PagingInfo paging_info = 3 [json_name = "pagingInfo"];</code>
   * @return Whether the pagingInfo field is set.
   */
  boolean hasPagingInfo();
  /**
   * <code>.delivery.PagingInfo paging_info = 3 [json_name = "pagingInfo"];</code>
   * @return The pagingInfo.
   */
  ai.promoted.proto.delivery.PagingInfo getPagingInfo();
  /**
   * <code>.delivery.PagingInfo paging_info = 3 [json_name = "pagingInfo"];</code>
   */
  ai.promoted.proto.delivery.PagingInfoOrBuilder getPagingInfoOrBuilder();

  /**
   * <code>string introspection_data = 4 [json_name = "introspectionData"];</code>
   * @return Whether the introspectionData field is set.
   */
  boolean hasIntrospectionData();
  /**
   * <code>string introspection_data = 4 [json_name = "introspectionData"];</code>
   * @return The introspectionData.
   */
  java.lang.String getIntrospectionData();
  /**
   * <code>string introspection_data = 4 [json_name = "introspectionData"];</code>
   * @return The bytes for introspectionData.
   */
  com.google.protobuf.ByteString
      getIntrospectionDataBytes();

  /**
   * <code>string request_id = 5 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <code>string request_id = 5 [json_name = "requestId"];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
