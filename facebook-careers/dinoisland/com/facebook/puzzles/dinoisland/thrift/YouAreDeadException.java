/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.facebook.puzzles.dinoisland.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

/**
 * You are dead exception
 * 
 * This exception is thrown if a client attempts to call an action function,
 * but the dinosaur controlled turns out to be already dead. This can happen if
 * the dinosaur your client controls is eaten by a predator, or has exceeded
 * its real time lifespan. The string will contain useful information about the
 * cause of death for your dinosaur.
 */
public class YouAreDeadException extends Exception implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("YouAreDeadException");
  private static final TField DESCRIPTION_FIELD_DESC = new TField("description", TType.STRING, (short)1);

  public String description;
  public static final int DESCRIPTION = 1;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(DESCRIPTION, new FieldMetaData("description", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(YouAreDeadException.class, metaDataMap);
  }

  public YouAreDeadException() {
  }

  public YouAreDeadException(
    String description)
  {
    this();
    this.description = description;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public YouAreDeadException(YouAreDeadException other) {
    if (other.isSetDescription()) {
      this.description = other.description;
    }
  }

  @Override
  public YouAreDeadException clone() {
    return new YouAreDeadException(this);
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void unsetDescription() {
    this.description = null;
  }

  // Returns true if field description is set (has been asigned a value) and false otherwise
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((String)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case DESCRIPTION:
      return getDescription();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case DESCRIPTION:
      return isSetDescription();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof YouAreDeadException)
      return this.equals((YouAreDeadException)that);
    return false;
  }

  public boolean equals(YouAreDeadException that) {
    if (that == null)
      return false;

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case DESCRIPTION:
          if (field.type == TType.STRING) {
            this.description = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.description != null) {
      oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
      oprot.writeString(this.description);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("YouAreDeadException(");
    boolean first = true;

    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
