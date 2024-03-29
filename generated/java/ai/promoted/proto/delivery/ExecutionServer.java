// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/delivery/execution.proto

package ai.promoted.proto.delivery;

/**
 * Protobuf enum {@code delivery.ExecutionServer}
 */
public enum ExecutionServer
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_EXECUTION_SERVER = 0;</code>
   */
  UNKNOWN_EXECUTION_SERVER(0),
  /**
   * <code>API = 1;</code>
   */
  API(1),
  /**
   * <code>SDK = 2;</code>
   */
  SDK(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_EXECUTION_SERVER = 0;</code>
   */
  public static final int UNKNOWN_EXECUTION_SERVER_VALUE = 0;
  /**
   * <code>API = 1;</code>
   */
  public static final int API_VALUE = 1;
  /**
   * <code>SDK = 2;</code>
   */
  public static final int SDK_VALUE = 2;


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
  public static ExecutionServer valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ExecutionServer forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_EXECUTION_SERVER;
      case 1: return API;
      case 2: return SDK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ExecutionServer>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ExecutionServer> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ExecutionServer>() {
          public ExecutionServer findValueByNumber(int number) {
            return ExecutionServer.forNumber(number);
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
    return ai.promoted.proto.delivery.DeliveryExecutionLog.getDescriptor().getEnumTypes().get(0);
  }

  private static final ExecutionServer[] VALUES = values();

  public static ExecutionServer valueOf(
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

  private ExecutionServer(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:delivery.ExecutionServer)
}

