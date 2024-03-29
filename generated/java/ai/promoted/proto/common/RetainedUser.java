// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/common/retained_user.proto

package ai.promoted.proto.common;

/**
 * Protobuf type {@code common.RetainedUser}
 */
public final class RetainedUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.RetainedUser)
    RetainedUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RetainedUser.newBuilder() to construct.
  private RetainedUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetainedUser() {
    userId_ = "";
    retainedUserId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RetainedUser();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RetainedUser(
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
          case 8: {

            platformId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            retainedUserId_ = s;
            break;
          }
          case 32: {

            createEventApiTimeMillis_ = input.readUInt64();
            break;
          }
          case 40: {

            processTimeMillis_ = input.readUInt64();
            break;
          }
          case 48: {

            lastForgottenTimeMillis_ = input.readUInt64();
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
    return ai.promoted.proto.common.RetainedUserOuterClass.internal_static_common_RetainedUser_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.promoted.proto.common.RetainedUserOuterClass.internal_static_common_RetainedUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.promoted.proto.common.RetainedUser.class, ai.promoted.proto.common.RetainedUser.Builder.class);
  }

  public static final int PLATFORM_ID_FIELD_NUMBER = 1;
  private long platformId_;
  /**
   * <code>uint64 platform_id = 1 [json_name = "platformId"];</code>
   * @return The platformId.
   */
  @java.lang.Override
  public long getPlatformId() {
    return platformId_;
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RETAINED_USER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object retainedUserId_;
  /**
   * <code>string retained_user_id = 3 [json_name = "retainedUserId"];</code>
   * @return The retainedUserId.
   */
  @java.lang.Override
  public java.lang.String getRetainedUserId() {
    java.lang.Object ref = retainedUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      retainedUserId_ = s;
      return s;
    }
  }
  /**
   * <code>string retained_user_id = 3 [json_name = "retainedUserId"];</code>
   * @return The bytes for retainedUserId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRetainedUserIdBytes() {
    java.lang.Object ref = retainedUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      retainedUserId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_EVENT_API_TIME_MILLIS_FIELD_NUMBER = 4;
  private long createEventApiTimeMillis_;
  /**
   * <code>uint64 create_event_api_time_millis = 4 [json_name = "createEventApiTimeMillis"];</code>
   * @return The createEventApiTimeMillis.
   */
  @java.lang.Override
  public long getCreateEventApiTimeMillis() {
    return createEventApiTimeMillis_;
  }

  public static final int PROCESS_TIME_MILLIS_FIELD_NUMBER = 5;
  private long processTimeMillis_;
  /**
   * <code>uint64 process_time_millis = 5 [json_name = "processTimeMillis"];</code>
   * @return The processTimeMillis.
   */
  @java.lang.Override
  public long getProcessTimeMillis() {
    return processTimeMillis_;
  }

  public static final int LAST_FORGOTTEN_TIME_MILLIS_FIELD_NUMBER = 6;
  private long lastForgottenTimeMillis_;
  /**
   * <code>uint64 last_forgotten_time_millis = 6 [json_name = "lastForgottenTimeMillis"];</code>
   * @return The lastForgottenTimeMillis.
   */
  @java.lang.Override
  public long getLastForgottenTimeMillis() {
    return lastForgottenTimeMillis_;
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
    if (platformId_ != 0L) {
      output.writeUInt64(1, platformId_);
    }
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    if (!getRetainedUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, retainedUserId_);
    }
    if (createEventApiTimeMillis_ != 0L) {
      output.writeUInt64(4, createEventApiTimeMillis_);
    }
    if (processTimeMillis_ != 0L) {
      output.writeUInt64(5, processTimeMillis_);
    }
    if (lastForgottenTimeMillis_ != 0L) {
      output.writeUInt64(6, lastForgottenTimeMillis_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (platformId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, platformId_);
    }
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
    }
    if (!getRetainedUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, retainedUserId_);
    }
    if (createEventApiTimeMillis_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, createEventApiTimeMillis_);
    }
    if (processTimeMillis_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, processTimeMillis_);
    }
    if (lastForgottenTimeMillis_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, lastForgottenTimeMillis_);
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
    if (!(obj instanceof ai.promoted.proto.common.RetainedUser)) {
      return super.equals(obj);
    }
    ai.promoted.proto.common.RetainedUser other = (ai.promoted.proto.common.RetainedUser) obj;

    if (getPlatformId()
        != other.getPlatformId()) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getRetainedUserId()
        .equals(other.getRetainedUserId())) return false;
    if (getCreateEventApiTimeMillis()
        != other.getCreateEventApiTimeMillis()) return false;
    if (getProcessTimeMillis()
        != other.getProcessTimeMillis()) return false;
    if (getLastForgottenTimeMillis()
        != other.getLastForgottenTimeMillis()) return false;
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
    hash = (37 * hash) + PLATFORM_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPlatformId());
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + RETAINED_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRetainedUserId().hashCode();
    hash = (37 * hash) + CREATE_EVENT_API_TIME_MILLIS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreateEventApiTimeMillis());
    hash = (37 * hash) + PROCESS_TIME_MILLIS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProcessTimeMillis());
    hash = (37 * hash) + LAST_FORGOTTEN_TIME_MILLIS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastForgottenTimeMillis());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.promoted.proto.common.RetainedUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.common.RetainedUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.common.RetainedUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.common.RetainedUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.common.RetainedUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.common.RetainedUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.common.RetainedUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.common.RetainedUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.common.RetainedUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.common.RetainedUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.common.RetainedUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.common.RetainedUser parseFrom(
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
  public static Builder newBuilder(ai.promoted.proto.common.RetainedUser prototype) {
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
   * Protobuf type {@code common.RetainedUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.RetainedUser)
      ai.promoted.proto.common.RetainedUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.promoted.proto.common.RetainedUserOuterClass.internal_static_common_RetainedUser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.promoted.proto.common.RetainedUserOuterClass.internal_static_common_RetainedUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.promoted.proto.common.RetainedUser.class, ai.promoted.proto.common.RetainedUser.Builder.class);
    }

    // Construct using ai.promoted.proto.common.RetainedUser.newBuilder()
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
      platformId_ = 0L;

      userId_ = "";

      retainedUserId_ = "";

      createEventApiTimeMillis_ = 0L;

      processTimeMillis_ = 0L;

      lastForgottenTimeMillis_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.promoted.proto.common.RetainedUserOuterClass.internal_static_common_RetainedUser_descriptor;
    }

    @java.lang.Override
    public ai.promoted.proto.common.RetainedUser getDefaultInstanceForType() {
      return ai.promoted.proto.common.RetainedUser.getDefaultInstance();
    }

    @java.lang.Override
    public ai.promoted.proto.common.RetainedUser build() {
      ai.promoted.proto.common.RetainedUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.promoted.proto.common.RetainedUser buildPartial() {
      ai.promoted.proto.common.RetainedUser result = new ai.promoted.proto.common.RetainedUser(this);
      result.platformId_ = platformId_;
      result.userId_ = userId_;
      result.retainedUserId_ = retainedUserId_;
      result.createEventApiTimeMillis_ = createEventApiTimeMillis_;
      result.processTimeMillis_ = processTimeMillis_;
      result.lastForgottenTimeMillis_ = lastForgottenTimeMillis_;
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
      if (other instanceof ai.promoted.proto.common.RetainedUser) {
        return mergeFrom((ai.promoted.proto.common.RetainedUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.promoted.proto.common.RetainedUser other) {
      if (other == ai.promoted.proto.common.RetainedUser.getDefaultInstance()) return this;
      if (other.getPlatformId() != 0L) {
        setPlatformId(other.getPlatformId());
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getRetainedUserId().isEmpty()) {
        retainedUserId_ = other.retainedUserId_;
        onChanged();
      }
      if (other.getCreateEventApiTimeMillis() != 0L) {
        setCreateEventApiTimeMillis(other.getCreateEventApiTimeMillis());
      }
      if (other.getProcessTimeMillis() != 0L) {
        setProcessTimeMillis(other.getProcessTimeMillis());
      }
      if (other.getLastForgottenTimeMillis() != 0L) {
        setLastForgottenTimeMillis(other.getLastForgottenTimeMillis());
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
      ai.promoted.proto.common.RetainedUser parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.promoted.proto.common.RetainedUser) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long platformId_ ;
    /**
     * <code>uint64 platform_id = 1 [json_name = "platformId"];</code>
     * @return The platformId.
     */
    @java.lang.Override
    public long getPlatformId() {
      return platformId_;
    }
    /**
     * <code>uint64 platform_id = 1 [json_name = "platformId"];</code>
     * @param value The platformId to set.
     * @return This builder for chaining.
     */
    public Builder setPlatformId(long value) {
      
      platformId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 platform_id = 1 [json_name = "platformId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPlatformId() {
      
      platformId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object retainedUserId_ = "";
    /**
     * <code>string retained_user_id = 3 [json_name = "retainedUserId"];</code>
     * @return The retainedUserId.
     */
    public java.lang.String getRetainedUserId() {
      java.lang.Object ref = retainedUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        retainedUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string retained_user_id = 3 [json_name = "retainedUserId"];</code>
     * @return The bytes for retainedUserId.
     */
    public com.google.protobuf.ByteString
        getRetainedUserIdBytes() {
      java.lang.Object ref = retainedUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        retainedUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string retained_user_id = 3 [json_name = "retainedUserId"];</code>
     * @param value The retainedUserId to set.
     * @return This builder for chaining.
     */
    public Builder setRetainedUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      retainedUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string retained_user_id = 3 [json_name = "retainedUserId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRetainedUserId() {
      
      retainedUserId_ = getDefaultInstance().getRetainedUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string retained_user_id = 3 [json_name = "retainedUserId"];</code>
     * @param value The bytes for retainedUserId to set.
     * @return This builder for chaining.
     */
    public Builder setRetainedUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      retainedUserId_ = value;
      onChanged();
      return this;
    }

    private long createEventApiTimeMillis_ ;
    /**
     * <code>uint64 create_event_api_time_millis = 4 [json_name = "createEventApiTimeMillis"];</code>
     * @return The createEventApiTimeMillis.
     */
    @java.lang.Override
    public long getCreateEventApiTimeMillis() {
      return createEventApiTimeMillis_;
    }
    /**
     * <code>uint64 create_event_api_time_millis = 4 [json_name = "createEventApiTimeMillis"];</code>
     * @param value The createEventApiTimeMillis to set.
     * @return This builder for chaining.
     */
    public Builder setCreateEventApiTimeMillis(long value) {
      
      createEventApiTimeMillis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 create_event_api_time_millis = 4 [json_name = "createEventApiTimeMillis"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreateEventApiTimeMillis() {
      
      createEventApiTimeMillis_ = 0L;
      onChanged();
      return this;
    }

    private long processTimeMillis_ ;
    /**
     * <code>uint64 process_time_millis = 5 [json_name = "processTimeMillis"];</code>
     * @return The processTimeMillis.
     */
    @java.lang.Override
    public long getProcessTimeMillis() {
      return processTimeMillis_;
    }
    /**
     * <code>uint64 process_time_millis = 5 [json_name = "processTimeMillis"];</code>
     * @param value The processTimeMillis to set.
     * @return This builder for chaining.
     */
    public Builder setProcessTimeMillis(long value) {
      
      processTimeMillis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 process_time_millis = 5 [json_name = "processTimeMillis"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProcessTimeMillis() {
      
      processTimeMillis_ = 0L;
      onChanged();
      return this;
    }

    private long lastForgottenTimeMillis_ ;
    /**
     * <code>uint64 last_forgotten_time_millis = 6 [json_name = "lastForgottenTimeMillis"];</code>
     * @return The lastForgottenTimeMillis.
     */
    @java.lang.Override
    public long getLastForgottenTimeMillis() {
      return lastForgottenTimeMillis_;
    }
    /**
     * <code>uint64 last_forgotten_time_millis = 6 [json_name = "lastForgottenTimeMillis"];</code>
     * @param value The lastForgottenTimeMillis to set.
     * @return This builder for chaining.
     */
    public Builder setLastForgottenTimeMillis(long value) {
      
      lastForgottenTimeMillis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 last_forgotten_time_millis = 6 [json_name = "lastForgottenTimeMillis"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLastForgottenTimeMillis() {
      
      lastForgottenTimeMillis_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:common.RetainedUser)
  }

  // @@protoc_insertion_point(class_scope:common.RetainedUser)
  private static final ai.promoted.proto.common.RetainedUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.promoted.proto.common.RetainedUser();
  }

  public static ai.promoted.proto.common.RetainedUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetainedUser>
      PARSER = new com.google.protobuf.AbstractParser<RetainedUser>() {
    @java.lang.Override
    public RetainedUser parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RetainedUser(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RetainedUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetainedUser> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.promoted.proto.common.RetainedUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

