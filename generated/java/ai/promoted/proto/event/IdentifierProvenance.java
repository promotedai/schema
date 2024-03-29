// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

/**
 * Protobuf enum {@code event.IdentifierProvenance}
 */
public enum IdentifierProvenance
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>NULL = 1;</code>
   */
  NULL(1),
  /**
   * <code>EMPTY = 2;</code>
   */
  EMPTY(2),
  /**
   * <code>AUTOGENERATED = 3;</code>
   */
  AUTOGENERATED(3),
  /**
   * <code>PLATFORM_SPECIFIED = 4;</code>
   */
  PLATFORM_SPECIFIED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>NULL = 1;</code>
   */
  public static final int NULL_VALUE = 1;
  /**
   * <code>EMPTY = 2;</code>
   */
  public static final int EMPTY_VALUE = 2;
  /**
   * <code>AUTOGENERATED = 3;</code>
   */
  public static final int AUTOGENERATED_VALUE = 3;
  /**
   * <code>PLATFORM_SPECIFIED = 4;</code>
   */
  public static final int PLATFORM_SPECIFIED_VALUE = 4;


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
  public static IdentifierProvenance valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IdentifierProvenance forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return NULL;
      case 2: return EMPTY;
      case 3: return AUTOGENERATED;
      case 4: return PLATFORM_SPECIFIED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IdentifierProvenance>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IdentifierProvenance> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IdentifierProvenance>() {
          public IdentifierProvenance findValueByNumber(int number) {
            return IdentifierProvenance.forNumber(number);
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
    return ai.promoted.proto.event.Event.getDescriptor().getEnumTypes().get(0);
  }

  private static final IdentifierProvenance[] VALUES = values();

  public static IdentifierProvenance valueOf(
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

  private IdentifierProvenance(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:event.IdentifierProvenance)
}

