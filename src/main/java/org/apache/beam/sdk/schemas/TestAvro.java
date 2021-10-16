/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.beam.sdk.schemas;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TestAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7074737203430326703L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TestAvro\",\"namespace\":\"org.apache.beam.sdk.schemas\",\"fields\":[{\"name\":\"dateOuter\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"row\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"TestAvroNested\",\"fields\":[{\"name\":\"dateInner\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<TestAvro> ENCODER =
      new BinaryMessageEncoder<TestAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TestAvro> DECODER =
      new BinaryMessageDecoder<TestAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TestAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TestAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TestAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TestAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TestAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TestAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TestAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TestAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.time.LocalDate dateOuter;
   private org.apache.beam.sdk.schemas.TestAvroNested row;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TestAvro() {}

  /**
   * All-args constructor.
   * @param dateOuter The new value for dateOuter
   * @param row The new value for row
   */
  public TestAvro(java.time.LocalDate dateOuter, org.apache.beam.sdk.schemas.TestAvroNested row) {
    this.dateOuter = dateOuter;
    this.row = row;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dateOuter;
    case 1: return row;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.data.TimeConversions.DateConversion(),
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dateOuter = (java.time.LocalDate)value$; break;
    case 1: row = (org.apache.beam.sdk.schemas.TestAvroNested)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'dateOuter' field.
   * @return The value of the 'dateOuter' field.
   */
  public java.time.LocalDate getDateOuter() {
    return dateOuter;
  }


  /**
   * Sets the value of the 'dateOuter' field.
   * @param value the value to set.
   */
  public void setDateOuter(java.time.LocalDate value) {
    this.dateOuter = value;
  }

  /**
   * Gets the value of the 'row' field.
   * @return The value of the 'row' field.
   */
  public org.apache.beam.sdk.schemas.TestAvroNested getRow() {
    return row;
  }


  /**
   * Sets the value of the 'row' field.
   * @param value the value to set.
   */
  public void setRow(org.apache.beam.sdk.schemas.TestAvroNested value) {
    this.row = value;
  }

  /**
   * Creates a new TestAvro RecordBuilder.
   * @return A new TestAvro RecordBuilder
   */
  public static org.apache.beam.sdk.schemas.TestAvro.Builder newBuilder() {
    return new org.apache.beam.sdk.schemas.TestAvro.Builder();
  }

  /**
   * Creates a new TestAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TestAvro RecordBuilder
   */
  public static org.apache.beam.sdk.schemas.TestAvro.Builder newBuilder(org.apache.beam.sdk.schemas.TestAvro.Builder other) {
    if (other == null) {
      return new org.apache.beam.sdk.schemas.TestAvro.Builder();
    } else {
      return new org.apache.beam.sdk.schemas.TestAvro.Builder(other);
    }
  }

  /**
   * Creates a new TestAvro RecordBuilder by copying an existing TestAvro instance.
   * @param other The existing instance to copy.
   * @return A new TestAvro RecordBuilder
   */
  public static org.apache.beam.sdk.schemas.TestAvro.Builder newBuilder(org.apache.beam.sdk.schemas.TestAvro other) {
    if (other == null) {
      return new org.apache.beam.sdk.schemas.TestAvro.Builder();
    } else {
      return new org.apache.beam.sdk.schemas.TestAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for TestAvro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TestAvro>
    implements org.apache.avro.data.RecordBuilder<TestAvro> {

    private java.time.LocalDate dateOuter;
    private org.apache.beam.sdk.schemas.TestAvroNested row;
    private org.apache.beam.sdk.schemas.TestAvroNested.Builder rowBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.beam.sdk.schemas.TestAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dateOuter)) {
        this.dateOuter = data().deepCopy(fields()[0].schema(), other.dateOuter);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.row)) {
        this.row = data().deepCopy(fields()[1].schema(), other.row);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasRowBuilder()) {
        this.rowBuilder = org.apache.beam.sdk.schemas.TestAvroNested.newBuilder(other.getRowBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing TestAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.beam.sdk.schemas.TestAvro other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.dateOuter)) {
        this.dateOuter = data().deepCopy(fields()[0].schema(), other.dateOuter);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.row)) {
        this.row = data().deepCopy(fields()[1].schema(), other.row);
        fieldSetFlags()[1] = true;
      }
      this.rowBuilder = null;
    }

    /**
      * Gets the value of the 'dateOuter' field.
      * @return The value.
      */
    public java.time.LocalDate getDateOuter() {
      return dateOuter;
    }


    /**
      * Sets the value of the 'dateOuter' field.
      * @param value The value of 'dateOuter'.
      * @return This builder.
      */
    public org.apache.beam.sdk.schemas.TestAvro.Builder setDateOuter(java.time.LocalDate value) {
      validate(fields()[0], value);
      this.dateOuter = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'dateOuter' field has been set.
      * @return True if the 'dateOuter' field has been set, false otherwise.
      */
    public boolean hasDateOuter() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'dateOuter' field.
      * @return This builder.
      */
    public org.apache.beam.sdk.schemas.TestAvro.Builder clearDateOuter() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'row' field.
      * @return The value.
      */
    public org.apache.beam.sdk.schemas.TestAvroNested getRow() {
      return row;
    }


    /**
      * Sets the value of the 'row' field.
      * @param value The value of 'row'.
      * @return This builder.
      */
    public org.apache.beam.sdk.schemas.TestAvro.Builder setRow(org.apache.beam.sdk.schemas.TestAvroNested value) {
      validate(fields()[1], value);
      this.rowBuilder = null;
      this.row = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'row' field has been set.
      * @return True if the 'row' field has been set, false otherwise.
      */
    public boolean hasRow() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'row' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public org.apache.beam.sdk.schemas.TestAvroNested.Builder getRowBuilder() {
      if (rowBuilder == null) {
        if (hasRow()) {
          setRowBuilder(org.apache.beam.sdk.schemas.TestAvroNested.newBuilder(row));
        } else {
          setRowBuilder(org.apache.beam.sdk.schemas.TestAvroNested.newBuilder());
        }
      }
      return rowBuilder;
    }

    /**
     * Sets the Builder instance for the 'row' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public org.apache.beam.sdk.schemas.TestAvro.Builder setRowBuilder(org.apache.beam.sdk.schemas.TestAvroNested.Builder value) {
      clearRow();
      rowBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'row' field has an active Builder instance
     * @return True if the 'row' field has an active Builder instance
     */
    public boolean hasRowBuilder() {
      return rowBuilder != null;
    }

    /**
      * Clears the value of the 'row' field.
      * @return This builder.
      */
    public org.apache.beam.sdk.schemas.TestAvro.Builder clearRow() {
      row = null;
      rowBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TestAvro build() {
      try {
        TestAvro record = new TestAvro();
        record.dateOuter = fieldSetFlags()[0] ? this.dateOuter : (java.time.LocalDate) defaultValue(fields()[0]);
        if (rowBuilder != null) {
          try {
            record.row = this.rowBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("row"));
            throw e;
          }
        } else {
          record.row = fieldSetFlags()[1] ? this.row : (org.apache.beam.sdk.schemas.TestAvroNested) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TestAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<TestAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TestAvro>
    READER$ = (org.apache.avro.io.DatumReader<TestAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










