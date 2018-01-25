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

public class SquareChatMember implements org.apache.thrift.TBase<SquareChatMember, SquareChatMember._Fields>, java.io.Serializable, Cloneable, Comparable<SquareChatMember> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareChatMember");

  private static final org.apache.thrift.protocol.TField SQUARE_MEMBER_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMemberMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("revision", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField MEMBERSHIP_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("membershipState", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_FOR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationForMessage", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SquareChatMemberStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SquareChatMemberTupleSchemeFactory());
  }

  public String squareMemberMid; // required
  public String squareChatMid; // required
  public long revision; // required
  /**
   * 
   * @see SquareChatMembershipState
   */
  public SquareChatMembershipState membershipState; // required
  public boolean notificationForMessage; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_MEMBER_MID((short)1, "squareMemberMid"),
    SQUARE_CHAT_MID((short)2, "squareChatMid"),
    REVISION((short)3, "revision"),
    /**
     * 
     * @see SquareChatMembershipState
     */
    MEMBERSHIP_STATE((short)4, "membershipState"),
    NOTIFICATION_FOR_MESSAGE((short)5, "notificationForMessage");

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
        case 1: // SQUARE_MEMBER_MID
          return SQUARE_MEMBER_MID;
        case 2: // SQUARE_CHAT_MID
          return SQUARE_CHAT_MID;
        case 3: // REVISION
          return REVISION;
        case 4: // MEMBERSHIP_STATE
          return MEMBERSHIP_STATE;
        case 5: // NOTIFICATION_FOR_MESSAGE
          return NOTIFICATION_FOR_MESSAGE;
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
  private static final int __REVISION_ISSET_ID = 0;
  private static final int __NOTIFICATIONFORMESSAGE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQUARE_MEMBER_MID, new org.apache.thrift.meta_data.FieldMetaData("squareMemberMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REVISION, new org.apache.thrift.meta_data.FieldMetaData("revision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MEMBERSHIP_STATE, new org.apache.thrift.meta_data.FieldMetaData("membershipState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareChatMembershipState.class)));
    tmpMap.put(_Fields.NOTIFICATION_FOR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("notificationForMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareChatMember.class, metaDataMap);
  }

  public SquareChatMember() {
  }

  public SquareChatMember(
    String squareMemberMid,
    String squareChatMid,
    long revision,
    SquareChatMembershipState membershipState,
    boolean notificationForMessage)
  {
    this();
    this.squareMemberMid = squareMemberMid;
    this.squareChatMid = squareChatMid;
    this.revision = revision;
    setRevisionIsSet(true);
    this.membershipState = membershipState;
    this.notificationForMessage = notificationForMessage;
    setNotificationForMessageIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareChatMember(SquareChatMember other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSquareMemberMid()) {
      this.squareMemberMid = other.squareMemberMid;
    }
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    this.revision = other.revision;
    if (other.isSetMembershipState()) {
      this.membershipState = other.membershipState;
    }
    this.notificationForMessage = other.notificationForMessage;
  }

  public SquareChatMember deepCopy() {
    return new SquareChatMember(this);
  }

  @Override
  public void clear() {
    this.squareMemberMid = null;
    this.squareChatMid = null;
    setRevisionIsSet(false);
    this.revision = 0;
    this.membershipState = null;
    setNotificationForMessageIsSet(false);
    this.notificationForMessage = false;
  }

  public String getSquareMemberMid() {
    return this.squareMemberMid;
  }

  public SquareChatMember setSquareMemberMid(String squareMemberMid) {
    this.squareMemberMid = squareMemberMid;
    return this;
  }

  public void unsetSquareMemberMid() {
    this.squareMemberMid = null;
  }

  /** Returns true if field squareMemberMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMemberMid() {
    return this.squareMemberMid != null;
  }

  public void setSquareMemberMidIsSet(boolean value) {
    if (!value) {
      this.squareMemberMid = null;
    }
  }

  public String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareChatMember setSquareChatMid(String squareChatMid) {
    this.squareChatMid = squareChatMid;
    return this;
  }

  public void unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  /** Returns true if field squareChatMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMid() {
    return this.squareChatMid != null;
  }

  public void setSquareChatMidIsSet(boolean value) {
    if (!value) {
      this.squareChatMid = null;
    }
  }

  public long getRevision() {
    return this.revision;
  }

  public SquareChatMember setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
    return this;
  }

  public void unsetRevision() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return EncodingUtils.testBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  public void setRevisionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REVISION_ISSET_ID, value);
  }

  /**
   * 
   * @see SquareChatMembershipState
   */
  public SquareChatMembershipState getMembershipState() {
    return this.membershipState;
  }

  /**
   * 
   * @see SquareChatMembershipState
   */
  public SquareChatMember setMembershipState(SquareChatMembershipState membershipState) {
    this.membershipState = membershipState;
    return this;
  }

  public void unsetMembershipState() {
    this.membershipState = null;
  }

  /** Returns true if field membershipState is set (has been assigned a value) and false otherwise */
  public boolean isSetMembershipState() {
    return this.membershipState != null;
  }

  public void setMembershipStateIsSet(boolean value) {
    if (!value) {
      this.membershipState = null;
    }
  }

  public boolean isNotificationForMessage() {
    return this.notificationForMessage;
  }

  public SquareChatMember setNotificationForMessage(boolean notificationForMessage) {
    this.notificationForMessage = notificationForMessage;
    setNotificationForMessageIsSet(true);
    return this;
  }

  public void unsetNotificationForMessage() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NOTIFICATIONFORMESSAGE_ISSET_ID);
  }

  /** Returns true if field notificationForMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationForMessage() {
    return EncodingUtils.testBit(__isset_bitfield, __NOTIFICATIONFORMESSAGE_ISSET_ID);
  }

  public void setNotificationForMessageIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NOTIFICATIONFORMESSAGE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SQUARE_MEMBER_MID:
      if (value == null) {
        unsetSquareMemberMid();
      } else {
        setSquareMemberMid((String)value);
      }
      break;

    case SQUARE_CHAT_MID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        setSquareChatMid((String)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((Long)value);
      }
      break;

    case MEMBERSHIP_STATE:
      if (value == null) {
        unsetMembershipState();
      } else {
        setMembershipState((SquareChatMembershipState)value);
      }
      break;

    case NOTIFICATION_FOR_MESSAGE:
      if (value == null) {
        unsetNotificationForMessage();
      } else {
        setNotificationForMessage((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_MEMBER_MID:
      return getSquareMemberMid();

    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case REVISION:
      return Long.valueOf(getRevision());

    case MEMBERSHIP_STATE:
      return getMembershipState();

    case NOTIFICATION_FOR_MESSAGE:
      return Boolean.valueOf(isNotificationForMessage());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_MEMBER_MID:
      return isSetSquareMemberMid();
    case SQUARE_CHAT_MID:
      return isSetSquareChatMid();
    case REVISION:
      return isSetRevision();
    case MEMBERSHIP_STATE:
      return isSetMembershipState();
    case NOTIFICATION_FOR_MESSAGE:
      return isSetNotificationForMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareChatMember)
      return this.equals((SquareChatMember)that);
    return false;
  }

  public boolean equals(SquareChatMember that) {
    if (that == null)
      return false;

    boolean this_present_squareMemberMid = true && this.isSetSquareMemberMid();
    boolean that_present_squareMemberMid = true && that.isSetSquareMemberMid();
    if (this_present_squareMemberMid || that_present_squareMemberMid) {
      if (!(this_present_squareMemberMid && that_present_squareMemberMid))
        return false;
      if (!this.squareMemberMid.equals(that.squareMemberMid))
        return false;
    }

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    boolean this_present_membershipState = true && this.isSetMembershipState();
    boolean that_present_membershipState = true && that.isSetMembershipState();
    if (this_present_membershipState || that_present_membershipState) {
      if (!(this_present_membershipState && that_present_membershipState))
        return false;
      if (!this.membershipState.equals(that.membershipState))
        return false;
    }

    boolean this_present_notificationForMessage = true;
    boolean that_present_notificationForMessage = true;
    if (this_present_notificationForMessage || that_present_notificationForMessage) {
      if (!(this_present_notificationForMessage && that_present_notificationForMessage))
        return false;
      if (this.notificationForMessage != that.notificationForMessage)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SquareChatMember other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSquareMemberMid()).compareTo(other.isSetSquareMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMemberMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMemberMid, other.squareMemberMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSquareChatMid()).compareTo(other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRevision()).compareTo(other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.revision, other.revision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMembershipState()).compareTo(other.isSetMembershipState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMembershipState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.membershipState, other.membershipState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotificationForMessage()).compareTo(other.isSetNotificationForMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationForMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationForMessage, other.notificationForMessage);
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
    StringBuilder sb = new StringBuilder("SquareChatMember(");
    boolean first = true;

    sb.append("squareMemberMid:");
    if (this.squareMemberMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMemberMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("membershipState:");
    if (this.membershipState == null) {
      sb.append("null");
    } else {
      sb.append(this.membershipState);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationForMessage:");
    sb.append(this.notificationForMessage);
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

  private static class SquareChatMemberStandardSchemeFactory implements SchemeFactory {
    public SquareChatMemberStandardScheme getScheme() {
      return new SquareChatMemberStandardScheme();
    }
  }

  private static class SquareChatMemberStandardScheme extends StandardScheme<SquareChatMember> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareChatMember struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_MEMBER_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareMemberMid = iprot.readString();
              struct.setSquareMemberMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQUARE_CHAT_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareChatMid = iprot.readString();
              struct.setSquareChatMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.revision = iprot.readI64();
              struct.setRevisionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MEMBERSHIP_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.membershipState = SquareChatMembershipState.findByValue(iprot.readI32());
              struct.setMembershipStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NOTIFICATION_FOR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.notificationForMessage = iprot.readBool();
              struct.setNotificationForMessageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareChatMember struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareMemberMid != null) {
        oprot.writeFieldBegin(SQUARE_MEMBER_MID_FIELD_DESC);
        oprot.writeString(struct.squareMemberMid);
        oprot.writeFieldEnd();
      }
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(struct.revision);
      oprot.writeFieldEnd();
      if (struct.membershipState != null) {
        oprot.writeFieldBegin(MEMBERSHIP_STATE_FIELD_DESC);
        oprot.writeI32(struct.membershipState.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NOTIFICATION_FOR_MESSAGE_FIELD_DESC);
      oprot.writeBool(struct.notificationForMessage);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareChatMemberTupleSchemeFactory implements SchemeFactory {
    public SquareChatMemberTupleScheme getScheme() {
      return new SquareChatMemberTupleScheme();
    }
  }

  private static class SquareChatMemberTupleScheme extends TupleScheme<SquareChatMember> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareChatMember struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSquareMemberMid()) {
        optionals.set(0);
      }
      if (struct.isSetSquareChatMid()) {
        optionals.set(1);
      }
      if (struct.isSetRevision()) {
        optionals.set(2);
      }
      if (struct.isSetMembershipState()) {
        optionals.set(3);
      }
      if (struct.isSetNotificationForMessage()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetSquareMemberMid()) {
        oprot.writeString(struct.squareMemberMid);
      }
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetRevision()) {
        oprot.writeI64(struct.revision);
      }
      if (struct.isSetMembershipState()) {
        oprot.writeI32(struct.membershipState.getValue());
      }
      if (struct.isSetNotificationForMessage()) {
        oprot.writeBool(struct.notificationForMessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareChatMember struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.squareMemberMid = iprot.readString();
        struct.setSquareMemberMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.revision = iprot.readI64();
        struct.setRevisionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.membershipState = SquareChatMembershipState.findByValue(iprot.readI32());
        struct.setMembershipStateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.notificationForMessage = iprot.readBool();
        struct.setNotificationForMessageIsSet(true);
      }
    }
  }

}
