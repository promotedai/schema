// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/common/common.proto

package ai.promoted.proto.common;

/**
 * Protobuf type {@code common.Properties}
 */
public final class Properties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.Properties)
    PropertiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Properties.newBuilder() to construct.
  private Properties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Properties() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Properties();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Properties(
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
            structFieldCase_ = 1;
            structField_ = input.readBytes();
            break;
          }
          case 18: {
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (structFieldCase_ == 2) {
              subBuilder = ((com.google.protobuf.Struct) structField_).toBuilder();
            }
            structField_ =
                input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.google.protobuf.Struct) structField_);
              structField_ = subBuilder.buildPartial();
            }
            structFieldCase_ = 2;
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
    return ai.promoted.proto.common.CommonProto.internal_static_common_Properties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.promoted.proto.common.CommonProto.internal_static_common_Properties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.promoted.proto.common.Properties.class, ai.promoted.proto.common.Properties.Builder.class);
  }

  private int structFieldCase_ = 0;
  private java.lang.Object structField_;
  public enum StructFieldCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STRUCT_BYTES(1),
    STRUCT(2),
    STRUCTFIELD_NOT_SET(0);
    private final int value;
    private StructFieldCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StructFieldCase valueOf(int value) {
      return forNumber(value);
    }

    public static StructFieldCase forNumber(int value) {
      switch (value) {
        case 1: return STRUCT_BYTES;
        case 2: return STRUCT;
        case 0: return STRUCTFIELD_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StructFieldCase
  getStructFieldCase() {
    return StructFieldCase.forNumber(
        structFieldCase_);
  }

  public static final int STRUCT_BYTES_FIELD_NUMBER = 1;
  /**
   * <code>bytes struct_bytes = 1 [json_name = "structBytes"];</code>
   * @return Whether the structBytes field is set.
   */
  @java.lang.Override
  public boolean hasStructBytes() {
    return structFieldCase_ == 1;
  }
  /**
   * <code>bytes struct_bytes = 1 [json_name = "structBytes"];</code>
   * @return The structBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStructBytes() {
    if (structFieldCase_ == 1) {
      return (com.google.protobuf.ByteString) structField_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int STRUCT_FIELD_NUMBER = 2;
  /**
   * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
   * @return Whether the struct field is set.
   */
  @java.lang.Override
  public boolean hasStruct() {
    return structFieldCase_ == 2;
  }
  /**
   * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
   * @return The struct.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getStruct() {
    if (structFieldCase_ == 2) {
       return (com.google.protobuf.Struct) structField_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
  }
  /**
   * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getStructOrBuilder() {
    if (structFieldCase_ == 2) {
       return (com.google.protobuf.Struct) structField_;
    }
    return com.google.protobuf.Struct.getDefaultInstance();
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
    if (structFieldCase_ == 1) {
      output.writeBytes(
          1, (com.google.protobuf.ByteString) structField_);
    }
    if (structFieldCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.Struct) structField_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (structFieldCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            1, (com.google.protobuf.ByteString) structField_);
    }
    if (structFieldCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.protobuf.Struct) structField_);
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
    if (!(obj instanceof ai.promoted.proto.common.Properties)) {
      return super.equals(obj);
    }
    ai.promoted.proto.common.Properties other = (ai.promoted.proto.common.Properties) obj;

    if (!getStructFieldCase().equals(other.getStructFieldCase())) return false;
    switch (structFieldCase_) {
      case 1:
        if (!getStructBytes()
            .equals(other.getStructBytes())) return false;
        break;
      case 2:
        if (!getStruct()
            .equals(other.getStruct())) return false;
        break;
      case 0:
      default:
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
    switch (structFieldCase_) {
      case 1:
        hash = (37 * hash) + STRUCT_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + getStructBytes().hashCode();
        break;
      case 2:
        hash = (37 * hash) + STRUCT_FIELD_NUMBER;
        hash = (53 * hash) + getStruct().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.promoted.proto.common.Properties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.common.Properties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.common.Properties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.common.Properties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.common.Properties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.common.Properties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.common.Properties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.common.Properties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.common.Properties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.common.Properties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.common.Properties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.common.Properties parseFrom(
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
  public static Builder newBuilder(ai.promoted.proto.common.Properties prototype) {
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
   * Protobuf type {@code common.Properties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.Properties)
      ai.promoted.proto.common.PropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.promoted.proto.common.CommonProto.internal_static_common_Properties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.promoted.proto.common.CommonProto.internal_static_common_Properties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.promoted.proto.common.Properties.class, ai.promoted.proto.common.Properties.Builder.class);
    }

    // Construct using ai.promoted.proto.common.Properties.newBuilder()
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
      structFieldCase_ = 0;
      structField_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.promoted.proto.common.CommonProto.internal_static_common_Properties_descriptor;
    }

    @java.lang.Override
    public ai.promoted.proto.common.Properties getDefaultInstanceForType() {
      return ai.promoted.proto.common.Properties.getDefaultInstance();
    }

    @java.lang.Override
    public ai.promoted.proto.common.Properties build() {
      ai.promoted.proto.common.Properties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.promoted.proto.common.Properties buildPartial() {
      ai.promoted.proto.common.Properties result = new ai.promoted.proto.common.Properties(this);
      if (structFieldCase_ == 1) {
        result.structField_ = structField_;
      }
      if (structFieldCase_ == 2) {
        if (structBuilder_ == null) {
          result.structField_ = structField_;
        } else {
          result.structField_ = structBuilder_.build();
        }
      }
      result.structFieldCase_ = structFieldCase_;
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
      if (other instanceof ai.promoted.proto.common.Properties) {
        return mergeFrom((ai.promoted.proto.common.Properties)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.promoted.proto.common.Properties other) {
      if (other == ai.promoted.proto.common.Properties.getDefaultInstance()) return this;
      switch (other.getStructFieldCase()) {
        case STRUCT_BYTES: {
          setStructBytes(other.getStructBytes());
          break;
        }
        case STRUCT: {
          mergeStruct(other.getStruct());
          break;
        }
        case STRUCTFIELD_NOT_SET: {
          break;
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
      ai.promoted.proto.common.Properties parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.promoted.proto.common.Properties) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int structFieldCase_ = 0;
    private java.lang.Object structField_;
    public StructFieldCase
        getStructFieldCase() {
      return StructFieldCase.forNumber(
          structFieldCase_);
    }

    public Builder clearStructField() {
      structFieldCase_ = 0;
      structField_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>bytes struct_bytes = 1 [json_name = "structBytes"];</code>
     * @return Whether the structBytes field is set.
     */
    public boolean hasStructBytes() {
      return structFieldCase_ == 1;
    }
    /**
     * <code>bytes struct_bytes = 1 [json_name = "structBytes"];</code>
     * @return The structBytes.
     */
    public com.google.protobuf.ByteString getStructBytes() {
      if (structFieldCase_ == 1) {
        return (com.google.protobuf.ByteString) structField_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes struct_bytes = 1 [json_name = "structBytes"];</code>
     * @param value The structBytes to set.
     * @return This builder for chaining.
     */
    public Builder setStructBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  structFieldCase_ = 1;
      structField_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes struct_bytes = 1 [json_name = "structBytes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStructBytes() {
      if (structFieldCase_ == 1) {
        structFieldCase_ = 0;
        structField_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> structBuilder_;
    /**
     * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
     * @return Whether the struct field is set.
     */
    @java.lang.Override
    public boolean hasStruct() {
      return structFieldCase_ == 2;
    }
    /**
     * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
     * @return The struct.
     */
    @java.lang.Override
    public com.google.protobuf.Struct getStruct() {
      if (structBuilder_ == null) {
        if (structFieldCase_ == 2) {
          return (com.google.protobuf.Struct) structField_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      } else {
        if (structFieldCase_ == 2) {
          return structBuilder_.getMessage();
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
     */
    public Builder setStruct(com.google.protobuf.Struct value) {
      if (structBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        structField_ = value;
        onChanged();
      } else {
        structBuilder_.setMessage(value);
      }
      structFieldCase_ = 2;
      return this;
    }
    /**
     * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
     */
    public Builder setStruct(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (structBuilder_ == null) {
        structField_ = builderForValue.build();
        onChanged();
      } else {
        structBuilder_.setMessage(builderForValue.build());
      }
      structFieldCase_ = 2;
      return this;
    }
    /**
     * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
     */
    public Builder mergeStruct(com.google.protobuf.Struct value) {
      if (structBuilder_ == null) {
        if (structFieldCase_ == 2 &&
            structField_ != com.google.protobuf.Struct.getDefaultInstance()) {
          structField_ = com.google.protobuf.Struct.newBuilder((com.google.protobuf.Struct) structField_)
              .mergeFrom(value).buildPartial();
        } else {
          structField_ = value;
        }
        onChanged();
      } else {
        if (structFieldCase_ == 2) {
          structBuilder_.mergeFrom(value);
        }
        structBuilder_.setMessage(value);
      }
      structFieldCase_ = 2;
      return this;
    }
    /**
     * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
     */
    public Builder clearStruct() {
      if (structBuilder_ == null) {
        if (structFieldCase_ == 2) {
          structFieldCase_ = 0;
          structField_ = null;
          onChanged();
        }
      } else {
        if (structFieldCase_ == 2) {
          structFieldCase_ = 0;
          structField_ = null;
        }
        structBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
     */
    public com.google.protobuf.Struct.Builder getStructBuilder() {
      return getStructFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.StructOrBuilder getStructOrBuilder() {
      if ((structFieldCase_ == 2) && (structBuilder_ != null)) {
        return structBuilder_.getMessageOrBuilder();
      } else {
        if (structFieldCase_ == 2) {
          return (com.google.protobuf.Struct) structField_;
        }
        return com.google.protobuf.Struct.getDefaultInstance();
      }
    }
    /**
     * <code>.google.protobuf.Struct struct = 2 [json_name = "struct"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getStructFieldBuilder() {
      if (structBuilder_ == null) {
        if (!(structFieldCase_ == 2)) {
          structField_ = com.google.protobuf.Struct.getDefaultInstance();
        }
        structBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                (com.google.protobuf.Struct) structField_,
                getParentForChildren(),
                isClean());
        structField_ = null;
      }
      structFieldCase_ = 2;
      onChanged();;
      return structBuilder_;
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


    // @@protoc_insertion_point(builder_scope:common.Properties)
  }

  // @@protoc_insertion_point(class_scope:common.Properties)
  private static final ai.promoted.proto.common.Properties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.promoted.proto.common.Properties();
  }

  public static ai.promoted.proto.common.Properties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Properties>
      PARSER = new com.google.protobuf.AbstractParser<Properties>() {
    @java.lang.Override
    public Properties parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Properties(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Properties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Properties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.promoted.proto.common.Properties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
