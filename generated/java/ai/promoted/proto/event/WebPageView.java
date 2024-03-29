// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/event.proto

package ai.promoted.proto.event;

/**
 * Protobuf type {@code event.WebPageView}
 */
public final class WebPageView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:event.WebPageView)
    WebPageViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WebPageView.newBuilder() to construct.
  private WebPageView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WebPageView() {
    url_ = "";
    referrer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WebPageView();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WebPageView(
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

            url_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            referrer_ = s;
            break;
          }
          case 34: {
            ai.promoted.proto.common.Size.Builder subBuilder = null;
            if (documentSize_ != null) {
              subBuilder = documentSize_.toBuilder();
            }
            documentSize_ = input.readMessage(ai.promoted.proto.common.Size.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(documentSize_);
              documentSize_ = subBuilder.buildPartial();
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
    return ai.promoted.proto.event.Event.internal_static_event_WebPageView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.promoted.proto.event.Event.internal_static_event_WebPageView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.promoted.proto.event.WebPageView.class, ai.promoted.proto.event.WebPageView.Builder.class);
  }

  public static final int URL_FIELD_NUMBER = 1;
  private volatile java.lang.Object url_;
  /**
   * <code>string url = 1 [json_name = "url"];</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <code>string url = 1 [json_name = "url"];</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERRER_FIELD_NUMBER = 3;
  private volatile java.lang.Object referrer_;
  /**
   * <code>string referrer = 3 [json_name = "referrer"];</code>
   * @return The referrer.
   */
  @java.lang.Override
  public java.lang.String getReferrer() {
    java.lang.Object ref = referrer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referrer_ = s;
      return s;
    }
  }
  /**
   * <code>string referrer = 3 [json_name = "referrer"];</code>
   * @return The bytes for referrer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReferrerBytes() {
    java.lang.Object ref = referrer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referrer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCUMENT_SIZE_FIELD_NUMBER = 4;
  private ai.promoted.proto.common.Size documentSize_;
  /**
   * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
   * @return Whether the documentSize field is set.
   */
  @java.lang.Override
  public boolean hasDocumentSize() {
    return documentSize_ != null;
  }
  /**
   * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
   * @return The documentSize.
   */
  @java.lang.Override
  public ai.promoted.proto.common.Size getDocumentSize() {
    return documentSize_ == null ? ai.promoted.proto.common.Size.getDefaultInstance() : documentSize_;
  }
  /**
   * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
   */
  @java.lang.Override
  public ai.promoted.proto.common.SizeOrBuilder getDocumentSizeOrBuilder() {
    return getDocumentSize();
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
    if (!getUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    if (!getReferrerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, referrer_);
    }
    if (documentSize_ != null) {
      output.writeMessage(4, getDocumentSize());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    if (!getReferrerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, referrer_);
    }
    if (documentSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDocumentSize());
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
    if (!(obj instanceof ai.promoted.proto.event.WebPageView)) {
      return super.equals(obj);
    }
    ai.promoted.proto.event.WebPageView other = (ai.promoted.proto.event.WebPageView) obj;

    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (!getReferrer()
        .equals(other.getReferrer())) return false;
    if (hasDocumentSize() != other.hasDocumentSize()) return false;
    if (hasDocumentSize()) {
      if (!getDocumentSize()
          .equals(other.getDocumentSize())) return false;
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
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + REFERRER_FIELD_NUMBER;
    hash = (53 * hash) + getReferrer().hashCode();
    if (hasDocumentSize()) {
      hash = (37 * hash) + DOCUMENT_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentSize().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.promoted.proto.event.WebPageView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.event.WebPageView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.event.WebPageView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.event.WebPageView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.event.WebPageView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.promoted.proto.event.WebPageView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.promoted.proto.event.WebPageView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.event.WebPageView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.event.WebPageView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.event.WebPageView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.promoted.proto.event.WebPageView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.promoted.proto.event.WebPageView parseFrom(
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
  public static Builder newBuilder(ai.promoted.proto.event.WebPageView prototype) {
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
   * Protobuf type {@code event.WebPageView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:event.WebPageView)
      ai.promoted.proto.event.WebPageViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.promoted.proto.event.Event.internal_static_event_WebPageView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.promoted.proto.event.Event.internal_static_event_WebPageView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.promoted.proto.event.WebPageView.class, ai.promoted.proto.event.WebPageView.Builder.class);
    }

    // Construct using ai.promoted.proto.event.WebPageView.newBuilder()
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
      url_ = "";

      referrer_ = "";

      if (documentSizeBuilder_ == null) {
        documentSize_ = null;
      } else {
        documentSize_ = null;
        documentSizeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.promoted.proto.event.Event.internal_static_event_WebPageView_descriptor;
    }

    @java.lang.Override
    public ai.promoted.proto.event.WebPageView getDefaultInstanceForType() {
      return ai.promoted.proto.event.WebPageView.getDefaultInstance();
    }

    @java.lang.Override
    public ai.promoted.proto.event.WebPageView build() {
      ai.promoted.proto.event.WebPageView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ai.promoted.proto.event.WebPageView buildPartial() {
      ai.promoted.proto.event.WebPageView result = new ai.promoted.proto.event.WebPageView(this);
      result.url_ = url_;
      result.referrer_ = referrer_;
      if (documentSizeBuilder_ == null) {
        result.documentSize_ = documentSize_;
      } else {
        result.documentSize_ = documentSizeBuilder_.build();
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
      if (other instanceof ai.promoted.proto.event.WebPageView) {
        return mergeFrom((ai.promoted.proto.event.WebPageView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.promoted.proto.event.WebPageView other) {
      if (other == ai.promoted.proto.event.WebPageView.getDefaultInstance()) return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (!other.getReferrer().isEmpty()) {
        referrer_ = other.referrer_;
        onChanged();
      }
      if (other.hasDocumentSize()) {
        mergeDocumentSize(other.getDocumentSize());
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
      ai.promoted.proto.event.WebPageView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.promoted.proto.event.WebPageView) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <code>string url = 1 [json_name = "url"];</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string url = 1 [json_name = "url"];</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string url = 1 [json_name = "url"];</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string url = 1 [json_name = "url"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string url = 1 [json_name = "url"];</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object referrer_ = "";
    /**
     * <code>string referrer = 3 [json_name = "referrer"];</code>
     * @return The referrer.
     */
    public java.lang.String getReferrer() {
      java.lang.Object ref = referrer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referrer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string referrer = 3 [json_name = "referrer"];</code>
     * @return The bytes for referrer.
     */
    public com.google.protobuf.ByteString
        getReferrerBytes() {
      java.lang.Object ref = referrer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referrer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string referrer = 3 [json_name = "referrer"];</code>
     * @param value The referrer to set.
     * @return This builder for chaining.
     */
    public Builder setReferrer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referrer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string referrer = 3 [json_name = "referrer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReferrer() {
      
      referrer_ = getDefaultInstance().getReferrer();
      onChanged();
      return this;
    }
    /**
     * <code>string referrer = 3 [json_name = "referrer"];</code>
     * @param value The bytes for referrer to set.
     * @return This builder for chaining.
     */
    public Builder setReferrerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      referrer_ = value;
      onChanged();
      return this;
    }

    private ai.promoted.proto.common.Size documentSize_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.promoted.proto.common.Size, ai.promoted.proto.common.Size.Builder, ai.promoted.proto.common.SizeOrBuilder> documentSizeBuilder_;
    /**
     * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
     * @return Whether the documentSize field is set.
     */
    public boolean hasDocumentSize() {
      return documentSizeBuilder_ != null || documentSize_ != null;
    }
    /**
     * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
     * @return The documentSize.
     */
    public ai.promoted.proto.common.Size getDocumentSize() {
      if (documentSizeBuilder_ == null) {
        return documentSize_ == null ? ai.promoted.proto.common.Size.getDefaultInstance() : documentSize_;
      } else {
        return documentSizeBuilder_.getMessage();
      }
    }
    /**
     * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
     */
    public Builder setDocumentSize(ai.promoted.proto.common.Size value) {
      if (documentSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        documentSize_ = value;
        onChanged();
      } else {
        documentSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
     */
    public Builder setDocumentSize(
        ai.promoted.proto.common.Size.Builder builderForValue) {
      if (documentSizeBuilder_ == null) {
        documentSize_ = builderForValue.build();
        onChanged();
      } else {
        documentSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
     */
    public Builder mergeDocumentSize(ai.promoted.proto.common.Size value) {
      if (documentSizeBuilder_ == null) {
        if (documentSize_ != null) {
          documentSize_ =
            ai.promoted.proto.common.Size.newBuilder(documentSize_).mergeFrom(value).buildPartial();
        } else {
          documentSize_ = value;
        }
        onChanged();
      } else {
        documentSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
     */
    public Builder clearDocumentSize() {
      if (documentSizeBuilder_ == null) {
        documentSize_ = null;
        onChanged();
      } else {
        documentSize_ = null;
        documentSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
     */
    public ai.promoted.proto.common.Size.Builder getDocumentSizeBuilder() {
      
      onChanged();
      return getDocumentSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
     */
    public ai.promoted.proto.common.SizeOrBuilder getDocumentSizeOrBuilder() {
      if (documentSizeBuilder_ != null) {
        return documentSizeBuilder_.getMessageOrBuilder();
      } else {
        return documentSize_ == null ?
            ai.promoted.proto.common.Size.getDefaultInstance() : documentSize_;
      }
    }
    /**
     * <code>.common.Size document_size = 4 [json_name = "documentSize"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.promoted.proto.common.Size, ai.promoted.proto.common.Size.Builder, ai.promoted.proto.common.SizeOrBuilder> 
        getDocumentSizeFieldBuilder() {
      if (documentSizeBuilder_ == null) {
        documentSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.promoted.proto.common.Size, ai.promoted.proto.common.Size.Builder, ai.promoted.proto.common.SizeOrBuilder>(
                getDocumentSize(),
                getParentForChildren(),
                isClean());
        documentSize_ = null;
      }
      return documentSizeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:event.WebPageView)
  }

  // @@protoc_insertion_point(class_scope:event.WebPageView)
  private static final ai.promoted.proto.event.WebPageView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.promoted.proto.event.WebPageView();
  }

  public static ai.promoted.proto.event.WebPageView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WebPageView>
      PARSER = new com.google.protobuf.AbstractParser<WebPageView>() {
    @java.lang.Override
    public WebPageView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WebPageView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WebPageView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WebPageView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ai.promoted.proto.event.WebPageView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

