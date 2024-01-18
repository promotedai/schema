// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

public interface CartContentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event.CartContent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string content_id = 1 [json_name = "contentId"];</code>
   * @return The contentId.
   */
  java.lang.String getContentId();
  /**
   * <code>string content_id = 1 [json_name = "contentId"];</code>
   * @return The bytes for contentId.
   */
  com.google.protobuf.ByteString
      getContentIdBytes();

  /**
   * <code>int64 quantity = 2 [json_name = "quantity"];</code>
   * @return The quantity.
   */
  long getQuantity();

  /**
   * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
   * @return Whether the pricePerUnit field is set.
   */
  boolean hasPricePerUnit();
  /**
   * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
   * @return The pricePerUnit.
   */
  ai.promoted.proto.common.Money getPricePerUnit();
  /**
   * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
   */
  ai.promoted.proto.common.MoneyOrBuilder getPricePerUnitOrBuilder();
}
