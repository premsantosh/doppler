/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class ComponentObject extends org.apache.thrift7.TUnion<ComponentObject, ComponentObject._Fields> {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("ComponentObject");
  private static final org.apache.thrift7.protocol.TField SERIALIZED_JAVA_FIELD_DESC = new org.apache.thrift7.protocol.TField("serialized_java", org.apache.thrift7.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift7.protocol.TField SHELL_FIELD_DESC = new org.apache.thrift7.protocol.TField("shell", org.apache.thrift7.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift7.protocol.TField JAVA_OBJECT_FIELD_DESC = new org.apache.thrift7.protocol.TField("java_object", org.apache.thrift7.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    SERIALIZED_JAVA((short)1, "serialized_java"),
    SHELL((short)2, "shell"),
    JAVA_OBJECT((short)3, "java_object");

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
        case 1: // SERIALIZED_JAVA
          return SERIALIZED_JAVA;
        case 2: // SHELL
          return SHELL;
        case 3: // JAVA_OBJECT
          return JAVA_OBJECT;
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

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SERIALIZED_JAVA, new org.apache.thrift7.meta_data.FieldMetaData("serialized_java", org.apache.thrift7.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.SHELL, new org.apache.thrift7.meta_data.FieldMetaData("shell", org.apache.thrift7.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, ShellComponent.class)));
    tmpMap.put(_Fields.JAVA_OBJECT, new org.apache.thrift7.meta_data.FieldMetaData("java_object", org.apache.thrift7.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, JavaObject.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(ComponentObject.class, metaDataMap);
  }

  public ComponentObject() {
    super();
  }

  public ComponentObject(_Fields setField, Object value) {
    super(setField, value);
  }

  public ComponentObject(ComponentObject other) {
    super(other);
  }
  public ComponentObject deepCopy() {
    return new ComponentObject(this);
  }

  public static ComponentObject serialized_java(ByteBuffer value) {
    ComponentObject x = new ComponentObject();
    x.set_serialized_java(value);
    return x;
  }

  public static ComponentObject serialized_java(byte[] value) {
    ComponentObject x = new ComponentObject();
    x.set_serialized_java(ByteBuffer.wrap(value));
    return x;
  }

  public static ComponentObject shell(ShellComponent value) {
    ComponentObject x = new ComponentObject();
    x.set_shell(value);
    return x;
  }

  public static ComponentObject java_object(JavaObject value) {
    ComponentObject x = new ComponentObject();
    x.set_java_object(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case SERIALIZED_JAVA:
        if (value instanceof ByteBuffer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ByteBuffer for field 'serialized_java', but got " + value.getClass().getSimpleName());
      case SHELL:
        if (value instanceof ShellComponent) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ShellComponent for field 'shell', but got " + value.getClass().getSimpleName());
      case JAVA_OBJECT:
        if (value instanceof JavaObject) {
          break;
        }
        throw new ClassCastException("Was expecting value of type JavaObject for field 'java_object', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object readValue(org.apache.thrift7.protocol.TProtocol iprot, org.apache.thrift7.protocol.TField field) throws org.apache.thrift7.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case SERIALIZED_JAVA:
          if (field.type == SERIALIZED_JAVA_FIELD_DESC.type) {
            ByteBuffer serialized_java;
            serialized_java = iprot.readBinary();
            return serialized_java;
          } else {
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SHELL:
          if (field.type == SHELL_FIELD_DESC.type) {
            ShellComponent shell;
            shell = new ShellComponent();
            shell.read(iprot);
            return shell;
          } else {
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case JAVA_OBJECT:
          if (field.type == JAVA_OBJECT_FIELD_DESC.type) {
            JavaObject java_object;
            java_object = new JavaObject();
            java_object.read(iprot);
            return java_object;
          } else {
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void writeValue(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    switch (setField_) {
      case SERIALIZED_JAVA:
        ByteBuffer serialized_java = (ByteBuffer)value_;
        oprot.writeBinary(serialized_java);
        return;
      case SHELL:
        ShellComponent shell = (ShellComponent)value_;
        shell.write(oprot);
        return;
      case JAVA_OBJECT:
        JavaObject java_object = (JavaObject)value_;
        java_object.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift7.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case SERIALIZED_JAVA:
        return SERIALIZED_JAVA_FIELD_DESC;
      case SHELL:
        return SHELL_FIELD_DESC;
      case JAVA_OBJECT:
        return JAVA_OBJECT_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift7.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public byte[] get_serialized_java() {
    set_serialized_java(org.apache.thrift7.TBaseHelper.rightSize(buffer_for_serialized_java()));
    ByteBuffer b = buffer_for_serialized_java();
    return b == null ? null : b.array();
  }

  public ByteBuffer buffer_for_serialized_java() {
    if (getSetField() == _Fields.SERIALIZED_JAVA) {
      return (ByteBuffer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'serialized_java' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_serialized_java(byte[] value) {
    set_serialized_java(ByteBuffer.wrap(value));
  }

  public void set_serialized_java(ByteBuffer value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.SERIALIZED_JAVA;
    value_ = value;
  }

  public ShellComponent get_shell() {
    if (getSetField() == _Fields.SHELL) {
      return (ShellComponent)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'shell' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_shell(ShellComponent value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.SHELL;
    value_ = value;
  }

  public JavaObject get_java_object() {
    if (getSetField() == _Fields.JAVA_OBJECT) {
      return (JavaObject)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'java_object' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_java_object(JavaObject value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.JAVA_OBJECT;
    value_ = value;
  }

  public boolean is_set_serialized_java() {
    return setField_ == _Fields.SERIALIZED_JAVA;
  }


  public boolean is_set_shell() {
    return setField_ == _Fields.SHELL;
  }


  public boolean is_set_java_object() {
    return setField_ == _Fields.JAVA_OBJECT;
  }


  public boolean equals(Object other) {
    if (other instanceof ComponentObject) {
      return equals((ComponentObject)other);
    } else {
      return false;
    }
  }

  public boolean equals(ComponentObject other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ComponentObject other) {
    int lastComparison = org.apache.thrift7.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift7.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    HashCodeBuilder hcb = new HashCodeBuilder();
    hcb.append(this.getClass().getName());
    org.apache.thrift7.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      hcb.append(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift7.TEnum) {
        hcb.append(((org.apache.thrift7.TEnum)getFieldValue()).getValue());
      } else {
        hcb.append(value);
      }
    }
    return hcb.toHashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
