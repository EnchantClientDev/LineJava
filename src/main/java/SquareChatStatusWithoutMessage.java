/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SquareChatStatusWithoutMessage implements org.apache.thrift.TBase<SquareChatStatusWithoutMessage, SquareChatStatusWithoutMessage._Fields>, java.io.Serializable, Cloneable, Comparable<SquareChatStatusWithoutMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareChatStatusWithoutMessage");

  private static final org.apache.thrift.protocol.TField MEMBER_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("memberCount", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField UNREAD_MESSAGE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("unreadMessageCount", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SquareChatStatusWithoutMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SquareChatStatusWithoutMessageTupleSchemeFactory());
  }

  public int memberCount; // required
  public int unreadMessageCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MEMBER_COUNT((short)1, "memberCount"),
    UNREAD_MESSAGE_COUNT((short)2, "unreadMessageCount");

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
        case 1: // MEMBER_COUNT
          return MEMBER_COUNT;
        case 2: // UNREAD_MESSAGE_COUNT
          return UNREAD_MESSAGE_COUNT;
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
  private static final int __MEMBERCOUNT_ISSET_ID = 0;
  private static final int __UNREADMESSAGECOUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MEMBER_COUNT, new org.apache.thrift.meta_data.FieldMetaData("memberCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UNREAD_MESSAGE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("unreadMessageCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareChatStatusWithoutMessage.class, metaDataMap);
  }

  public SquareChatStatusWithoutMessage() {
  }

  public SquareChatStatusWithoutMessage(
    int memberCount,
    int unreadMessageCount)
  {
    this();
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
    this.unreadMessageCount = unreadMessageCount;
    setUnreadMessageCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareChatStatusWithoutMessage(SquareChatStatusWithoutMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    this.memberCount = other.memberCount;
    this.unreadMessageCount = other.unreadMessageCount;
  }

  public SquareChatStatusWithoutMessage deepCopy() {
    return new SquareChatStatusWithoutMessage(this);
  }

  @Override
  public void clear() {
    setMemberCountIsSet(false);
    this.memberCount = 0;
    setUnreadMessageCountIsSet(false);
    this.unreadMessageCount = 0;
  }

  public int getMemberCount() {
    return this.memberCount;
  }

  public SquareChatStatusWithoutMessage setMemberCount(int memberCount) {
    this.memberCount = memberCount;
    setMemberCountIsSet(true);
    return this;
  }

  public void unsetMemberCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MEMBERCOUNT_ISSET_ID);
  }

  /** Returns true if field memberCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMemberCount() {
    return EncodingUtils.testBit(__isset_bitfield, __MEMBERCOUNT_ISSET_ID);
  }

  public void setMemberCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MEMBERCOUNT_ISSET_ID, value);
  }

  public int getUnreadMessageCount() {
    return this.unreadMessageCount;
  }

  public SquareChatStatusWithoutMessage setUnreadMessageCount(int unreadMessageCount) {
    this.unreadMessageCount = unreadMessageCount;
    setUnreadMessageCountIsSet(true);
    return this;
  }

  public void unsetUnreadMessageCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNREADMESSAGECOUNT_ISSET_ID);
  }

  /** Returns true if field unreadMessageCount is set (has been assigned a value) and false otherwise */
  public boolean isSetUnreadMessageCount() {
    return EncodingUtils.testBit(__isset_bitfield, __UNREADMESSAGECOUNT_ISSET_ID);
  }

  public void setUnreadMessageCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNREADMESSAGECOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MEMBER_COUNT:
      if (value == null) {
        unsetMemberCount();
      } else {
        setMemberCount((Integer)value);
      }
      break;

    case UNREAD_MESSAGE_COUNT:
      if (value == null) {
        unsetUnreadMessageCount();
      } else {
        setUnreadMessageCount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MEMBER_COUNT:
      return Integer.valueOf(getMemberCount());

    case UNREAD_MESSAGE_COUNT:
      return Integer.valueOf(getUnreadMessageCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MEMBER_COUNT:
      return isSetMemberCount();
    case UNREAD_MESSAGE_COUNT:
      return isSetUnreadMessageCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareChatStatusWithoutMessage)
      return this.equals((SquareChatStatusWithoutMessage)that);
    return false;
  }

  public boolean equals(SquareChatStatusWithoutMessage that) {
    if (that == null)
      return false;

    boolean this_present_memberCount = true;
    boolean that_present_memberCount = true;
    if (this_present_memberCount || that_present_memberCount) {
      if (!(this_present_memberCount && that_present_memberCount))
        return false;
      if (this.memberCount != that.memberCount)
        return false;
    }

    boolean this_present_unreadMessageCount = true;
    boolean that_present_unreadMessageCount = true;
    if (this_present_unreadMessageCount || that_present_unreadMessageCount) {
      if (!(this_present_unreadMessageCount && that_present_unreadMessageCount))
        return false;
      if (this.unreadMessageCount != that.unreadMessageCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SquareChatStatusWithoutMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMemberCount()).compareTo(other.isSetMemberCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemberCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memberCount, other.memberCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnreadMessageCount()).compareTo(other.isSetUnreadMessageCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnreadMessageCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unreadMessageCount, other.unreadMessageCount);
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
    StringBuilder sb = new StringBuilder("SquareChatStatusWithoutMessage(");
    boolean first = true;

    sb.append("memberCount:");
    sb.append(this.memberCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unreadMessageCount:");
    sb.append(this.unreadMessageCount);
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

  private static class SquareChatStatusWithoutMessageStandardSchemeFactory implements SchemeFactory {
    public SquareChatStatusWithoutMessageStandardScheme getScheme() {
      return new SquareChatStatusWithoutMessageStandardScheme();
    }
  }

  private static class SquareChatStatusWithoutMessageStandardScheme extends StandardScheme<SquareChatStatusWithoutMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareChatStatusWithoutMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MEMBER_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.memberCount = iprot.readI32();
              struct.setMemberCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNREAD_MESSAGE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.unreadMessageCount = iprot.readI32();
              struct.setUnreadMessageCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareChatStatusWithoutMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MEMBER_COUNT_FIELD_DESC);
      oprot.writeI32(struct.memberCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNREAD_MESSAGE_COUNT_FIELD_DESC);
      oprot.writeI32(struct.unreadMessageCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareChatStatusWithoutMessageTupleSchemeFactory implements SchemeFactory {
    public SquareChatStatusWithoutMessageTupleScheme getScheme() {
      return new SquareChatStatusWithoutMessageTupleScheme();
    }
  }

  private static class SquareChatStatusWithoutMessageTupleScheme extends TupleScheme<SquareChatStatusWithoutMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareChatStatusWithoutMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMemberCount()) {
        optionals.set(0);
      }
      if (struct.isSetUnreadMessageCount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMemberCount()) {
        oprot.writeI32(struct.memberCount);
      }
      if (struct.isSetUnreadMessageCount()) {
        oprot.writeI32(struct.unreadMessageCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareChatStatusWithoutMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.memberCount = iprot.readI32();
        struct.setMemberCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.unreadMessageCount = iprot.readI32();
        struct.setUnreadMessageCountIsSet(true);
      }
    }
  }

}
