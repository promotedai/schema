// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

public interface CartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:event.Cart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .event.CartContent contents = 1 [json_name = "contents"];</code>
   */
  java.util.List<ai.promoted.proto.event.CartContent> 
      getContentsList();
  /**
   * <code>repeated .event.CartContent contents = 1 [json_name = "contents"];</code>
   */
  ai.promoted.proto.event.CartContent getContents(int index);
  /**
   * <code>repeated .event.CartContent contents = 1 [json_name = "contents"];</code>
   */
  int getContentsCount();
  /**
   * <code>repeated .event.CartContent contents = 1 [json_name = "contents"];</code>
   */
  java.util.List<? extends ai.promoted.proto.event.CartContentOrBuilder> 
      getContentsOrBuilderList();
  /**
   * <code>repeated .event.CartContent contents = 1 [json_name = "contents"];</code>
   */
  ai.promoted.proto.event.CartContentOrBuilder getContentsOrBuilder(
      int index);
}
