// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collector.proto

package com.lightstep.tracer.grpc;

/**
 * Protobuf type {@code lightstep.collector.Reporter}
 */
public  final class Reporter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lightstep.collector.Reporter)
    ReporterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reporter.newBuilder() to construct.
  private Reporter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reporter() {
    reporterId_ = 0L;
    tags_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Reporter(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            reporterId_ = input.readUInt64();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              tags_ = new java.util.ArrayList<com.lightstep.tracer.grpc.KeyValue>();
              mutable_bitField0_ |= 0x00000002;
            }
            tags_.add(
                input.readMessage(com.lightstep.tracer.grpc.KeyValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        tags_ = java.util.Collections.unmodifiableList(tags_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_Reporter_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_Reporter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lightstep.tracer.grpc.Reporter.class, com.lightstep.tracer.grpc.Reporter.Builder.class);
  }

  private int bitField0_;
  public static final int REPORTER_ID_FIELD_NUMBER = 1;
  private long reporterId_;
  /**
   * <code>uint64 reporter_id = 1;</code>
   */
  public long getReporterId() {
    return reporterId_;
  }

  public static final int TAGS_FIELD_NUMBER = 4;
  private java.util.List<com.lightstep.tracer.grpc.KeyValue> tags_;
  /**
   * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
   */
  public java.util.List<com.lightstep.tracer.grpc.KeyValue> getTagsList() {
    return tags_;
  }
  /**
   * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
   */
  public java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> 
      getTagsOrBuilderList() {
    return tags_;
  }
  /**
   * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
   */
  public com.lightstep.tracer.grpc.KeyValue getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
   */
  public com.lightstep.tracer.grpc.KeyValueOrBuilder getTagsOrBuilder(
      int index) {
    return tags_.get(index);
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
    if (reporterId_ != 0L) {
      output.writeUInt64(1, reporterId_);
    }
    for (int i = 0; i < tags_.size(); i++) {
      output.writeMessage(4, tags_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reporterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, reporterId_);
    }
    for (int i = 0; i < tags_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, tags_.get(i));
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
    if (!(obj instanceof com.lightstep.tracer.grpc.Reporter)) {
      return super.equals(obj);
    }
    com.lightstep.tracer.grpc.Reporter other = (com.lightstep.tracer.grpc.Reporter) obj;

    boolean result = true;
    result = result && (getReporterId()
        == other.getReporterId());
    result = result && getTagsList()
        .equals(other.getTagsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REPORTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReporterId());
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lightstep.tracer.grpc.Reporter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.Reporter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.Reporter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.Reporter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.Reporter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lightstep.tracer.grpc.Reporter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.Reporter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.Reporter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.Reporter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.Reporter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lightstep.tracer.grpc.Reporter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lightstep.tracer.grpc.Reporter parseFrom(
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
  public static Builder newBuilder(com.lightstep.tracer.grpc.Reporter prototype) {
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
   * Protobuf type {@code lightstep.collector.Reporter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lightstep.collector.Reporter)
      com.lightstep.tracer.grpc.ReporterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_Reporter_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_Reporter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lightstep.tracer.grpc.Reporter.class, com.lightstep.tracer.grpc.Reporter.Builder.class);
    }

    // Construct using com.lightstep.tracer.grpc.Reporter.newBuilder()
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
        getTagsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      reporterId_ = 0L;

      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        tagsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lightstep.tracer.grpc.Collector.internal_static_lightstep_collector_Reporter_descriptor;
    }

    public com.lightstep.tracer.grpc.Reporter getDefaultInstanceForType() {
      return com.lightstep.tracer.grpc.Reporter.getDefaultInstance();
    }

    public com.lightstep.tracer.grpc.Reporter build() {
      com.lightstep.tracer.grpc.Reporter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.lightstep.tracer.grpc.Reporter buildPartial() {
      com.lightstep.tracer.grpc.Reporter result = new com.lightstep.tracer.grpc.Reporter(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.reporterId_ = reporterId_;
      if (tagsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          tags_ = java.util.Collections.unmodifiableList(tags_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.tags_ = tags_;
      } else {
        result.tags_ = tagsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lightstep.tracer.grpc.Reporter) {
        return mergeFrom((com.lightstep.tracer.grpc.Reporter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lightstep.tracer.grpc.Reporter other) {
      if (other == com.lightstep.tracer.grpc.Reporter.getDefaultInstance()) return this;
      if (other.getReporterId() != 0L) {
        setReporterId(other.getReporterId());
      }
      if (tagsBuilder_ == null) {
        if (!other.tags_.isEmpty()) {
          if (tags_.isEmpty()) {
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTagsIsMutable();
            tags_.addAll(other.tags_);
          }
          onChanged();
        }
      } else {
        if (!other.tags_.isEmpty()) {
          if (tagsBuilder_.isEmpty()) {
            tagsBuilder_.dispose();
            tagsBuilder_ = null;
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000002);
            tagsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTagsFieldBuilder() : null;
          } else {
            tagsBuilder_.addAllMessages(other.tags_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.lightstep.tracer.grpc.Reporter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.lightstep.tracer.grpc.Reporter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long reporterId_ ;
    /**
     * <code>uint64 reporter_id = 1;</code>
     */
    public long getReporterId() {
      return reporterId_;
    }
    /**
     * <code>uint64 reporter_id = 1;</code>
     */
    public Builder setReporterId(long value) {
      
      reporterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 reporter_id = 1;</code>
     */
    public Builder clearReporterId() {
      
      reporterId_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.lightstep.tracer.grpc.KeyValue> tags_ =
      java.util.Collections.emptyList();
    private void ensureTagsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        tags_ = new java.util.ArrayList<com.lightstep.tracer.grpc.KeyValue>(tags_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.lightstep.tracer.grpc.KeyValue, com.lightstep.tracer.grpc.KeyValue.Builder, com.lightstep.tracer.grpc.KeyValueOrBuilder> tagsBuilder_;

    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public java.util.List<com.lightstep.tracer.grpc.KeyValue> getTagsList() {
      if (tagsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tags_);
      } else {
        return tagsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public int getTagsCount() {
      if (tagsBuilder_ == null) {
        return tags_.size();
      } else {
        return tagsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public com.lightstep.tracer.grpc.KeyValue getTags(int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);
      } else {
        return tagsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public Builder setTags(
        int index, com.lightstep.tracer.grpc.KeyValue value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.set(index, value);
        onChanged();
      } else {
        tagsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public Builder setTags(
        int index, com.lightstep.tracer.grpc.KeyValue.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.set(index, builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public Builder addTags(com.lightstep.tracer.grpc.KeyValue value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.add(value);
        onChanged();
      } else {
        tagsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public Builder addTags(
        int index, com.lightstep.tracer.grpc.KeyValue value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.add(index, value);
        onChanged();
      } else {
        tagsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public Builder addTags(
        com.lightstep.tracer.grpc.KeyValue.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.add(builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public Builder addTags(
        int index, com.lightstep.tracer.grpc.KeyValue.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.add(index, builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public Builder addAllTags(
        java.lang.Iterable<? extends com.lightstep.tracer.grpc.KeyValue> values) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tags_);
        onChanged();
      } else {
        tagsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public Builder clearTags() {
      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        tagsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public Builder removeTags(int index) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.remove(index);
        onChanged();
      } else {
        tagsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public com.lightstep.tracer.grpc.KeyValue.Builder getTagsBuilder(
        int index) {
      return getTagsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public com.lightstep.tracer.grpc.KeyValueOrBuilder getTagsOrBuilder(
        int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);  } else {
        return tagsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public java.util.List<? extends com.lightstep.tracer.grpc.KeyValueOrBuilder> 
         getTagsOrBuilderList() {
      if (tagsBuilder_ != null) {
        return tagsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tags_);
      }
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public com.lightstep.tracer.grpc.KeyValue.Builder addTagsBuilder() {
      return getTagsFieldBuilder().addBuilder(
          com.lightstep.tracer.grpc.KeyValue.getDefaultInstance());
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public com.lightstep.tracer.grpc.KeyValue.Builder addTagsBuilder(
        int index) {
      return getTagsFieldBuilder().addBuilder(
          index, com.lightstep.tracer.grpc.KeyValue.getDefaultInstance());
    }
    /**
     * <code>repeated .lightstep.collector.KeyValue tags = 4;</code>
     */
    public java.util.List<com.lightstep.tracer.grpc.KeyValue.Builder> 
         getTagsBuilderList() {
      return getTagsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.lightstep.tracer.grpc.KeyValue, com.lightstep.tracer.grpc.KeyValue.Builder, com.lightstep.tracer.grpc.KeyValueOrBuilder> 
        getTagsFieldBuilder() {
      if (tagsBuilder_ == null) {
        tagsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.lightstep.tracer.grpc.KeyValue, com.lightstep.tracer.grpc.KeyValue.Builder, com.lightstep.tracer.grpc.KeyValueOrBuilder>(
                tags_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        tags_ = null;
      }
      return tagsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lightstep.collector.Reporter)
  }

  // @@protoc_insertion_point(class_scope:lightstep.collector.Reporter)
  private static final com.lightstep.tracer.grpc.Reporter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lightstep.tracer.grpc.Reporter();
  }

  public static com.lightstep.tracer.grpc.Reporter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reporter>
      PARSER = new com.google.protobuf.AbstractParser<Reporter>() {
    public Reporter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Reporter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Reporter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reporter> getParserForType() {
    return PARSER;
  }

  public com.lightstep.tracer.grpc.Reporter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

