// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/common/common.proto

package ai.promoted.proto.common;

/**
 * Protobuf type {@code common.Screen}
 */
public final class Screen extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.Screen)
    ScreenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Screen.newBuilder() to construct.
  private Screen(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Screen() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Screen();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Screen(
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
            ai.promoted.proto.common.Size.Builder subBuilder = null;
            if (size_ != null) {
              subBuilder = size_.toBuilder();
            }
            size_ = input.readMessage(ai.promoted.proto.common.Size.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(size_);
              size_ = subBuilder.buildPartial();
            }

            break;
          }
          case 21: {

            scale_ = input.readFloat();
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
    return ai.promoted.proto.common.CommonProto.internal_static_common_Screen_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.promoted.proto.common.CommonProto.internal_static_common_Screen_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.promoted.proto.common.Screen.class, ai.promoted.proto.common.Screen.Builder.class);
  }

  public static final int SIZE_FIELD_NUMBER = 1;
  private ai.promoted.proto.common.Size size_;
  /**
   * <code>.common.Size size = 1 [json_name = "size"];</code>
   * @return Whether the size field is set.
   */
  @java.lang.Override
  public boolean hasSize() {
    return size_ != null;
  }
  /**
   * <code>.common.Size size = 1 [json_name = "size"];</code>
   * @return The size.
   */
  @java.lang.Override
  public ai.promoted.proto.common.Size getSize() {
    return size_ == null ? ai.promoted.proto.common.Size.getDefaultInstance() : size_;
  }
  /**
   * <code>.common.Size size = 1 [json_name = "size"];</code>
   */
  @java.lang.Override
  public ai.promoted.proto.common.SizeOrBuilder getSizeOrBuilder() {
    return getSize();
  }

  public static final int SCALE_FIELD_NUMBER = 2;
  private float scale_;
  /**
   * <code>float scale = 2 [json_name = "scale"];</code>
   * @return The scale.
   */
  @java.lang.Override
  public float getScale() {
    return scale_;
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
    if (size_ != null) {
      output.writeMessage(1, getSize());
    }
    if (scale_ != 0F) {
      output.writeFloat(2, scale_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (size_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSize());
    }
    if (scale_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, scale_);
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
    if (!(obj instanceof ai.promoted.proto.common.Screen)) {
      return super.equals(obj);
    }
    ai.promoted.proto.common.Screen other = (ai.promoted.proto.common.Screen) obj;

    if (hasSize() != other.hasSize()) return false;
    if (hasSize()) {
      if (!getSize()
          .equals(other.getSize())) return false;
    }
    if (java.lang.Float.floatToIntBits(getScale())
        != java.lang.Float.floatToIntBits(
            other.getScale())) return false;
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
    if (hasSize()) {
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getSize().hashCode();
    }
    hash = (37 * hash) + SCALE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScale());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.promoted.proto.common.Screen parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.common.Screen parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.common.Screen parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.common.Screen parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.common.Screen parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.common.Screen parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.common.Screen parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.common.Screen parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.common.Screen parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.common.Screen parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.common.Screen parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.common.Screen parseFrom(
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
  public static Builder newBuilder(ai.promoted.proto.common.Screen prototype) {
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
   * Protobuf type {@code common.Screen}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.Screen)
      ai.promoted.proto.common.ScreenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.promoted.proto.common.CommonProto.internal_static_common_Screen_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.promoted.proto.common.CommonProto.internal_static_common_Screen_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.promoted.proto.common.Screen.class, ai.promoted.proto.common.Screen.Builder.class);
    }

    // Construct using ai.promoted.proto.common.Screen.newBuilder()
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
      if (sizeBuilder_ == null) {
        size_ = null;
      } else {
        size_ = null;
        sizeBuilder_ = null;
      }
      scale_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.promoted.proto.common.CommonProto.internal_static_common_Screen_descriptor;
    }

    @java.lang.Override
    public ai.promoted.proto.common.Screen getDefaultInstanceForType() {
      return ai.promoted.proto.common.Screen.getDefaultInstance();
    }

    @java.lang.Override
    public ai.promoted.proto.common.Screen build() {
      ai.promoted.proto.common.Screen result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.promoted.proto.common.Screen buildPartial() {
      ai.promoted.proto.common.Screen result = new ai.promoted.proto.common.Screen(this);
      if (sizeBuilder_ == null) {
        result.size_ = size_;
      } else {
        result.size_ = sizeBuilder_.build();
      }
      result.scale_ = scale_;
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
      if (other instanceof ai.promoted.proto.common.Screen) {
        return mergeFrom((ai.promoted.proto.common.Screen)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.promoted.proto.common.Screen other) {
      if (other == ai.promoted.proto.common.Screen.getDefaultInstance()) return this;
      if (other.hasSize()) {
        mergeSize(other.getSize());
      }
      if (other.getScale() != 0F) {
        setScale(other.getScale());
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
      ai.promoted.proto.common.Screen parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.promoted.proto.common.Screen) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ai.promoted.proto.common.Size size_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.promoted.proto.common.Size, ai.promoted.proto.common.Size.Builder, ai.promoted.proto.common.SizeOrBuilder> sizeBuilder_;
    /**
     * <code>.common.Size size = 1 [json_name = "size"];</code>
     * @return Whether the size field is set.
     */
    public boolean hasSize() {
      return sizeBuilder_ != null || size_ != null;
    }
    /**
     * <code>.common.Size size = 1 [json_name = "size"];</code>
     * @return The size.
     */
    public ai.promoted.proto.common.Size getSize() {
      if (sizeBuilder_ == null) {
        return size_ == null ? ai.promoted.proto.common.Size.getDefaultInstance() : size_;
      } else {
        return sizeBuilder_.getMessage();
      }
    }
    /**
     * <code>.common.Size size = 1 [json_name = "size"];</code>
     */
    public Builder setSize(ai.promoted.proto.common.Size value) {
      if (sizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        size_ = value;
        onChanged();
      } else {
        sizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.common.Size size = 1 [json_name = "size"];</code>
     */
    public Builder setSize(
        ai.promoted.proto.common.Size.Builder builderForValue) {
      if (sizeBuilder_ == null) {
        size_ = builderForValue.build();
        onChanged();
      } else {
        sizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.common.Size size = 1 [json_name = "size"];</code>
     */
    public Builder mergeSize(ai.promoted.proto.common.Size value) {
      if (sizeBuilder_ == null) {
        if (size_ != null) {
          size_ =
            ai.promoted.proto.common.Size.newBuilder(size_).mergeFrom(value).buildPartial();
        } else {
          size_ = value;
        }
        onChanged();
      } else {
        sizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.common.Size size = 1 [json_name = "size"];</code>
     */
    public Builder clearSize() {
      if (sizeBuilder_ == null) {
        size_ = null;
        onChanged();
      } else {
        size_ = null;
        sizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.common.Size size = 1 [json_name = "size"];</code>
     */
    public ai.promoted.proto.common.Size.Builder getSizeBuilder() {
      
      onChanged();
      return getSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.Size size = 1 [json_name = "size"];</code>
     */
    public ai.promoted.proto.common.SizeOrBuilder getSizeOrBuilder() {
      if (sizeBuilder_ != null) {
        return sizeBuilder_.getMessageOrBuilder();
      } else {
        return size_ == null ?
            ai.promoted.proto.common.Size.getDefaultInstance() : size_;
      }
    }
    /**
     * <code>.common.Size size = 1 [json_name = "size"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.promoted.proto.common.Size, ai.promoted.proto.common.Size.Builder, ai.promoted.proto.common.SizeOrBuilder> 
        getSizeFieldBuilder() {
      if (sizeBuilder_ == null) {
        sizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.promoted.proto.common.Size, ai.promoted.proto.common.Size.Builder, ai.promoted.proto.common.SizeOrBuilder>(
                getSize(),
                getParentForChildren(),
                isClean());
        size_ = null;
      }
      return sizeBuilder_;
    }

    private float scale_ ;
    /**
     * <code>float scale = 2 [json_name = "scale"];</code>
     * @return The scale.
     */
    @java.lang.Override
    public float getScale() {
      return scale_;
    }
    /**
     * <code>float scale = 2 [json_name = "scale"];</code>
     * @param value The scale to set.
     * @return This builder for chaining.
     */
    public Builder setScale(float value) {
      
      scale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float scale = 2 [json_name = "scale"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScale() {
      
      scale_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:common.Screen)
  }

  // @@protoc_insertion_point(class_scope:common.Screen)
  private static final ai.promoted.proto.common.Screen DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.promoted.proto.common.Screen();
  }

  public static ai.promoted.proto.common.Screen getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Screen>
      PARSER = new com.google.protobuf.AbstractParser<Screen>() {
    @java.lang.Override
    public Screen parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Screen(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Screen> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Screen> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.promoted.proto.common.Screen getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
