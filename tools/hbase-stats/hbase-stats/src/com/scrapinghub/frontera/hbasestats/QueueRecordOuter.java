// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QueueRecord.proto

package com.scrapinghub.frontera.hbasestats;

public final class QueueRecordOuter {
  private QueueRecordOuter() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface QueueRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hbasestats.QueueRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes fingerprint = 1;</code>
     */
    boolean hasFingerprint();
    /**
     * <code>required bytes fingerprint = 1;</code>
     */
    com.google.protobuf.ByteString getFingerprint();

    /**
     * <code>required sint32 hostCrc32 = 2;</code>
     */
    boolean hasHostCrc32();
    /**
     * <code>required sint32 hostCrc32 = 2;</code>
     */
    int getHostCrc32();

    /**
     * <code>optional int32 partitionId = 3;</code>
     */
    boolean hasPartitionId();
    /**
     * <code>optional int32 partitionId = 3;</code>
     */
    int getPartitionId();

    /**
     * <code>optional float start_interval = 4;</code>
     */
    boolean hasStartInterval();
    /**
     * <code>optional float start_interval = 4;</code>
     */
    float getStartInterval();

    /**
     * <code>optional float end_interval = 5;</code>
     */
    boolean hasEndInterval();
    /**
     * <code>optional float end_interval = 5;</code>
     */
    float getEndInterval();

    /**
     * <code>optional uint64 timestamp = 6;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>optional uint64 timestamp = 6;</code>
     */
    long getTimestamp();

    /**
     * <code>optional float score = 7;</code>
     */
    boolean hasScore();
    /**
     * <code>optional float score = 7;</code>
     */
    float getScore();

