// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/blender.proto

package ai.promoted.proto.delivery;

/**
 * Protobuf type {@code delivery.BlenderArithmeticExpression}
 */
public final class BlenderArithmeticExpression extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:delivery.BlenderArithmeticExpression)
    BlenderArithmeticExpressionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlenderArithmeticExpression.newBuilder() to construct.
  private BlenderArithmeticExpression(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlenderArithmeticExpression() {
    op_ = 0;
    inputs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlenderArithmeticExpression();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlenderArithmeticExpression(
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
          case 8: {
            int rawValue = input.readEnum();

            op_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              inputs_ = new java.util.ArrayList<ai.promoted.proto.delivery.BlenderExpression>();
              mutable_bitField0_ |= 0x00000001;
            }
            inputs_.add(
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
        inputs_ = java.util.Collections.unmodifiableList(inputs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderArithmeticExpression_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderArithmeticExpression_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.promoted.proto.delivery.BlenderArithmeticExpression.class, ai.promoted.proto.delivery.BlenderArithmeticExpression.Builder.class);
  }

  /**
   * Protobuf enum {@code delivery.BlenderArithmeticExpression.Operator}
   */
  public enum Operator
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>ADD = 1;</code>
     */
    ADD(1),
    /**
     * <code>MULTIPLY = 2;</code>
     */
    MULTIPLY(2),
    /**
     * <code>SUBTRACT = 3;</code>
     */
    SUBTRACT(3),
    /**
     * <code>DIVIDE = 4;</code>
     */
    DIVIDE(4),
    /**
     * <code>MIN = 5;</code>
     */
    MIN(5),
    /**
     * <code>MAX = 6;</code>
     */
    MAX(6),
    /**
     * <code>FLOOR = 7;</code>
     */
    FLOOR(7),
    /**
     * <code>CEILING = 8;</code>
     */
    CEILING(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>ADD = 1;</code>
     */
    public static final int ADD_VALUE = 1;
    /**
     * <code>MULTIPLY = 2;</code>
     */
    public static final int MULTIPLY_VALUE = 2;
    /**
     * <code>SUBTRACT = 3;</code>
     */
    public static final int SUBTRACT_VALUE = 3;
    /**
     * <code>DIVIDE = 4;</code>
     */
    public static final int DIVIDE_VALUE = 4;
    /**
     * <code>MIN = 5;</code>
     */
    public static final int MIN_VALUE = 5;
    /**
     * <code>MAX = 6;</code>
     */
    public static final int MAX_VALUE = 6;
    /**
     * <code>FLOOR = 7;</code>
     */
    public static final int FLOOR_VALUE = 7;
    /**
     * <code>CEILING = 8;</code>
     */
    public static final int CEILING_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operator valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operator forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return ADD;
        case 2: return MULTIPLY;
        case 3: return SUBTRACT;
        case 4: return DIVIDE;
        case 5: return MIN;
        case 6: return MAX;
        case 7: return FLOOR;
        case 8: return CEILING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operator>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operator> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operator>() {
            public Operator findValueByNumber(int number) {
              return Operator.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return ai.promoted.proto.delivery.BlenderArithmeticExpression.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operator[] VALUES = values();

    public static Operator valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operator(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:delivery.BlenderArithmeticExpression.Operator)
  }

  public static final int OP_FIELD_NUMBER = 1;
  private int op_;
  /**
   * <code>.delivery.BlenderArithmeticExpression.Operator op = 1 [json_name = "op"];</code>
   * @return The enum numeric value on the wire for op.
   */
  @java.lang.Override public int getOpValue() {
    return op_;
  }
  /**
   * <code>.delivery.BlenderArithmeticExpression.Operator op = 1 [json_name = "op"];</code>
   * @return The op.
   */
  @java.lang.Override public ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator getOp() {
    @SuppressWarnings("deprecation")
    ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator result = ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator.valueOf(op_);
    return result == null ? ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator.UNRECOGNIZED : result;
  }

  public static final int INPUTS_FIELD_NUMBER = 2;
  private java.util.List<ai.promoted.proto.delivery.BlenderExpression> inputs_;
  /**
   * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public java.util.List<ai.promoted.proto.delivery.BlenderExpression> getInputsList() {
    return inputs_;
  }
  /**
   * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends ai.promoted.proto.delivery.BlenderExpressionOrBuilder> 
      getInputsOrBuilderList() {
    return inputs_;
  }
  /**
   * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public int getInputsCount() {
    return inputs_.size();
  }
  /**
   * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public ai.promoted.proto.delivery.BlenderExpression getInputs(int index) {
    return inputs_.get(index);
  }
  /**
   * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
   */
  @java.lang.Override
  public ai.promoted.proto.delivery.BlenderExpressionOrBuilder getInputsOrBuilder(
      int index) {
    return inputs_.get(index);
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
    if (op_ != ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator.UNKNOWN.getNumber()) {
      output.writeEnum(1, op_);
    }
    for (int i = 0; i < inputs_.size(); i++) {
      output.writeMessage(2, inputs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (op_ != ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, op_);
    }
    for (int i = 0; i < inputs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, inputs_.get(i));
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
    if (!(obj instanceof ai.promoted.proto.delivery.BlenderArithmeticExpression)) {
      return super.equals(obj);
    }
    ai.promoted.proto.delivery.BlenderArithmeticExpression other = (ai.promoted.proto.delivery.BlenderArithmeticExpression) obj;

    if (op_ != other.op_) return false;
    if (!getInputsList()
        .equals(other.getInputsList())) return false;
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
    hash = (37 * hash) + OP_FIELD_NUMBER;
    hash = (53 * hash) + op_;
    if (getInputsCount() > 0) {
      hash = (37 * hash) + INPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getInputsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.delivery.BlenderArithmeticExpression parseFrom(
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
  public static Builder newBuilder(ai.promoted.proto.delivery.BlenderArithmeticExpression prototype) {
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
   * Protobuf type {@code delivery.BlenderArithmeticExpression}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:delivery.BlenderArithmeticExpression)
      ai.promoted.proto.delivery.BlenderArithmeticExpressionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderArithmeticExpression_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderArithmeticExpression_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.promoted.proto.delivery.BlenderArithmeticExpression.class, ai.promoted.proto.delivery.BlenderArithmeticExpression.Builder.class);
    }

    // Construct using ai.promoted.proto.delivery.BlenderArithmeticExpression.newBuilder()
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
        getInputsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      op_ = 0;

      if (inputsBuilder_ == null) {
        inputs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inputsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.promoted.proto.delivery.Blender.internal_static_delivery_BlenderArithmeticExpression_descriptor;
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.BlenderArithmeticExpression getDefaultInstanceForType() {
      return ai.promoted.proto.delivery.BlenderArithmeticExpression.getDefaultInstance();
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.BlenderArithmeticExpression build() {
      ai.promoted.proto.delivery.BlenderArithmeticExpression result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.promoted.proto.delivery.BlenderArithmeticExpression buildPartial() {
      ai.promoted.proto.delivery.BlenderArithmeticExpression result = new ai.promoted.proto.delivery.BlenderArithmeticExpression(this);
      int from_bitField0_ = bitField0_;
      result.op_ = op_;
      if (inputsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inputs_ = java.util.Collections.unmodifiableList(inputs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inputs_ = inputs_;
      } else {
        result.inputs_ = inputsBuilder_.build();
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
      if (other instanceof ai.promoted.proto.delivery.BlenderArithmeticExpression) {
        return mergeFrom((ai.promoted.proto.delivery.BlenderArithmeticExpression)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.promoted.proto.delivery.BlenderArithmeticExpression other) {
      if (other == ai.promoted.proto.delivery.BlenderArithmeticExpression.getDefaultInstance()) return this;
      if (other.op_ != 0) {
        setOpValue(other.getOpValue());
      }
      if (inputsBuilder_ == null) {
        if (!other.inputs_.isEmpty()) {
          if (inputs_.isEmpty()) {
            inputs_ = other.inputs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInputsIsMutable();
            inputs_.addAll(other.inputs_);
          }
          onChanged();
        }
      } else {
        if (!other.inputs_.isEmpty()) {
          if (inputsBuilder_.isEmpty()) {
            inputsBuilder_.dispose();
            inputsBuilder_ = null;
            inputs_ = other.inputs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inputsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInputsFieldBuilder() : null;
          } else {
            inputsBuilder_.addAllMessages(other.inputs_);
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
      ai.promoted.proto.delivery.BlenderArithmeticExpression parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.promoted.proto.delivery.BlenderArithmeticExpression) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int op_ = 0;
    /**
     * <code>.delivery.BlenderArithmeticExpression.Operator op = 1 [json_name = "op"];</code>
     * @return The enum numeric value on the wire for op.
     */
    @java.lang.Override public int getOpValue() {
      return op_;
    }
    /**
     * <code>.delivery.BlenderArithmeticExpression.Operator op = 1 [json_name = "op"];</code>
     * @param value The enum numeric value on the wire for op to set.
     * @return This builder for chaining.
     */
    public Builder setOpValue(int value) {
      
      op_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.delivery.BlenderArithmeticExpression.Operator op = 1 [json_name = "op"];</code>
     * @return The op.
     */
    @java.lang.Override
    public ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator getOp() {
      @SuppressWarnings("deprecation")
      ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator result = ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator.valueOf(op_);
      return result == null ? ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator.UNRECOGNIZED : result;
    }
    /**
     * <code>.delivery.BlenderArithmeticExpression.Operator op = 1 [json_name = "op"];</code>
     * @param value The op to set.
     * @return This builder for chaining.
     */
    public Builder setOp(ai.promoted.proto.delivery.BlenderArithmeticExpression.Operator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      op_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.delivery.BlenderArithmeticExpression.Operator op = 1 [json_name = "op"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOp() {
      
      op_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<ai.promoted.proto.delivery.BlenderExpression> inputs_ =
      java.util.Collections.emptyList();
    private void ensureInputsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inputs_ = new java.util.ArrayList<ai.promoted.proto.delivery.BlenderExpression>(inputs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.promoted.proto.delivery.BlenderExpression, ai.promoted.proto.delivery.BlenderExpression.Builder, ai.promoted.proto.delivery.BlenderExpressionOrBuilder> inputsBuilder_;

    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public java.util.List<ai.promoted.proto.delivery.BlenderExpression> getInputsList() {
      if (inputsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inputs_);
      } else {
        return inputsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public int getInputsCount() {
      if (inputsBuilder_ == null) {
        return inputs_.size();
      } else {
        return inputsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpression getInputs(int index) {
      if (inputsBuilder_ == null) {
        return inputs_.get(index);
      } else {
        return inputsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder setInputs(
        int index, ai.promoted.proto.delivery.BlenderExpression value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsIsMutable();
        inputs_.set(index, value);
        onChanged();
      } else {
        inputsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder setInputs(
        int index, ai.promoted.proto.delivery.BlenderExpression.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.set(index, builderForValue.build());
        onChanged();
      } else {
        inputsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addInputs(ai.promoted.proto.delivery.BlenderExpression value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsIsMutable();
        inputs_.add(value);
        onChanged();
      } else {
        inputsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addInputs(
        int index, ai.promoted.proto.delivery.BlenderExpression value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsIsMutable();
        inputs_.add(index, value);
        onChanged();
      } else {
        inputsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addInputs(
        ai.promoted.proto.delivery.BlenderExpression.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.add(builderForValue.build());
        onChanged();
      } else {
        inputsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addInputs(
        int index, ai.promoted.proto.delivery.BlenderExpression.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.add(index, builderForValue.build());
        onChanged();
      } else {
        inputsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder addAllInputs(
        java.lang.Iterable<? extends ai.promoted.proto.delivery.BlenderExpression> values) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputs_);
        onChanged();
      } else {
        inputsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder clearInputs() {
      if (inputsBuilder_ == null) {
        inputs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inputsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public Builder removeInputs(int index) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.remove(index);
        onChanged();
      } else {
        inputsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpression.Builder getInputsBuilder(
        int index) {
      return getInputsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpressionOrBuilder getInputsOrBuilder(
        int index) {
      if (inputsBuilder_ == null) {
        return inputs_.get(index);  } else {
        return inputsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public java.util.List<? extends ai.promoted.proto.delivery.BlenderExpressionOrBuilder> 
         getInputsOrBuilderList() {
      if (inputsBuilder_ != null) {
        return inputsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inputs_);
      }
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpression.Builder addInputsBuilder() {
      return getInputsFieldBuilder().addBuilder(
          ai.promoted.proto.delivery.BlenderExpression.getDefaultInstance());
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public ai.promoted.proto.delivery.BlenderExpression.Builder addInputsBuilder(
        int index) {
      return getInputsFieldBuilder().addBuilder(
          index, ai.promoted.proto.delivery.BlenderExpression.getDefaultInstance());
    }
    /**
     * <code>repeated .delivery.BlenderExpression inputs = 2 [json_name = "inputs"];</code>
     */
    public java.util.List<ai.promoted.proto.delivery.BlenderExpression.Builder> 
         getInputsBuilderList() {
      return getInputsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ai.promoted.proto.delivery.BlenderExpression, ai.promoted.proto.delivery.BlenderExpression.Builder, ai.promoted.proto.delivery.BlenderExpressionOrBuilder> 
        getInputsFieldBuilder() {
      if (inputsBuilder_ == null) {
        inputsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ai.promoted.proto.delivery.BlenderExpression, ai.promoted.proto.delivery.BlenderExpression.Builder, ai.promoted.proto.delivery.BlenderExpressionOrBuilder>(
                inputs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inputs_ = null;
      }
      return inputsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:delivery.BlenderArithmeticExpression)
  }

  // @@protoc_insertion_point(class_scope:delivery.BlenderArithmeticExpression)
  private static final ai.promoted.proto.delivery.BlenderArithmeticExpression DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.promoted.proto.delivery.BlenderArithmeticExpression();
  }

  public static ai.promoted.proto.delivery.BlenderArithmeticExpression getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlenderArithmeticExpression>
      PARSER = new com.google.protobuf.AbstractParser<BlenderArithmeticExpression>() {
    @java.lang.Override
    public BlenderArithmeticExpression parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlenderArithmeticExpression(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlenderArithmeticExpression> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlenderArithmeticExpression> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.promoted.proto.delivery.BlenderArithmeticExpression getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

