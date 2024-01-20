// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/delivery.proto

package ai.promoted.proto.delivery;

/**
 * Protobuf type {@code delivery.PagingInfo}
 */
public final class PagingInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:delivery.PagingInfo)
    PagingInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PagingInfo.newBuilder() to construct.
  private PagingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PagingInfo() {
    pagingId_ = "";
    cursor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PagingInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PagingInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            pagingId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cursor_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.promoted.proto.delivery.Delivery.internal_static_delivery_PagingInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.promoted.proto.delivery.Delivery.internal_static_delivery_PagingInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.promoted.proto.delivery.PagingInfo.class, ai.promoted.proto.delivery.PagingInfo.Builder.class);
  }

  public static final int PAGING_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object pagingId_;
  /**
   * <code>string paging_id = 1 [json_name = "pagingId"];</code>
   * @return The pagingId.
   */
  @java.lang.Override
  public java.lang.String getPagingId() {
    java.lang.Object ref = pagingId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pagingId_ = s;
      return s;
    }
  }
  /**
   * <code>string paging_id = 1 [json_name = "pagingId"];</code>
   * @return The bytes for pagingId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPagingIdBytes() {
    java.lang.Object ref = pagingId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pagingId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURSOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object cursor_;
  /**
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The cursor.
   */
  @java.lang.Override
  public java.lang.String getCursor() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cursor_ = s;
      return s;
    }
  }
  /**
   * <code>string cursor = 2 [json_name = "cursor"];</code>
   * @return The bytes for cursor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCursorBytes() {
    java.lang.Object ref = cursor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cursor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPagingIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pagingId_);
    }
    if (!getCursorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cursor_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPagingIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pagingId_);
    }
    if (!getCursorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cursor_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.promoted.proto.delivery.PagingInfo)) {
      return super.equals(obj);
    }
    ai.promoted.proto.delivery.PagingInfo other = (ai.promoted.proto.delivery.PagingInfo) obj;

    if (!getPagingId()
        .equals(other.getPagingId())) return false;
    if (!getCursor()
        .equals(other.getCursor())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPagingId().hashCode();
    hash = (37 * hash) + CURSOR_FIELD_NUMBER;
    hash = (53 * hash) + getCursor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.promoted.proto.delivery.PagingInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.PagingInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.promoted.proto.delivery.PagingInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code delivery.PagingInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:delivery.PagingInfo)
      ai.promoted.proto.delivery.PagingInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.promoted.proto.delivery.Delivery.internal_static_delivery_PagingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.promoted.proto.delivery.Delivery.internal_static_delivery_PagingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.promoted.proto.delivery.PagingInfo.class, ai.promoted.proto.delivery.PagingInfo.Builder.class);
    }

    // Construct using ai.promoted.proto.delivery.PagingInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pagingId_ = "";

      cursor_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.promoted.proto.delivery.Delivery.internal_static_delivery_PagingInfo_descriptor;
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.PagingInfo getDefaultInstanceForType() {
      return ai.promoted.proto.delivery.PagingInfo.getDefaultInstance();
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.PagingInfo build() {
      ai.promoted.proto.delivery.PagingInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.PagingInfo buildPartial() {
      ai.promoted.proto.delivery.PagingInfo result = new ai.promoted.proto.delivery.PagingInfo(this);
      result.pagingId_ = pagingId_;
      result.cursor_ = cursor_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.promoted.proto.delivery.PagingInfo) {
        return mergeFrom((ai.promoted.proto.delivery.PagingInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.promoted.proto.delivery.PagingInfo other) {
      if (other == ai.promoted.proto.delivery.PagingInfo.getDefaultInstance()) return this;
      if (!other.getPagingId().isEmpty()) {
        pagingId_ = other.pagingId_;
        onChanged();
      }
      if (!other.getCursor().isEmpty()) {
        cursor_ = other.cursor_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.promoted.proto.delivery.PagingInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.promoted.proto.delivery.PagingInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pagingId_ = "";
    /**
     * <code>string paging_id = 1 [json_name = "pagingId"];</code>
     * @return The pagingId.
     */
    public java.lang.String getPagingId() {
      java.lang.Object ref = pagingId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pagingId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string paging_id = 1 [json_name = "pagingId"];</code>
     * @return The bytes for pagingId.
     */
    public com.google.protobuf.ByteString
        getPagingIdBytes() {
      java.lang.Object ref = pagingId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pagingId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string paging_id = 1 [json_name = "pagingId"];</code>
     * @param value The pagingId to set.
     * @return This builder for chaining.
     */
    public Builder setPagingId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pagingId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string paging_id = 1 [json_name = "pagingId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPagingId() {
      
      pagingId_ = getDefaultInstance().getPagingId();
      onChanged();
      return this;
    }
    /**
     * <code>string paging_id = 1 [json_name = "pagingId"];</code>
     * @param value The bytes for pagingId to set.
     * @return This builder for chaining.
     */
    public Builder setPagingIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pagingId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cursor_ = "";
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @return The cursor.
     */
    public java.lang.String getCursor() {
      java.lang.Object ref = cursor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cursor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @return The bytes for cursor.
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      java.lang.Object ref = cursor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cursor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @param value The cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cursor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCursor() {
      
      cursor_ = getDefaultInstance().getCursor();
      onChanged();
      return this;
    }
    /**
     * <code>string cursor = 2 [json_name = "cursor"];</code>
     * @param value The bytes for cursor to set.
     * @return This builder for chaining.
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cursor_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:delivery.PagingInfo)
  }

  // @@protoc_insertion_point(class_scope:delivery.PagingInfo)
  private static final ai.promoted.proto.delivery.PagingInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.promoted.proto.delivery.PagingInfo();
  }

  public static ai.promoted.proto.delivery.PagingInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PagingInfo>
      PARSER = new com.google.protobuf.AbstractParser<PagingInfo>() {
    @java.lang.Override
    public PagingInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PagingInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PagingInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PagingInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.promoted.proto.delivery.PagingInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
