package com.facebook.beringei.thriftclient;

/**

 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;

import org.apache.thrift.EncodingUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;

import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-22")
public class ServiceMap implements org.apache.thrift.TBase<ServiceMap, ServiceMap._Fields>, java.io.Serializable, Cloneable, Comparable<ServiceMap> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServiceMap");

  private static final org.apache.thrift.protocol.TField SERVICE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IS_LOGGING_NEW_KEYS_ENABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("isLoggingNewKeysEnabled", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField SHARD_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("shardMap", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ServiceMapStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ServiceMapTupleSchemeFactory());
  }

  public String serviceName; // required
  public String location; // required
  public boolean isLoggingNewKeysEnabled; // required
  public List<ShardInfo> shardMap; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SERVICE_NAME((short)1, "serviceName"),
    LOCATION((short)2, "location"),
    IS_LOGGING_NEW_KEYS_ENABLED((short)3, "isLoggingNewKeysEnabled"),
    SHARD_MAP((short)4, "shardMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SERVICE_NAME
          return SERVICE_NAME;
        case 2: // LOCATION
          return LOCATION;
        case 3: // IS_LOGGING_NEW_KEYS_ENABLED
          return IS_LOGGING_NEW_KEYS_ENABLED;
        case 4: // SHARD_MAP
          return SHARD_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISLOGGINGNEWKEYSENABLED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SERVICE_NAME, new org.apache.thrift.meta_data.FieldMetaData("serviceName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_LOGGING_NEW_KEYS_ENABLED, new org.apache.thrift.meta_data.FieldMetaData("isLoggingNewKeysEnabled", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SHARD_MAP, new org.apache.thrift.meta_data.FieldMetaData("shardMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ShardInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServiceMap.class, metaDataMap);
  }

  public ServiceMap() {
  }

  public ServiceMap(
    String serviceName,
    String location,
    boolean isLoggingNewKeysEnabled,
    List<ShardInfo> shardMap)
  {
    this();
    this.serviceName = serviceName;
    this.location = location;
    this.isLoggingNewKeysEnabled = isLoggingNewKeysEnabled;
    setIsLoggingNewKeysEnabledIsSet(true);
    this.shardMap = shardMap;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServiceMap(ServiceMap other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetServiceName()) {
      this.serviceName = other.serviceName;
    }
    if (other.isSetLocation()) {
      this.location = other.location;
    }
    this.isLoggingNewKeysEnabled = other.isLoggingNewKeysEnabled;
    if (other.isSetShardMap()) {
      List<ShardInfo> __this__shardMap = new ArrayList<ShardInfo>(other.shardMap.size());
      for (ShardInfo other_element : other.shardMap) {
        __this__shardMap.add(new ShardInfo(other_element));
      }
      this.shardMap = __this__shardMap;
    }
  }

  public ServiceMap deepCopy() {
    return new ServiceMap(this);
  }

  @Override
  public void clear() {
    this.serviceName = null;
    this.location = null;
    setIsLoggingNewKeysEnabledIsSet(false);
    this.isLoggingNewKeysEnabled = false;
    this.shardMap = null;
  }

  public String getServiceName() {
    return this.serviceName;
  }

  public ServiceMap setServiceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  public void unsetServiceName() {
    this.serviceName = null;
  }

  /** Returns true if field serviceName is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceName() {
    return this.serviceName != null;
  }

  public void setServiceNameIsSet(boolean value) {
    if (!value) {
      this.serviceName = null;
    }
  }

  public String getLocation() {
    return this.location;
  }

  public ServiceMap setLocation(String location) {
    this.location = location;
    return this;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public boolean isIsLoggingNewKeysEnabled() {
    return this.isLoggingNewKeysEnabled;
  }

  public ServiceMap setIsLoggingNewKeysEnabled(boolean isLoggingNewKeysEnabled) {
    this.isLoggingNewKeysEnabled = isLoggingNewKeysEnabled;
    setIsLoggingNewKeysEnabledIsSet(true);
    return this;
  }

  public void unsetIsLoggingNewKeysEnabled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISLOGGINGNEWKEYSENABLED_ISSET_ID);
  }

  /** Returns true if field isLoggingNewKeysEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetIsLoggingNewKeysEnabled() {
    return EncodingUtils.testBit(__isset_bitfield, __ISLOGGINGNEWKEYSENABLED_ISSET_ID);
  }

  public void setIsLoggingNewKeysEnabledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISLOGGINGNEWKEYSENABLED_ISSET_ID, value);
  }

  public int getShardMapSize() {
    return (this.shardMap == null) ? 0 : this.shardMap.size();
  }

  public java.util.Iterator<ShardInfo> getShardMapIterator() {
    return (this.shardMap == null) ? null : this.shardMap.iterator();
  }

  public void addToShardMap(ShardInfo elem) {
    if (this.shardMap == null) {
      this.shardMap = new ArrayList<ShardInfo>();
    }
    this.shardMap.add(elem);
  }

  public List<ShardInfo> getShardMap() {
    return this.shardMap;
  }

  public ServiceMap setShardMap(List<ShardInfo> shardMap) {
    this.shardMap = shardMap;
    return this;
  }

  public void unsetShardMap() {
    this.shardMap = null;
  }

  /** Returns true if field shardMap is set (has been assigned a value) and false otherwise */
  public boolean isSetShardMap() {
    return this.shardMap != null;
  }

  public void setShardMapIsSet(boolean value) {
    if (!value) {
      this.shardMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SERVICE_NAME:
      if (value == null) {
        unsetServiceName();
      } else {
        setServiceName((String)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((String)value);
      }
      break;

    case IS_LOGGING_NEW_KEYS_ENABLED:
      if (value == null) {
        unsetIsLoggingNewKeysEnabled();
      } else {
        setIsLoggingNewKeysEnabled((Boolean)value);
      }
      break;

    case SHARD_MAP:
      if (value == null) {
        unsetShardMap();
      } else {
        setShardMap((List<ShardInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SERVICE_NAME:
      return getServiceName();

    case LOCATION:
      return getLocation();

    case IS_LOGGING_NEW_KEYS_ENABLED:
      return isIsLoggingNewKeysEnabled();

    case SHARD_MAP:
      return getShardMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SERVICE_NAME:
      return isSetServiceName();
    case LOCATION:
      return isSetLocation();
    case IS_LOGGING_NEW_KEYS_ENABLED:
      return isSetIsLoggingNewKeysEnabled();
    case SHARD_MAP:
      return isSetShardMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServiceMap)
      return this.equals((ServiceMap)that);
    return false;
  }

  public boolean equals(ServiceMap that) {
    if (that == null)
      return false;

    boolean this_present_serviceName = true && this.isSetServiceName();
    boolean that_present_serviceName = true && that.isSetServiceName();
    if (this_present_serviceName || that_present_serviceName) {
      if (!(this_present_serviceName && that_present_serviceName))
        return false;
      if (!this.serviceName.equals(that.serviceName))
        return false;
    }

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    boolean this_present_isLoggingNewKeysEnabled = true;
    boolean that_present_isLoggingNewKeysEnabled = true;
    if (this_present_isLoggingNewKeysEnabled || that_present_isLoggingNewKeysEnabled) {
      if (!(this_present_isLoggingNewKeysEnabled && that_present_isLoggingNewKeysEnabled))
        return false;
      if (this.isLoggingNewKeysEnabled != that.isLoggingNewKeysEnabled)
        return false;
    }

    boolean this_present_shardMap = true && this.isSetShardMap();
    boolean that_present_shardMap = true && that.isSetShardMap();
    if (this_present_shardMap || that_present_shardMap) {
      if (!(this_present_shardMap && that_present_shardMap))
        return false;
      if (!this.shardMap.equals(that.shardMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_serviceName = true && (isSetServiceName());
    list.add(present_serviceName);
    if (present_serviceName)
      list.add(serviceName);

    boolean present_location = true && (isSetLocation());
    list.add(present_location);
    if (present_location)
      list.add(location);

    boolean present_isLoggingNewKeysEnabled = true;
    list.add(present_isLoggingNewKeysEnabled);
    if (present_isLoggingNewKeysEnabled)
      list.add(isLoggingNewKeysEnabled);

    boolean present_shardMap = true && (isSetShardMap());
    list.add(present_shardMap);
    if (present_shardMap)
      list.add(shardMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(ServiceMap other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetServiceName()).compareTo(other.isSetServiceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceName, other.serviceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, other.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsLoggingNewKeysEnabled()).compareTo(other.isSetIsLoggingNewKeysEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsLoggingNewKeysEnabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isLoggingNewKeysEnabled, other.isLoggingNewKeysEnabled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShardMap()).compareTo(other.isSetShardMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShardMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shardMap, other.shardMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ServiceMap(");
    boolean first = true;

    sb.append("serviceName:");
    if (this.serviceName == null) {
      sb.append("null");
    } else {
      sb.append(this.serviceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isLoggingNewKeysEnabled:");
    sb.append(this.isLoggingNewKeysEnabled);
    first = false;
    if (!first) sb.append(", ");
    sb.append("shardMap:");
    if (this.shardMap == null) {
      sb.append("null");
    } else {
      sb.append(this.shardMap);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ServiceMapStandardSchemeFactory implements SchemeFactory {
    public ServiceMapStandardScheme getScheme() {
      return new ServiceMapStandardScheme();
    }
  }

  private static class ServiceMapStandardScheme extends StandardScheme<ServiceMap> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServiceMap struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SERVICE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serviceName = iprot.readString();
              struct.setServiceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.location = iprot.readString();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_LOGGING_NEW_KEYS_ENABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isLoggingNewKeysEnabled = iprot.readBool();
              struct.setIsLoggingNewKeysEnabledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SHARD_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list72 = iprot.readListBegin();
                struct.shardMap = new ArrayList<ShardInfo>(_list72.size);
                ShardInfo _elem73;
                for (int _i74 = 0; _i74 < _list72.size; ++_i74)
                {
                  _elem73 = new ShardInfo();
                  _elem73.read(iprot);
                  struct.shardMap.add(_elem73);
                }
                iprot.readListEnd();
              }
              struct.setShardMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServiceMap struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.serviceName != null) {
        oprot.writeFieldBegin(SERVICE_NAME_FIELD_DESC);
        oprot.writeString(struct.serviceName);
        oprot.writeFieldEnd();
      }
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        oprot.writeString(struct.location);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_LOGGING_NEW_KEYS_ENABLED_FIELD_DESC);
      oprot.writeBool(struct.isLoggingNewKeysEnabled);
      oprot.writeFieldEnd();
      if (struct.shardMap != null) {
        oprot.writeFieldBegin(SHARD_MAP_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.shardMap.size()));
          for (ShardInfo _iter75 : struct.shardMap)
          {
            _iter75.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServiceMapTupleSchemeFactory implements SchemeFactory {
    public ServiceMapTupleScheme getScheme() {
      return new ServiceMapTupleScheme();
    }
  }

  private static class ServiceMapTupleScheme extends TupleScheme<ServiceMap> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ServiceMap struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetServiceName()) {
        optionals.set(0);
      }
      if (struct.isSetLocation()) {
        optionals.set(1);
      }
      if (struct.isSetIsLoggingNewKeysEnabled()) {
        optionals.set(2);
      }
      if (struct.isSetShardMap()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetServiceName()) {
        oprot.writeString(struct.serviceName);
      }
      if (struct.isSetLocation()) {
        oprot.writeString(struct.location);
      }
      if (struct.isSetIsLoggingNewKeysEnabled()) {
        oprot.writeBool(struct.isLoggingNewKeysEnabled);
      }
      if (struct.isSetShardMap()) {
        {
          oprot.writeI32(struct.shardMap.size());
          for (ShardInfo _iter76 : struct.shardMap)
          {
            _iter76.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ServiceMap struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.serviceName = iprot.readString();
        struct.setServiceNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.location = iprot.readString();
        struct.setLocationIsSet(true);
      }
      if (incoming.get(2)) {
        struct.isLoggingNewKeysEnabled = iprot.readBool();
        struct.setIsLoggingNewKeysEnabledIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list77 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.shardMap = new ArrayList<ShardInfo>(_list77.size);
          ShardInfo _elem78;
          for (int _i79 = 0; _i79 < _list77.size; ++_i79)
          {
            _elem78 = new ShardInfo();
            _elem78.read(iprot);
            struct.shardMap.add(_elem78);
          }
        }
        struct.setShardMapIsSet(true);
      }
    }
  }

}

