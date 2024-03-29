// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/blender.proto

package ai.promoted.proto.delivery;

/**
 * Protobuf type {@code delivery.HyperloopUniformMultiGenerator}
 */
public final class HyperloopUniformMultiGenerator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:delivery.HyperloopUniformMultiGenerator)
    HyperloopUniformMultiGeneratorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HyperloopUniformMultiGenerator.newBuilder() to construct.
  private HyperloopUniformMultiGenerator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HyperloopUniformMultiGenerator() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HyperloopUniformMultiGenerator();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HyperloopUniformMultiGenerator(
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
          case 13: {

            base_ = input.readFloat();
            break;
          }
          case 21: {

            multi_ = input.readFloat();
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
    return ai.promoted.proto.delivery.Blender.internal_static_delivery_HyperloopUniformMultiGenerator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.promoted.proto.delivery.Blender.internal_static_delivery_HyperloopUniformMultiGenerator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.promoted.proto.delivery.HyperloopUniformMultiGenerator.class, ai.promoted.proto.delivery.HyperloopUniformMultiGenerator.Builder.class);
  }

  public static final int BASE_FIELD_NUMBER = 1;
  private float base_;
  /**
   * <code>float base = 1 [json_name = "base"];</code>
   * @return The base.
   */
  @java.lang.Override
  public float getBase() {
    return base_;
  }

  public static final int MULTI_FIELD_NUMBER = 2;
  private float multi_;
  /**
   * <code>float multi = 2 [json_name = "multi"];</code>
   * @return The multi.
   */
  @java.lang.Override
  public float getMulti() {
    return multi_;
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
    if (base_ != 0F) {
      output.writeFloat(1, base_);
    }
    if (multi_ != 0F) {
      output.writeFloat(2, multi_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (base_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, base_);
    }
    if (multi_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, multi_);
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
    if (!(obj instanceof ai.promoted.proto.delivery.HyperloopUniformMultiGenerator)) {
      return super.equals(obj);
    }
    ai.promoted.proto.delivery.HyperloopUniformMultiGenerator other = (ai.promoted.proto.delivery.HyperloopUniformMultiGenerator) obj;

    if (java.lang.Float.floatToIntBits(getBase())
        != java.lang.Float.floatToIntBits(
            other.getBase())) return false;
    if (java.lang.Float.floatToIntBits(getMulti())
        != java.lang.Float.floatToIntBits(
            other.getMulti())) return false;
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
    hash = (37 * hash) + BASE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBase());
    hash = (37 * hash) + MULTI_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getMulti());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parseFrom(
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
  public static Builder newBuilder(ai.promoted.proto.delivery.HyperloopUniformMultiGenerator prototype) {
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
   * Protobuf type {@code delivery.HyperloopUniformMultiGenerator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:delivery.HyperloopUniformMultiGenerator)
      ai.promoted.proto.delivery.HyperloopUniformMultiGeneratorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.promoted.proto.delivery.Blender.internal_static_delivery_HyperloopUniformMultiGenerator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.promoted.proto.delivery.Blender.internal_static_delivery_HyperloopUniformMultiGenerator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.promoted.proto.delivery.HyperloopUniformMultiGenerator.class, ai.promoted.proto.delivery.HyperloopUniformMultiGenerator.Builder.class);
    }

    // Construct using ai.promoted.proto.delivery.HyperloopUniformMultiGenerator.newBuilder()
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
      base_ = 0F;

      multi_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.promoted.proto.delivery.Blender.internal_static_delivery_HyperloopUniformMultiGenerator_descriptor;
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.HyperloopUniformMultiGenerator getDefaultInstanceForType() {
      return ai.promoted.proto.delivery.HyperloopUniformMultiGenerator.getDefaultInstance();
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.HyperloopUniformMultiGenerator build() {
      ai.promoted.proto.delivery.HyperloopUniformMultiGenerator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.HyperloopUniformMultiGenerator buildPartial() {
      ai.promoted.proto.delivery.HyperloopUniformMultiGenerator result = new ai.promoted.proto.delivery.HyperloopUniformMultiGenerator(this);
      result.base_ = base_;
      result.multi_ = multi_;
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
      if (other instanceof ai.promoted.proto.delivery.HyperloopUniformMultiGenerator) {
        return mergeFrom((ai.promoted.proto.delivery.HyperloopUniformMultiGenerator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.promoted.proto.delivery.HyperloopUniformMultiGenerator other) {
      if (other == ai.promoted.proto.delivery.HyperloopUniformMultiGenerator.getDefaultInstance()) return this;
      if (other.getBase() != 0F) {
        setBase(other.getBase());
      }
      if (other.getMulti() != 0F) {
        setMulti(other.getMulti());
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
      ai.promoted.proto.delivery.HyperloopUniformMultiGenerator parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.promoted.proto.delivery.HyperloopUniformMultiGenerator) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float base_ ;
    /**
     * <code>float base = 1 [json_name = "base"];</code>
     * @return The base.
     */
    @java.lang.Override
    public float getBase() {
      return base_;
    }
    /**
     * <code>float base = 1 [json_name = "base"];</code>
     * @param value The base to set.
     * @return This builder for chaining.
     */
    public Builder setBase(float value) {
      
      base_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float base = 1 [json_name = "base"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBase() {
      
      base_ = 0F;
      onChanged();
      return this;
    }

    private float multi_ ;
    /**
     * <code>float multi = 2 [json_name = "multi"];</code>
     * @return The multi.
     */
    @java.lang.Override
    public float getMulti() {
      return multi_;
    }
    /**
     * <code>float multi = 2 [json_name = "multi"];</code>
     * @param value The multi to set.
     * @return This builder for chaining.
     */
    public Builder setMulti(float value) {
      
      multi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float multi = 2 [json_name = "multi"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMulti() {
      
      multi_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:delivery.HyperloopUniformMultiGenerator)
  }

  // @@protoc_insertion_point(class_scope:delivery.HyperloopUniformMultiGenerator)
  private static final ai.promoted.proto.delivery.HyperloopUniformMultiGenerator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.promoted.proto.delivery.HyperloopUniformMultiGenerator();
  }

  public static ai.promoted.proto.delivery.HyperloopUniformMultiGenerator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HyperloopUniformMultiGenerator>
      PARSER = new com.google.protobuf.AbstractParser<HyperloopUniformMultiGenerator>() {
    @java.lang.Override
    public HyperloopUniformMultiGenerator parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HyperloopUniformMultiGenerator(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HyperloopUniformMultiGenerator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HyperloopUniformMultiGenerator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.promoted.proto.delivery.HyperloopUniformMultiGenerator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

