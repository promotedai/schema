// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/blender.proto

package ai.promoted.proto.delivery;

/**
 * Protobuf type {@code delivery.BlenderSortKey}
 */
public final class BlenderSortKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:delivery.BlenderSortKey)
    BlenderSortKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlenderSortKey.newBuilder() to construct.
  private BlenderSortKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlenderSortKey() {
    elements_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlenderSortKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlenderSortKey(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              elements_ = new java.util.ArrayList<ai.promoted.proto.delivery.BlenderExpression>();
              mutable_bitField0_ |= 0x00000001;
            }
            elements_.add(
                input.readMessage(ai.promoted.proto.delivery.BlenderExpression.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        elements_ = java.util.Collections.unmodifiableList(elements_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderSortKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderSortKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.promoted.proto.delivery.BlenderSortKey.class, ai.promoted.proto.delivery.BlenderSortKey.Builder.class);
  }

  public static final int ELEMENTS_FIELD_NUMBER = 1;
  private java.util.List<ai.promoted.proto.delivery.BlenderExpression> elements_;
  /**
   * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.promoted.proto.delivery.BlenderExpression> getElementsList() {
    return elements_;
  }
  /**
   * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.promoted.proto.delivery.BlenderExpressionOrBuilder> 
      getElementsOrBuilderList() {
    return elements_;
  }
  /**
   * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public int getElementsCount() {
    return elements_.size();
  }
  /**
   * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public ai.promoted.proto.delivery.BlenderExpression getElements(int index) {
    return elements_.get(index);
  }
  /**
   * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
   */
  @java.lang.Override
  public ai.promoted.proto.delivery.BlenderExpressionOrBuilder getElementsOrBuilder(
      int index) {
    return elements_.get(index);
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
    for (int i = 0; i < elements_.size(); i++) {
      output.writeMessage(1, elements_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < elements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, elements_.get(i));
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
    if (!(obj instanceof ai.promoted.proto.delivery.BlenderSortKey)) {
      return super.equals(obj);
    }
    ai.promoted.proto.delivery.BlenderSortKey other = (ai.promoted.proto.delivery.BlenderSortKey) obj;

    if (!getElementsList()
        .equals(other.getElementsList())) return false;
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
    if (getElementsCount() > 0) {
      hash = (37 * hash) + ELEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getElementsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.BlenderSortKey parseFrom(
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
  public static Builder newBuilder(ai.promoted.proto.delivery.BlenderSortKey prototype) {
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
   * Protobuf type {@code delivery.BlenderSortKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:delivery.BlenderSortKey)
      ai.promoted.proto.delivery.BlenderSortKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderSortKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderSortKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.promoted.proto.delivery.BlenderSortKey.class, ai.promoted.proto.delivery.BlenderSortKey.Builder.class);
    }

    // Construct using ai.promoted.proto.delivery.BlenderSortKey.newBuilder()
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
        getElementsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (elementsBuilder_ == null) {
        elements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        elementsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderSortKey_descriptor;
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.BlenderSortKey getDefaultInstanceForType() {
      return ai.promoted.proto.delivery.BlenderSortKey.getDefaultInstance();
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.BlenderSortKey build() {
      ai.promoted.proto.delivery.BlenderSortKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.BlenderSortKey buildPartial() {
      ai.promoted.proto.delivery.BlenderSortKey result = new ai.promoted.proto.delivery.BlenderSortKey(this);
      int from_bitField0_ = bitField0_;
      if (elementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          elements_ = java.util.Collections.unmodifiableList(elements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.elements_ = elements_;
      } else {
        result.elements_ = elementsBuilder_.build();
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
      if (other instanceof ai.promoted.proto.delivery.BlenderSortKey) {
        return mergeFrom((ai.promoted.proto.delivery.BlenderSortKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.promoted.proto.delivery.BlenderSortKey other) {
      if (other == ai.promoted.proto.delivery.BlenderSortKey.getDefaultInstance()) return this;
      if (elementsBuilder_ == null) {
        if (!other.elements_.isEmpty()) {
          if (elements_.isEmpty()) {
            elements_ = other.elements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureElementsIsMutable();
            elements_.addAll(other.elements_);
          }
          onChanged();
        }
      } else {
        if (!other.elements_.isEmpty()) {
          if (elementsBuilder_.isEmpty()) {
            elementsBuilder_.dispose();
            elementsBuilder_ = null;
            elements_ = other.elements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            elementsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getElementsFieldBuilder() : null;
          } else {
            elementsBuilder_.addAllMessages(other.elements_);
          }
        }
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
      ai.promoted.proto.delivery.BlenderSortKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.promoted.proto.delivery.BlenderSortKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ai.promoted.proto.delivery.BlenderExpression> elements_ =
      java.util.Collections.emptyList();
    private void ensureElementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        elements_ = new java.util.ArrayList<ai.promoted.proto.delivery.BlenderExpression>(elements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.promoted.proto.delivery.BlenderExpression, ai.promoted.proto.delivery.BlenderExpression.Builder, ai.promoted.proto.delivery.BlenderExpressionOrBuilder> elementsBuilder_;

    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public java.util.List<ai.promoted.proto.delivery.BlenderExpression> getElementsList() {
      if (elementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(elements_);
      } else {
        return elementsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public int getElementsCount() {
      if (elementsBuilder_ == null) {
        return elements_.size();
      } else {
        return elementsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpression getElements(int index) {
      if (elementsBuilder_ == null) {
        return elements_.get(index);
      } else {
        return elementsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public Builder setElements(
        int index, ai.promoted.proto.delivery.BlenderExpression value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.set(index, value);
        onChanged();
      } else {
        elementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public Builder setElements(
        int index, ai.promoted.proto.delivery.BlenderExpression.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.set(index, builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(ai.promoted.proto.delivery.BlenderExpression value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.add(value);
        onChanged();
      } else {
        elementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(
        int index, ai.promoted.proto.delivery.BlenderExpression value) {
      if (elementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementsIsMutable();
        elements_.add(index, value);
        onChanged();
      } else {
        elementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(
        ai.promoted.proto.delivery.BlenderExpression.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.add(builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public Builder addElements(
        int index, ai.promoted.proto.delivery.BlenderExpression.Builder builderForValue) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.add(index, builderForValue.build());
        onChanged();
      } else {
        elementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public Builder addAllElements(
        java.lang.Iterable<? extends ai.promoted.proto.delivery.BlenderExpression> values) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, elements_);
        onChanged();
      } else {
        elementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public Builder clearElements() {
      if (elementsBuilder_ == null) {
        elements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        elementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public Builder removeElements(int index) {
      if (elementsBuilder_ == null) {
        ensureElementsIsMutable();
        elements_.remove(index);
        onChanged();
      } else {
        elementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpression.Builder getElementsBuilder(
        int index) {
      return getElementsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpressionOrBuilder getElementsOrBuilder(
        int index) {
      if (elementsBuilder_ == null) {
        return elements_.get(index);  } else {
        return elementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public java.util.List<? extends ai.promoted.proto.delivery.BlenderExpressionOrBuilder> 
         getElementsOrBuilderList() {
      if (elementsBuilder_ != null) {
        return elementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(elements_);
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpression.Builder addElementsBuilder() {
      return getElementsFieldBuilder().addBuilder(
          ai.promoted.proto.delivery.BlenderExpression.getDefaultInstance());
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpression.Builder addElementsBuilder(
        int index) {
      return getElementsFieldBuilder().addBuilder(
          index, ai.promoted.proto.delivery.BlenderExpression.getDefaultInstance());
    }
    /**
     * <code>repeated .delivery.BlenderExpression elements = 1 [json_name = "elements"];</code>
     */
    public java.util.List<ai.promoted.proto.delivery.BlenderExpression.Builder> 
         getElementsBuilderList() {
      return getElementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.promoted.proto.delivery.BlenderExpression, ai.promoted.proto.delivery.BlenderExpression.Builder, ai.promoted.proto.delivery.BlenderExpressionOrBuilder> 
        getElementsFieldBuilder() {
      if (elementsBuilder_ == null) {
        elementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.promoted.proto.delivery.BlenderExpression, ai.promoted.proto.delivery.BlenderExpression.Builder, ai.promoted.proto.delivery.BlenderExpressionOrBuilder>(
                elements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        elements_ = null;
      }
      return elementsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:delivery.BlenderSortKey)
  }

  // @@protoc_insertion_point(class_scope:delivery.BlenderSortKey)
  private static final ai.promoted.proto.delivery.BlenderSortKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.promoted.proto.delivery.BlenderSortKey();
  }

  public static ai.promoted.proto.delivery.BlenderSortKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlenderSortKey>
      PARSER = new com.google.protobuf.AbstractParser<BlenderSortKey>() {
    @java.lang.Override
    public BlenderSortKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlenderSortKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlenderSortKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlenderSortKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.promoted.proto.delivery.BlenderSortKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