    /**
     * <code>optional string url = 8;</code>
     */
    boolean hasUrl();
    /**
     * <code>optional string url = 8;</code>
     */
    java.lang.String getUrl();
    /**
     * <code>optional string url = 8;</code>
     */
    com.google.protobuf.ByteString
        getUrlBytes();
  }
  /**
   * Protobuf type {@code hbasestats.QueueRecord}
   */
  public static final class QueueRecord extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:hbasestats.QueueRecord)
      QueueRecordOrBuilder {
    // Use QueueRecord.newBuilder() to construct.
    private QueueRecord(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private QueueRecord(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final QueueRecord defaultInstance;
    public static QueueRecord getDefaultInstance() {
      return defaultInstance;
    }

    public QueueRecord getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private QueueRecord(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              fingerprint_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              hostCrc32_ = input.readSInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              partitionId_ = input.readInt32();
              break;
            }
            case 37: {
              bitField0_ |= 0x00000008;
              startInterval_ = input.readFloat();
              break;
            }
            case 45: {
              bitField0_ |= 0x00000010;
              endInterval_ = input.readFloat();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              timestamp_ = input.readUInt64();
              break;
            }
            case 61: {
              bitField0_ |= 0x00000040;
              score_ = input.readFloat();
              break;
            }
            case 66: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000080;
              url_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.scrapinghub.frontera.hbasestats.QueueRecordOuter.internal_static_hbasestats_QueueRecord_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.scrapinghub.frontera.hbasestats.QueueRecordOuter.internal_static_hbasestats_QueueRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord.class, com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord.Builder.class);
    }

    public static com.google.protobuf.Parser<QueueRecord> PARSER =
        new com.google.protobuf.AbstractParser<QueueRecord>() {
      public QueueRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueueRecord(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<QueueRecord> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FINGERPRINT_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString fingerprint_;
    /**
     * <code>required bytes fingerprint = 1;</code>
     */
    public boolean hasFingerprint() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes fingerprint = 1;</code>
     */
    public com.google.protobuf.ByteString getFingerprint() {
      return fingerprint_;
    }

    public static final int HOSTCRC32_FIELD_NUMBER = 2;
    private int hostCrc32_;
    /**
     * <code>required sint32 hostCrc32 = 2;</code>
     */
    public boolean hasHostCrc32() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required sint32 hostCrc32 = 2;</code>
     */
    public int getHostCrc32() {
      return hostCrc32_;
    }

    public static final int PARTITIONID_FIELD_NUMBER = 3;
    private int partitionId_;
    /**
     * <code>optional int32 partitionId = 3;</code>
     */
    public boolean hasPartitionId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 partitionId = 3;</code>
     */
    public int getPartitionId() {
      return partitionId_;
    }

    public static final int START_INTERVAL_FIELD_NUMBER = 4;
    private float startInterval_;
    /**
     * <code>optional float start_interval = 4;</code>
     */
    public boolean hasStartInterval() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional float start_interval = 4;</code>
     */
    public float getStartInterval() {
      return startInterval_;
    }

    public static final int END_INTERVAL_FIELD_NUMBER = 5;
    private float endInterval_;
    /**
     * <code>optional float end_interval = 5;</code>
     */
    public boolean hasEndInterval() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional float end_interval = 5;</code>
     */
    public float getEndInterval() {
      return endInterval_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 6;
    private long timestamp_;
    /**
     * <code>optional uint64 timestamp = 6;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional uint64 timestamp = 6;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int SCORE_FIELD_NUMBER = 7;
    private float score_;
    /**
     * <code>optional float score = 7;</code>
     */
    public boolean hasScore() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional float score = 7;</code>
     */
    public float getScore() {
      return score_;
    }

    public static final int URL_FIELD_NUMBER = 8;
    private java.lang.Object url_;
    /**
     * <code>optional string url = 8;</code>
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional string url = 8;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          url_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string url = 8;</code>
     */
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

    private void initFields() {
      fingerprint_ = com.google.protobuf.ByteString.EMPTY;
      hostCrc32_ = 0;
      partitionId_ = 0;
      startInterval_ = 0F;
      endInterval_ = 0F;
      timestamp_ = 0L;
      score_ = 0F;
      url_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFingerprint()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHostCrc32()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, fingerprint_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeSInt32(2, hostCrc32_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, partitionId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeFloat(4, startInterval_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeFloat(5, endInterval_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt64(6, timestamp_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeFloat(7, score_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(8, getUrlBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, fingerprint_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(2, hostCrc32_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, partitionId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, startInterval_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, endInterval_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, timestamp_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, score_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, getUrlBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hbasestats.QueueRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hbasestats.QueueRecord)
        com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.scrapinghub.frontera.hbasestats.QueueRecordOuter.internal_static_hbasestats_QueueRecord_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.scrapinghub.frontera.hbasestats.QueueRecordOuter.internal_static_hbasestats_QueueRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord.class, com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord.Builder.class);
      }

      // Construct using com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        fingerprint_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        hostCrc32_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        partitionId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        startInterval_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000008);
        endInterval_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000010);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        score_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000040);
        url_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.scrapinghub.frontera.hbasestats.QueueRecordOuter.internal_static_hbasestats_QueueRecord_descriptor;
      }

      public com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord getDefaultInstanceForType() {
        return com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord.getDefaultInstance();
      }

      public com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord build() {
        com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord buildPartial() {
        com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord result = new com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fingerprint_ = fingerprint_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.hostCrc32_ = hostCrc32_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.partitionId_ = partitionId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.startInterval_ = startInterval_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.endInterval_ = endInterval_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.score_ = score_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.url_ = url_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord) {
          return mergeFrom((com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord other) {
        if (other == com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord.getDefaultInstance()) return this;
        if (other.hasFingerprint()) {
          setFingerprint(other.getFingerprint());
        }
        if (other.hasHostCrc32()) {
          setHostCrc32(other.getHostCrc32());
        }
        if (other.hasPartitionId()) {
          setPartitionId(other.getPartitionId());
        }
        if (other.hasStartInterval()) {
          setStartInterval(other.getStartInterval());
        }
        if (other.hasEndInterval()) {
          setEndInterval(other.getEndInterval());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasScore()) {
          setScore(other.getScore());
        }
        if (other.hasUrl()) {
          bitField0_ |= 0x00000080;
          url_ = other.url_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFingerprint()) {
          
          return false;
        }
        if (!hasHostCrc32()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.scrapinghub.frontera.hbasestats.QueueRecordOuter.QueueRecord) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString fingerprint_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes fingerprint = 1;</code>
       */
      public boolean hasFingerprint() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes fingerprint = 1;</code>
       */
      public com.google.protobuf.ByteString getFingerprint() {
        return fingerprint_;
      }
      /**
       * <code>required bytes fingerprint = 1;</code>
       */
      public Builder setFingerprint(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fingerprint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes fingerprint = 1;</code>
       */
      public Builder clearFingerprint() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fingerprint_ = getDefaultInstance().getFingerprint();
        onChanged();
        return this;
      }

      private int hostCrc32_ ;
      /**
       * <code>required sint32 hostCrc32 = 2;</code>
       */
      public boolean hasHostCrc32() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required sint32 hostCrc32 = 2;</code>
       */
      public int getHostCrc32() {
        return hostCrc32_;
      }
      /**
       * <code>required sint32 hostCrc32 = 2;</code>
       */
      public Builder setHostCrc32(int value) {
        bitField0_ |= 0x00000002;
        hostCrc32_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required sint32 hostCrc32 = 2;</code>
       */
      public Builder clearHostCrc32() {
        bitField0_ = (bitField0_ & ~0x00000002);
        hostCrc32_ = 0;
        onChanged();
        return this;
      }

      private int partitionId_ ;
      /**
       * <code>optional int32 partitionId = 3;</code>
       */
      public boolean hasPartitionId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 partitionId = 3;</code>
       */
      public int getPartitionId() {
        return partitionId_;
      }
      /**
       * <code>optional int32 partitionId = 3;</code>
       */
      public Builder setPartitionId(int value) {
        bitField0_ |= 0x00000004;
        partitionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 partitionId = 3;</code>
       */
      public Builder clearPartitionId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        partitionId_ = 0;
        onChanged();
        return this;
      }

      private float startInterval_ ;
      /**
       * <code>optional float start_interval = 4;</code>
       */
      public boolean hasStartInterval() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional float start_interval = 4;</code>
       */
      public float getStartInterval() {
        return startInterval_;
      }
      /**
       * <code>optional float start_interval = 4;</code>
       */
      public Builder setStartInterval(float value) {
        bitField0_ |= 0x00000008;
        startInterval_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float start_interval = 4;</code>
       */
      public Builder clearStartInterval() {
        bitField0_ = (bitField0_ & ~0x00000008);
        startInterval_ = 0F;
        onChanged();
        return this;
      }

      private float endInterval_ ;
      /**
       * <code>optional float end_interval = 5;</code>
       */
      public boolean hasEndInterval() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional float end_interval = 5;</code>
       */
      public float getEndInterval() {
        return endInterval_;
      }
      /**
       * <code>optional float end_interval = 5;</code>
       */
      public Builder setEndInterval(float value) {
        bitField0_ |= 0x00000010;
        endInterval_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float end_interval = 5;</code>
       */
      public Builder clearEndInterval() {
        bitField0_ = (bitField0_ & ~0x00000010);
        endInterval_ = 0F;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>optional uint64 timestamp = 6;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint64 timestamp = 6;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>optional uint64 timestamp = 6;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000020;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 timestamp = 6;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000020);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private float score_ ;
      /**
       * <code>optional float score = 7;</code>
       */
      public boolean hasScore() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional float score = 7;</code>
       */
      public float getScore() {
        return score_;
      }
      /**
       * <code>optional float score = 7;</code>
       */
      public Builder setScore(float value) {
        bitField0_ |= 0x00000040;
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float score = 7;</code>
       */
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000040);
        score_ = 0F;
        onChanged();
        return this;
      }

      private java.lang.Object url_ = "";
      /**
       * <code>optional string url = 8;</code>
       */
      public boolean hasUrl() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional string url = 8;</code>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            url_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string url = 8;</code>
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
       * <code>optional string url = 8;</code>
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string url = 8;</code>
       */
      public Builder clearUrl() {
        bitField0_ = (bitField0_ & ~0x00000080);
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <code>optional string url = 8;</code>
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        url_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hbasestats.QueueRecord)
    }

    static {
      defaultInstance = new QueueRecord(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hbasestats.QueueRecord)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hbasestats_QueueRecord_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hbasestats_QueueRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021QueueRecord.proto\022\nhbasestats\"\247\001\n\013Queu" +
      "eRecord\022\023\n\013fingerprint\030\001 \002(\014\022\021\n\thostCrc3" +
      "2\030\002 \002(\021\022\023\n\013partitionId\030\003 \001(\005\022\026\n\016start_in" +
      "terval\030\004 \001(\002\022\024\n\014end_interval\030\005 \001(\002\022\021\n\tti" +
      "mestamp\030\006 \001(\004\022\r\n\005score\030\007 \001(\002\022\013\n\003url\030\010 \001(" +
      "\tB7\n#com.scrapinghub.frontera.hbasestats" +
      "B\020QueueRecordOuter"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_hbasestats_QueueRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hbasestats_QueueRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_hbasestats_QueueRecord_descriptor,
        new java.lang.String[] { "Fingerprint", "HostCrc32", "PartitionId", "StartInterval", "EndInterval", "Timestamp", "Score", "Url", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
