// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ImageService.proto

package com.dipper.proto.rpc;

/**
 * Protobuf type {@code com.dipper.proto.rpc.ImageLoadResult}
 */
public  final class ImageLoadResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.dipper.proto.rpc.ImageLoadResult)
    ImageLoadResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageLoadResult.newBuilder() to construct.
  private ImageLoadResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageLoadResult() {
    message_ = "";
    photo_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageLoadResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImageLoadResult(
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

            rpcCode_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 26: {

            photo_ = input.readBytes();
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
    return com.dipper.proto.rpc.ImageProto.internal_static_com_dipper_proto_rpc_ImageLoadResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dipper.proto.rpc.ImageProto.internal_static_com_dipper_proto_rpc_ImageLoadResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dipper.proto.rpc.ImageLoadResult.class, com.dipper.proto.rpc.ImageLoadResult.Builder.class);
  }

  public static final int RPC_CODE_FIELD_NUMBER = 1;
  private int rpcCode_;
  /**
   * <code>int32 rpc_code = 1;</code>
   * @return The rpcCode.
   */
  public int getRpcCode() {
    return rpcCode_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHOTO_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString photo_;
  /**
   * <code>bytes photo = 3;</code>
   * @return The photo.
   */
  public com.google.protobuf.ByteString getPhoto() {
    return photo_;
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
    if (rpcCode_ != 0) {
      output.writeInt32(1, rpcCode_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (!photo_.isEmpty()) {
      output.writeBytes(3, photo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rpcCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, rpcCode_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (!photo_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, photo_);
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
    if (!(obj instanceof com.dipper.proto.rpc.ImageLoadResult)) {
      return super.equals(obj);
    }
    com.dipper.proto.rpc.ImageLoadResult other = (com.dipper.proto.rpc.ImageLoadResult) obj;

    if (getRpcCode()
        != other.getRpcCode()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getPhoto()
        .equals(other.getPhoto())) return false;
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
    hash = (37 * hash) + RPC_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getRpcCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + PHOTO_FIELD_NUMBER;
    hash = (53 * hash) + getPhoto().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dipper.proto.rpc.ImageLoadResult parseFrom(
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
  public static Builder newBuilder(com.dipper.proto.rpc.ImageLoadResult prototype) {
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
   * Protobuf type {@code com.dipper.proto.rpc.ImageLoadResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.dipper.proto.rpc.ImageLoadResult)
      com.dipper.proto.rpc.ImageLoadResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dipper.proto.rpc.ImageProto.internal_static_com_dipper_proto_rpc_ImageLoadResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dipper.proto.rpc.ImageProto.internal_static_com_dipper_proto_rpc_ImageLoadResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dipper.proto.rpc.ImageLoadResult.class, com.dipper.proto.rpc.ImageLoadResult.Builder.class);
    }

    // Construct using com.dipper.proto.rpc.ImageLoadResult.newBuilder()
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
      rpcCode_ = 0;

      message_ = "";

      photo_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dipper.proto.rpc.ImageProto.internal_static_com_dipper_proto_rpc_ImageLoadResult_descriptor;
    }

    @java.lang.Override
    public com.dipper.proto.rpc.ImageLoadResult getDefaultInstanceForType() {
      return com.dipper.proto.rpc.ImageLoadResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.dipper.proto.rpc.ImageLoadResult build() {
      com.dipper.proto.rpc.ImageLoadResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.dipper.proto.rpc.ImageLoadResult buildPartial() {
      com.dipper.proto.rpc.ImageLoadResult result = new com.dipper.proto.rpc.ImageLoadResult(this);
      result.rpcCode_ = rpcCode_;
      result.message_ = message_;
      result.photo_ = photo_;
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
      if (other instanceof com.dipper.proto.rpc.ImageLoadResult) {
        return mergeFrom((com.dipper.proto.rpc.ImageLoadResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dipper.proto.rpc.ImageLoadResult other) {
      if (other == com.dipper.proto.rpc.ImageLoadResult.getDefaultInstance()) return this;
      if (other.getRpcCode() != 0) {
        setRpcCode(other.getRpcCode());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getPhoto() != com.google.protobuf.ByteString.EMPTY) {
        setPhoto(other.getPhoto());
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
      com.dipper.proto.rpc.ImageLoadResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dipper.proto.rpc.ImageLoadResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int rpcCode_ ;
    /**
     * <code>int32 rpc_code = 1;</code>
     * @return The rpcCode.
     */
    public int getRpcCode() {
      return rpcCode_;
    }
    /**
     * <code>int32 rpc_code = 1;</code>
     * @param value The rpcCode to set.
     * @return This builder for chaining.
     */
    public Builder setRpcCode(int value) {
      
      rpcCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 rpc_code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRpcCode() {
      
      rpcCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString photo_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes photo = 3;</code>
     * @return The photo.
     */
    public com.google.protobuf.ByteString getPhoto() {
      return photo_;
    }
    /**
     * <code>bytes photo = 3;</code>
     * @param value The photo to set.
     * @return This builder for chaining.
     */
    public Builder setPhoto(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      photo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes photo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoto() {
      
      photo_ = getDefaultInstance().getPhoto();
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


    // @@protoc_insertion_point(builder_scope:com.dipper.proto.rpc.ImageLoadResult)
  }

  // @@protoc_insertion_point(class_scope:com.dipper.proto.rpc.ImageLoadResult)
  private static final com.dipper.proto.rpc.ImageLoadResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dipper.proto.rpc.ImageLoadResult();
  }

  public static com.dipper.proto.rpc.ImageLoadResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageLoadResult>
      PARSER = new com.google.protobuf.AbstractParser<ImageLoadResult>() {
    @java.lang.Override
    public ImageLoadResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImageLoadResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImageLoadResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageLoadResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.dipper.proto.rpc.ImageLoadResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
