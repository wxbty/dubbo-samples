// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/Meter.proto

package org.apache.skywalking.apm.network.language.agent.v3;

/**
 * <pre>
 * Single meter data, if the same metrics have a different label, they will separate.
 * </pre>
 *
 * Protobuf type {@code skywalking.v3.MeterData}
 */
public final class MeterData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.MeterData)
    MeterDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MeterData.newBuilder() to construct.
  private MeterData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MeterData() {
    service_ = "";
    serviceInstance_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new MeterData();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MeterData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            MeterSingleValue.Builder subBuilder = null;
            if (metricCase_ == 1) {
              subBuilder = ((MeterSingleValue) metric_).toBuilder();
            }
            metric_ =
                input.readMessage(MeterSingleValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((MeterSingleValue) metric_);
              metric_ = subBuilder.buildPartial();
            }
            metricCase_ = 1;
            break;
          }
          case 18: {
            MeterHistogram.Builder subBuilder = null;
            if (metricCase_ == 2) {
              subBuilder = ((MeterHistogram) metric_).toBuilder();
            }
            metric_ =
                input.readMessage(MeterHistogram.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((MeterHistogram) metric_);
              metric_ = subBuilder.buildPartial();
            }
            metricCase_ = 2;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            service_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            serviceInstance_ = s;
            break;
          }
          case 40: {

            timestamp_ = input.readInt64();
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
    return Meter.internal_static_skywalking_v3_MeterData_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Meter.internal_static_skywalking_v3_MeterData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            MeterData.class, Builder.class);
  }

  private int metricCase_ = 0;
  private Object metric_;
  public enum MetricCase
      implements com.google.protobuf.Internal.EnumLite,
          InternalOneOfEnum {
    SINGLEVALUE(1),
    HISTOGRAM(2),
    METRIC_NOT_SET(0);
    private final int value;
    private MetricCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static MetricCase valueOf(int value) {
      return forNumber(value);
    }

    public static MetricCase forNumber(int value) {
      switch (value) {
        case 1: return SINGLEVALUE;
        case 2: return HISTOGRAM;
        case 0: return METRIC_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MetricCase
  getMetricCase() {
    return MetricCase.forNumber(
        metricCase_);
  }

  public static final int SINGLEVALUE_FIELD_NUMBER = 1;
  /**
   * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
   * @return Whether the singleValue field is set.
   */
  @Override
  public boolean hasSingleValue() {
    return metricCase_ == 1;
  }
  /**
   * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
   * @return The singleValue.
   */
  @Override
  public MeterSingleValue getSingleValue() {
    if (metricCase_ == 1) {
       return (MeterSingleValue) metric_;
    }
    return MeterSingleValue.getDefaultInstance();
  }
  /**
   * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
   */
  @Override
  public MeterSingleValueOrBuilder getSingleValueOrBuilder() {
    if (metricCase_ == 1) {
       return (MeterSingleValue) metric_;
    }
    return MeterSingleValue.getDefaultInstance();
  }

  public static final int HISTOGRAM_FIELD_NUMBER = 2;
  /**
   * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
   * @return Whether the histogram field is set.
   */
  @Override
  public boolean hasHistogram() {
    return metricCase_ == 2;
  }
  /**
   * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
   * @return The histogram.
   */
  @Override
  public MeterHistogram getHistogram() {
    if (metricCase_ == 2) {
       return (MeterHistogram) metric_;
    }
    return MeterHistogram.getDefaultInstance();
  }
  /**
   * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
   */
  @Override
  public MeterHistogramOrBuilder getHistogramOrBuilder() {
    if (metricCase_ == 2) {
       return (MeterHistogram) metric_;
    }
    return MeterHistogram.getDefaultInstance();
  }

  public static final int SERVICE_FIELD_NUMBER = 3;
  private volatile Object service_;
  /**
   * <pre>
   * Service name, be set value in the first element in the stream-call.
   * </pre>
   *
   * <code>string service = 3;</code>
   * @return The service.
   */
  @Override
  public String getService() {
    Object ref = service_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Service name, be set value in the first element in the stream-call.
   * </pre>
   *
   * <code>string service = 3;</code>
   * @return The bytes for service.
   */
  @Override
  public com.google.protobuf.ByteString
      getServiceBytes() {
    Object ref = service_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICEINSTANCE_FIELD_NUMBER = 4;
  private volatile Object serviceInstance_;
  /**
   * <pre>
   * Service instance name, be set value in the first element in the stream-call.
   * </pre>
   *
   * <code>string serviceInstance = 4;</code>
   * @return The serviceInstance.
   */
  @Override
  public String getServiceInstance() {
    Object ref = serviceInstance_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      serviceInstance_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Service instance name, be set value in the first element in the stream-call.
   * </pre>
   *
   * <code>string serviceInstance = 4;</code>
   * @return The bytes for serviceInstance.
   */
  @Override
  public com.google.protobuf.ByteString
      getServiceInstanceBytes() {
    Object ref = serviceInstance_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      serviceInstance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 5;
  private long timestamp_;
  /**
   * <pre>
   * Meter data report time, be set value in the first element in the stream-call.
   * </pre>
   *
   * <code>int64 timestamp = 5;</code>
   * @return The timestamp.
   */
  @Override
  public long getTimestamp() {
    return timestamp_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (metricCase_ == 1) {
      output.writeMessage(1, (MeterSingleValue) metric_);
    }
    if (metricCase_ == 2) {
      output.writeMessage(2, (MeterHistogram) metric_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceInstance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, serviceInstance_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(5, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metricCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (MeterSingleValue) metric_);
    }
    if (metricCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (MeterHistogram) metric_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceInstance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, serviceInstance_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, timestamp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof MeterData)) {
      return super.equals(obj);
    }
    MeterData other = (MeterData) obj;

    if (!getService()
        .equals(other.getService())) return false;
    if (!getServiceInstance()
        .equals(other.getServiceInstance())) return false;
    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (!getMetricCase().equals(other.getMetricCase())) return false;
    switch (metricCase_) {
      case 1:
        if (!getSingleValue()
            .equals(other.getSingleValue())) return false;
        break;
      case 2:
        if (!getHistogram()
            .equals(other.getHistogram())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + SERVICEINSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getServiceInstance().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    switch (metricCase_) {
      case 1:
        hash = (37 * hash) + SINGLEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getSingleValue().hashCode();
        break;
      case 2:
        hash = (37 * hash) + HISTOGRAM_FIELD_NUMBER;
        hash = (53 * hash) + getHistogram().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static MeterData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MeterData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MeterData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MeterData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MeterData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static MeterData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static MeterData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MeterData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static MeterData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static MeterData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static MeterData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static MeterData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(MeterData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Single meter data, if the same metrics have a different label, they will separate.
   * </pre>
   *
   * Protobuf type {@code skywalking.v3.MeterData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.MeterData)
      MeterDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Meter.internal_static_skywalking_v3_MeterData_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Meter.internal_static_skywalking_v3_MeterData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MeterData.class, Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.v3.MeterData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      service_ = "";

      serviceInstance_ = "";

      timestamp_ = 0L;

      metricCase_ = 0;
      metric_ = null;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Meter.internal_static_skywalking_v3_MeterData_descriptor;
    }

    @Override
    public MeterData getDefaultInstanceForType() {
      return MeterData.getDefaultInstance();
    }

    @Override
    public MeterData build() {
      MeterData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public MeterData buildPartial() {
      MeterData result = new MeterData(this);
      if (metricCase_ == 1) {
        if (singleValueBuilder_ == null) {
          result.metric_ = metric_;
        } else {
          result.metric_ = singleValueBuilder_.build();
        }
      }
      if (metricCase_ == 2) {
        if (histogramBuilder_ == null) {
          result.metric_ = metric_;
        } else {
          result.metric_ = histogramBuilder_.build();
        }
      }
      result.service_ = service_;
      result.serviceInstance_ = serviceInstance_;
      result.timestamp_ = timestamp_;
      result.metricCase_ = metricCase_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof MeterData) {
        return mergeFrom((MeterData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(MeterData other) {
      if (other == MeterData.getDefaultInstance()) return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        onChanged();
      }
      if (!other.getServiceInstance().isEmpty()) {
        serviceInstance_ = other.serviceInstance_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      switch (other.getMetricCase()) {
        case SINGLEVALUE: {
          mergeSingleValue(other.getSingleValue());
          break;
        }
        case HISTOGRAM: {
          mergeHistogram(other.getHistogram());
          break;
        }
        case METRIC_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      MeterData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (MeterData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int metricCase_ = 0;
    private Object metric_;
    public MetricCase
        getMetricCase() {
      return MetricCase.forNumber(
          metricCase_);
    }

    public Builder clearMetric() {
      metricCase_ = 0;
      metric_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        MeterSingleValue, MeterSingleValue.Builder, MeterSingleValueOrBuilder> singleValueBuilder_;
    /**
     * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
     * @return Whether the singleValue field is set.
     */
    @Override
    public boolean hasSingleValue() {
      return metricCase_ == 1;
    }
    /**
     * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
     * @return The singleValue.
     */
    @Override
    public MeterSingleValue getSingleValue() {
      if (singleValueBuilder_ == null) {
        if (metricCase_ == 1) {
          return (MeterSingleValue) metric_;
        }
        return MeterSingleValue.getDefaultInstance();
      } else {
        if (metricCase_ == 1) {
          return singleValueBuilder_.getMessage();
        }
        return MeterSingleValue.getDefaultInstance();
      }
    }
    /**
     * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
     */
    public Builder setSingleValue(MeterSingleValue value) {
      if (singleValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metric_ = value;
        onChanged();
      } else {
        singleValueBuilder_.setMessage(value);
      }
      metricCase_ = 1;
      return this;
    }
    /**
     * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
     */
    public Builder setSingleValue(
        MeterSingleValue.Builder builderForValue) {
      if (singleValueBuilder_ == null) {
        metric_ = builderForValue.build();
        onChanged();
      } else {
        singleValueBuilder_.setMessage(builderForValue.build());
      }
      metricCase_ = 1;
      return this;
    }
    /**
     * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
     */
    public Builder mergeSingleValue(MeterSingleValue value) {
      if (singleValueBuilder_ == null) {
        if (metricCase_ == 1 &&
            metric_ != MeterSingleValue.getDefaultInstance()) {
          metric_ = MeterSingleValue.newBuilder((MeterSingleValue) metric_)
              .mergeFrom(value).buildPartial();
        } else {
          metric_ = value;
        }
        onChanged();
      } else {
        if (metricCase_ == 1) {
          singleValueBuilder_.mergeFrom(value);
        }
        singleValueBuilder_.setMessage(value);
      }
      metricCase_ = 1;
      return this;
    }
    /**
     * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
     */
    public Builder clearSingleValue() {
      if (singleValueBuilder_ == null) {
        if (metricCase_ == 1) {
          metricCase_ = 0;
          metric_ = null;
          onChanged();
        }
      } else {
        if (metricCase_ == 1) {
          metricCase_ = 0;
          metric_ = null;
        }
        singleValueBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
     */
    public MeterSingleValue.Builder getSingleValueBuilder() {
      return getSingleValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
     */
    @Override
    public MeterSingleValueOrBuilder getSingleValueOrBuilder() {
      if ((metricCase_ == 1) && (singleValueBuilder_ != null)) {
        return singleValueBuilder_.getMessageOrBuilder();
      } else {
        if (metricCase_ == 1) {
          return (MeterSingleValue) metric_;
        }
        return MeterSingleValue.getDefaultInstance();
      }
    }
    /**
     * <code>.skywalking.v3.MeterSingleValue singleValue = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        MeterSingleValue, MeterSingleValue.Builder, MeterSingleValueOrBuilder>
        getSingleValueFieldBuilder() {
      if (singleValueBuilder_ == null) {
        if (!(metricCase_ == 1)) {
          metric_ = MeterSingleValue.getDefaultInstance();
        }
        singleValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            MeterSingleValue, MeterSingleValue.Builder, MeterSingleValueOrBuilder>(
                (MeterSingleValue) metric_,
                getParentForChildren(),
                isClean());
        metric_ = null;
      }
      metricCase_ = 1;
      onChanged();;
      return singleValueBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        MeterHistogram, MeterHistogram.Builder, MeterHistogramOrBuilder> histogramBuilder_;
    /**
     * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
     * @return Whether the histogram field is set.
     */
    @Override
    public boolean hasHistogram() {
      return metricCase_ == 2;
    }
    /**
     * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
     * @return The histogram.
     */
    @Override
    public MeterHistogram getHistogram() {
      if (histogramBuilder_ == null) {
        if (metricCase_ == 2) {
          return (MeterHistogram) metric_;
        }
        return MeterHistogram.getDefaultInstance();
      } else {
        if (metricCase_ == 2) {
          return histogramBuilder_.getMessage();
        }
        return MeterHistogram.getDefaultInstance();
      }
    }
    /**
     * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
     */
    public Builder setHistogram(MeterHistogram value) {
      if (histogramBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metric_ = value;
        onChanged();
      } else {
        histogramBuilder_.setMessage(value);
      }
      metricCase_ = 2;
      return this;
    }
    /**
     * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
     */
    public Builder setHistogram(
        MeterHistogram.Builder builderForValue) {
      if (histogramBuilder_ == null) {
        metric_ = builderForValue.build();
        onChanged();
      } else {
        histogramBuilder_.setMessage(builderForValue.build());
      }
      metricCase_ = 2;
      return this;
    }
    /**
     * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
     */
    public Builder mergeHistogram(MeterHistogram value) {
      if (histogramBuilder_ == null) {
        if (metricCase_ == 2 &&
            metric_ != MeterHistogram.getDefaultInstance()) {
          metric_ = MeterHistogram.newBuilder((MeterHistogram) metric_)
              .mergeFrom(value).buildPartial();
        } else {
          metric_ = value;
        }
        onChanged();
      } else {
        if (metricCase_ == 2) {
          histogramBuilder_.mergeFrom(value);
        }
        histogramBuilder_.setMessage(value);
      }
      metricCase_ = 2;
      return this;
    }
    /**
     * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
     */
    public Builder clearHistogram() {
      if (histogramBuilder_ == null) {
        if (metricCase_ == 2) {
          metricCase_ = 0;
          metric_ = null;
          onChanged();
        }
      } else {
        if (metricCase_ == 2) {
          metricCase_ = 0;
          metric_ = null;
        }
        histogramBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
     */
    public MeterHistogram.Builder getHistogramBuilder() {
      return getHistogramFieldBuilder().getBuilder();
    }
    /**
     * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
     */
    @Override
    public MeterHistogramOrBuilder getHistogramOrBuilder() {
      if ((metricCase_ == 2) && (histogramBuilder_ != null)) {
        return histogramBuilder_.getMessageOrBuilder();
      } else {
        if (metricCase_ == 2) {
          return (MeterHistogram) metric_;
        }
        return MeterHistogram.getDefaultInstance();
      }
    }
    /**
     * <code>.skywalking.v3.MeterHistogram histogram = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        MeterHistogram, MeterHistogram.Builder, MeterHistogramOrBuilder>
        getHistogramFieldBuilder() {
      if (histogramBuilder_ == null) {
        if (!(metricCase_ == 2)) {
          metric_ = MeterHistogram.getDefaultInstance();
        }
        histogramBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            MeterHistogram, MeterHistogram.Builder, MeterHistogramOrBuilder>(
                (MeterHistogram) metric_,
                getParentForChildren(),
                isClean());
        metric_ = null;
      }
      metricCase_ = 2;
      onChanged();;
      return histogramBuilder_;
    }

    private Object service_ = "";
    /**
     * <pre>
     * Service name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string service = 3;</code>
     * @return The service.
     */
    public String getService() {
      Object ref = service_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Service name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string service = 3;</code>
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Service name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string service = 3;</code>
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      service_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Service name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string service = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearService() {

      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Service name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string service = 3;</code>
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      service_ = value;
      onChanged();
      return this;
    }

    private Object serviceInstance_ = "";
    /**
     * <pre>
     * Service instance name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string serviceInstance = 4;</code>
     * @return The serviceInstance.
     */
    public String getServiceInstance() {
      Object ref = serviceInstance_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        serviceInstance_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Service instance name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string serviceInstance = 4;</code>
     * @return The bytes for serviceInstance.
     */
    public com.google.protobuf.ByteString
        getServiceInstanceBytes() {
      Object ref = serviceInstance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        serviceInstance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Service instance name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string serviceInstance = 4;</code>
     * @param value The serviceInstance to set.
     * @return This builder for chaining.
     */
    public Builder setServiceInstance(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      serviceInstance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Service instance name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string serviceInstance = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceInstance() {

      serviceInstance_ = getDefaultInstance().getServiceInstance();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Service instance name, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>string serviceInstance = 4;</code>
     * @param value The bytes for serviceInstance to set.
     * @return This builder for chaining.
     */
    public Builder setServiceInstanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      serviceInstance_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <pre>
     * Meter data report time, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>int64 timestamp = 5;</code>
     * @return The timestamp.
     */
    @Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <pre>
     * Meter data report time, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>int64 timestamp = 5;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {

      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Meter data report time, be set value in the first element in the stream-call.
     * </pre>
     *
     * <code>int64 timestamp = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {

      timestamp_ = 0L;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:skywalking.v3.MeterData)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.MeterData)
  private static final MeterData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MeterData();
  }

  public static MeterData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MeterData>
      PARSER = new com.google.protobuf.AbstractParser<MeterData>() {
    @Override
    public MeterData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MeterData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MeterData> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MeterData> getParserForType() {
    return PARSER;
  }

  @Override
  public MeterData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
