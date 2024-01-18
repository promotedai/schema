// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

/**
 * Protobuf type {@code event.CartContent}
 */
public final class CartContent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:event.CartContent)
    CartContentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CartContent.newBuilder() to construct.
  private CartContent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CartContent() {
    contentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CartContent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CartContent(
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

            contentId_ = s;
            break;
          }
          case 16: {

            quantity_ = input.readInt64();
            break;
          }
          case 26: {
            ai.promoted.proto.common.Money.Builder subBuilder = null;
            if (pricePerUnit_ != null) {
              subBuilder = pricePerUnit_.toBuilder();
            }
            pricePerUnit_ = input.readMessage(ai.promoted.proto.common.Money.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pricePerUnit_);
              pricePerUnit_ = subBuilder.buildPartial();
            }

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
    return ai.promoted.proto.event.Event.internal_static_event_CartContent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.promoted.proto.event.Event.internal_static_event_CartContent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.promoted.proto.event.CartContent.class, ai.promoted.proto.event.CartContent.Builder.class);
  }

  public static final int CONTENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object contentId_;
  /**
   * <code>string content_id = 1 [json_name = "contentId"];</code>
   * @return The contentId.
   */
  @java.lang.Override
  public java.lang.String getContentId() {
    java.lang.Object ref = contentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentId_ = s;
      return s;
    }
  }
  /**
   * <code>string content_id = 1 [json_name = "contentId"];</code>
   * @return The bytes for contentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentIdBytes() {
    java.lang.Object ref = contentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      contentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private long quantity_;
  /**
   * <code>int64 quantity = 2 [json_name = "quantity"];</code>
   * @return The quantity.
   */
  @java.lang.Override
  public long getQuantity() {
    return quantity_;
  }

  public static final int PRICE_PER_UNIT_FIELD_NUMBER = 3;
  private ai.promoted.proto.common.Money pricePerUnit_;
  /**
   * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
   * @return Whether the pricePerUnit field is set.
   */
  @java.lang.Override
  public boolean hasPricePerUnit() {
    return pricePerUnit_ != null;
  }
  /**
   * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
   * @return The pricePerUnit.
   */
  @java.lang.Override
  public ai.promoted.proto.common.Money getPricePerUnit() {
    return pricePerUnit_ == null ? ai.promoted.proto.common.Money.getDefaultInstance() : pricePerUnit_;
  }
  /**
   * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
   */
  @java.lang.Override
  public ai.promoted.proto.common.MoneyOrBuilder getPricePerUnitOrBuilder() {
    return getPricePerUnit();
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
    if (!getContentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contentId_);
    }
    if (quantity_ != 0L) {
      output.writeInt64(2, quantity_);
    }
    if (pricePerUnit_ != null) {
      output.writeMessage(3, getPricePerUnit());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getContentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contentId_);
    }
    if (quantity_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, quantity_);
    }
    if (pricePerUnit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPricePerUnit());
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
    if (!(obj instanceof ai.promoted.proto.event.CartContent)) {
      return super.equals(obj);
    }
    ai.promoted.proto.event.CartContent other = (ai.promoted.proto.event.CartContent) obj;

    if (!getContentId()
        .equals(other.getContentId())) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
    if (hasPricePerUnit() != other.hasPricePerUnit()) return false;
    if (hasPricePerUnit()) {
      if (!getPricePerUnit()
          .equals(other.getPricePerUnit())) return false;
    }
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
    hash = (37 * hash) + CONTENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getContentId().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuantity());
    if (hasPricePerUnit()) {
      hash = (37 * hash) + PRICE_PER_UNIT_FIELD_NUMBER;
      hash = (53 * hash) + getPricePerUnit().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.promoted.proto.event.CartContent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.event.CartContent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.event.CartContent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.event.CartContent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.event.CartContent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.event.CartContent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.event.CartContent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.event.CartContent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.event.CartContent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.event.CartContent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.event.CartContent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.event.CartContent parseFrom(
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
  public static Builder newBuilder(ai.promoted.proto.event.CartContent prototype) {
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
   * Protobuf type {@code event.CartContent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:event.CartContent)
      ai.promoted.proto.event.CartContentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.promoted.proto.event.Event.internal_static_event_CartContent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.promoted.proto.event.Event.internal_static_event_CartContent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.promoted.proto.event.CartContent.class, ai.promoted.proto.event.CartContent.Builder.class);
    }

    // Construct using ai.promoted.proto.event.CartContent.newBuilder()
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
      contentId_ = "";

      quantity_ = 0L;

      if (pricePerUnitBuilder_ == null) {
        pricePerUnit_ = null;
      } else {
        pricePerUnit_ = null;
        pricePerUnitBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.promoted.proto.event.Event.internal_static_event_CartContent_descriptor;
    }

    @java.lang.Override
    public ai.promoted.proto.event.CartContent getDefaultInstanceForType() {
      return ai.promoted.proto.event.CartContent.getDefaultInstance();
    }

    @java.lang.Override
    public ai.promoted.proto.event.CartContent build() {
      ai.promoted.proto.event.CartContent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.promoted.proto.event.CartContent buildPartial() {
      ai.promoted.proto.event.CartContent result = new ai.promoted.proto.event.CartContent(this);
      result.contentId_ = contentId_;
      result.quantity_ = quantity_;
      if (pricePerUnitBuilder_ == null) {
        result.pricePerUnit_ = pricePerUnit_;
      } else {
        result.pricePerUnit_ = pricePerUnitBuilder_.build();
      }
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
      if (other instanceof ai.promoted.proto.event.CartContent) {
        return mergeFrom((ai.promoted.proto.event.CartContent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.promoted.proto.event.CartContent other) {
      if (other == ai.promoted.proto.event.CartContent.getDefaultInstance()) return this;
      if (!other.getContentId().isEmpty()) {
        contentId_ = other.contentId_;
        onChanged();
      }
      if (other.getQuantity() != 0L) {
        setQuantity(other.getQuantity());
      }
      if (other.hasPricePerUnit()) {
        mergePricePerUnit(other.getPricePerUnit());
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
      ai.promoted.proto.event.CartContent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.promoted.proto.event.CartContent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object contentId_ = "";
    /**
     * <code>string content_id = 1 [json_name = "contentId"];</code>
     * @return The contentId.
     */
    public java.lang.String getContentId() {
      java.lang.Object ref = contentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content_id = 1 [json_name = "contentId"];</code>
     * @return The bytes for contentId.
     */
    public com.google.protobuf.ByteString
        getContentIdBytes() {
      java.lang.Object ref = contentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        contentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content_id = 1 [json_name = "contentId"];</code>
     * @param value The contentId to set.
     * @return This builder for chaining.
     */
    public Builder setContentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      contentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content_id = 1 [json_name = "contentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContentId() {
      
      contentId_ = getDefaultInstance().getContentId();
      onChanged();
      return this;
    }
    /**
     * <code>string content_id = 1 [json_name = "contentId"];</code>
     * @param value The bytes for contentId to set.
     * @return This builder for chaining.
     */
    public Builder setContentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      contentId_ = value;
      onChanged();
      return this;
    }

    private long quantity_ ;
    /**
     * <code>int64 quantity = 2 [json_name = "quantity"];</code>
     * @return The quantity.
     */
    @java.lang.Override
    public long getQuantity() {
      return quantity_;
    }
    /**
     * <code>int64 quantity = 2 [json_name = "quantity"];</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(long value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 quantity = 2 [json_name = "quantity"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      
      quantity_ = 0L;
      onChanged();
      return this;
    }

    private ai.promoted.proto.common.Money pricePerUnit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.promoted.proto.common.Money, ai.promoted.proto.common.Money.Builder, ai.promoted.proto.common.MoneyOrBuilder> pricePerUnitBuilder_;
    /**
     * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
     * @return Whether the pricePerUnit field is set.
     */
    public boolean hasPricePerUnit() {
      return pricePerUnitBuilder_ != null || pricePerUnit_ != null;
    }
    /**
     * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
     * @return The pricePerUnit.
     */
    public ai.promoted.proto.common.Money getPricePerUnit() {
      if (pricePerUnitBuilder_ == null) {
        return pricePerUnit_ == null ? ai.promoted.proto.common.Money.getDefaultInstance() : pricePerUnit_;
      } else {
        return pricePerUnitBuilder_.getMessage();
      }
    }
    /**
     * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
     */
    public Builder setPricePerUnit(ai.promoted.proto.common.Money value) {
      if (pricePerUnitBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pricePerUnit_ = value;
        onChanged();
      } else {
        pricePerUnitBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
     */
    public Builder setPricePerUnit(
        ai.promoted.proto.common.Money.Builder builderForValue) {
      if (pricePerUnitBuilder_ == null) {
        pricePerUnit_ = builderForValue.build();
        onChanged();
      } else {
        pricePerUnitBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
     */
    public Builder mergePricePerUnit(ai.promoted.proto.common.Money value) {
      if (pricePerUnitBuilder_ == null) {
        if (pricePerUnit_ != null) {
          pricePerUnit_ =
            ai.promoted.proto.common.Money.newBuilder(pricePerUnit_).mergeFrom(value).buildPartial();
        } else {
          pricePerUnit_ = value;
        }
        onChanged();
      } else {
        pricePerUnitBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
     */
    public Builder clearPricePerUnit() {
      if (pricePerUnitBuilder_ == null) {
        pricePerUnit_ = null;
        onChanged();
      } else {
        pricePerUnit_ = null;
        pricePerUnitBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
     */
    public ai.promoted.proto.common.Money.Builder getPricePerUnitBuilder() {
      
      onChanged();
      return getPricePerUnitFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
     */
    public ai.promoted.proto.common.MoneyOrBuilder getPricePerUnitOrBuilder() {
      if (pricePerUnitBuilder_ != null) {
        return pricePerUnitBuilder_.getMessageOrBuilder();
      } else {
        return pricePerUnit_ == null ?
            ai.promoted.proto.common.Money.getDefaultInstance() : pricePerUnit_;
      }
    }
    /**
     * <code>.common.Money price_per_unit = 3 [json_name = "pricePerUnit"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.promoted.proto.common.Money, ai.promoted.proto.common.Money.Builder, ai.promoted.proto.common.MoneyOrBuilder> 
        getPricePerUnitFieldBuilder() {
      if (pricePerUnitBuilder_ == null) {
        pricePerUnitBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.promoted.proto.common.Money, ai.promoted.proto.common.Money.Builder, ai.promoted.proto.common.MoneyOrBuilder>(
                getPricePerUnit(),
                getParentForChildren(),
                isClean());
        pricePerUnit_ = null;
      }
      return pricePerUnitBuilder_;
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


    // @@protoc_insertion_point(builder_scope:event.CartContent)
  }

  // @@protoc_insertion_point(class_scope:event.CartContent)
  private static final ai.promoted.proto.event.CartContent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.promoted.proto.event.CartContent();
  }

  public static ai.promoted.proto.event.CartContent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CartContent>
      PARSER = new com.google.protobuf.AbstractParser<CartContent>() {
    @java.lang.Override
    public CartContent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CartContent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CartContent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CartContent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.promoted.proto.event.CartContent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

