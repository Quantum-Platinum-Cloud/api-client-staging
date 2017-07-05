// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

/**
 * <pre>
 * Video segment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1beta1.VideoSegment}
 */
public  final class VideoSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1beta1.VideoSegment)
    VideoSegmentOrBuilder {
  // Use VideoSegment.newBuilder() to construct.
  private VideoSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoSegment() {
    startTimeOffset_ = 0L;
    endTimeOffset_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private VideoSegment(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            startTimeOffset_ = input.readInt64();
            break;
          }
          case 16: {

            endTimeOffset_ = input.readInt64();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1beta1.VideoSegment.class, com.google.cloud.videointelligence.v1beta1.VideoSegment.Builder.class);
  }

  public static final int START_TIME_OFFSET_FIELD_NUMBER = 1;
  private long startTimeOffset_;
  /**
   * <pre>
   * Start offset in microseconds (inclusive). Unset means 0.
   * </pre>
   *
   * <code>int64 start_time_offset = 1;</code>
   */
  public long getStartTimeOffset() {
    return startTimeOffset_;
  }

  public static final int END_TIME_OFFSET_FIELD_NUMBER = 2;
  private long endTimeOffset_;
  /**
   * <pre>
   * End offset in microseconds (inclusive). Unset means 0.
   * </pre>
   *
   * <code>int64 end_time_offset = 2;</code>
   */
  public long getEndTimeOffset() {
    return endTimeOffset_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (startTimeOffset_ != 0L) {
      output.writeInt64(1, startTimeOffset_);
    }
    if (endTimeOffset_ != 0L) {
      output.writeInt64(2, endTimeOffset_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTimeOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, startTimeOffset_);
    }
    if (endTimeOffset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, endTimeOffset_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.videointelligence.v1beta1.VideoSegment)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1beta1.VideoSegment other = (com.google.cloud.videointelligence.v1beta1.VideoSegment) obj;

    boolean result = true;
    result = result && (getStartTimeOffset()
        == other.getStartTimeOffset());
    result = result && (getEndTimeOffset()
        == other.getEndTimeOffset());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + START_TIME_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTimeOffset());
    hash = (37 * hash) + END_TIME_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEndTimeOffset());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.videointelligence.v1beta1.VideoSegment parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.videointelligence.v1beta1.VideoSegment prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Video segment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1beta1.VideoSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1beta1.VideoSegment)
      com.google.cloud.videointelligence.v1beta1.VideoSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1beta1.VideoSegment.class, com.google.cloud.videointelligence.v1beta1.VideoSegment.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1beta1.VideoSegment.newBuilder()
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
    public Builder clear() {
      super.clear();
      startTimeOffset_ = 0L;

      endTimeOffset_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.videointelligence.v1beta1.VideoIntelligenceServiceProto.internal_static_google_cloud_videointelligence_v1beta1_VideoSegment_descriptor;
    }

    public com.google.cloud.videointelligence.v1beta1.VideoSegment getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1beta1.VideoSegment.getDefaultInstance();
    }

    public com.google.cloud.videointelligence.v1beta1.VideoSegment build() {
      com.google.cloud.videointelligence.v1beta1.VideoSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.videointelligence.v1beta1.VideoSegment buildPartial() {
      com.google.cloud.videointelligence.v1beta1.VideoSegment result = new com.google.cloud.videointelligence.v1beta1.VideoSegment(this);
      result.startTimeOffset_ = startTimeOffset_;
      result.endTimeOffset_ = endTimeOffset_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1beta1.VideoSegment) {
        return mergeFrom((com.google.cloud.videointelligence.v1beta1.VideoSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1beta1.VideoSegment other) {
      if (other == com.google.cloud.videointelligence.v1beta1.VideoSegment.getDefaultInstance()) return this;
      if (other.getStartTimeOffset() != 0L) {
        setStartTimeOffset(other.getStartTimeOffset());
      }
      if (other.getEndTimeOffset() != 0L) {
        setEndTimeOffset(other.getEndTimeOffset());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.videointelligence.v1beta1.VideoSegment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1beta1.VideoSegment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long startTimeOffset_ ;
    /**
     * <pre>
     * Start offset in microseconds (inclusive). Unset means 0.
     * </pre>
     *
     * <code>int64 start_time_offset = 1;</code>
     */
    public long getStartTimeOffset() {
      return startTimeOffset_;
    }
    /**
     * <pre>
     * Start offset in microseconds (inclusive). Unset means 0.
     * </pre>
     *
     * <code>int64 start_time_offset = 1;</code>
     */
    public Builder setStartTimeOffset(long value) {
      
      startTimeOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Start offset in microseconds (inclusive). Unset means 0.
     * </pre>
     *
     * <code>int64 start_time_offset = 1;</code>
     */
    public Builder clearStartTimeOffset() {
      
      startTimeOffset_ = 0L;
      onChanged();
      return this;
    }

    private long endTimeOffset_ ;
    /**
     * <pre>
     * End offset in microseconds (inclusive). Unset means 0.
     * </pre>
     *
     * <code>int64 end_time_offset = 2;</code>
     */
    public long getEndTimeOffset() {
      return endTimeOffset_;
    }
    /**
     * <pre>
     * End offset in microseconds (inclusive). Unset means 0.
     * </pre>
     *
     * <code>int64 end_time_offset = 2;</code>
     */
    public Builder setEndTimeOffset(long value) {
      
      endTimeOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * End offset in microseconds (inclusive). Unset means 0.
     * </pre>
     *
     * <code>int64 end_time_offset = 2;</code>
     */
    public Builder clearEndTimeOffset() {
      
      endTimeOffset_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1beta1.VideoSegment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1beta1.VideoSegment)
  private static final com.google.cloud.videointelligence.v1beta1.VideoSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1beta1.VideoSegment();
  }

  public static com.google.cloud.videointelligence.v1beta1.VideoSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoSegment>
      PARSER = new com.google.protobuf.AbstractParser<VideoSegment>() {
    public VideoSegment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VideoSegment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VideoSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoSegment> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.videointelligence.v1beta1.VideoSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
