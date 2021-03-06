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
public class TestAvroNested extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2173649787369076441L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TestAvroNested\",\"namespace\":\"org.apache.beam.sdk.schemas\",\"fields\":[{\"name\":\"dateInner\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<TestAvroNested> ENCODER =
      new BinaryMessageEncoder<TestAvroNested>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TestAvroNested> DECODER =
      new BinaryMessageDecoder<TestAvroNested>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TestAvroNested> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TestAvroNested> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TestAvroNested> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TestAvroNested>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TestAvroNested to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TestAvroNested from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TestAvroNested instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TestAvroNested fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.time.LocalDate dateInner;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TestAvroNested() {}

  /**
   * All-args constructor.
   * @param dateInner The new value for dateInner
   */
  public TestAvroNested(java.time.LocalDate dateInner) {
    this.dateInner = dateInner;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dateInner;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.data.TimeConversions.DateConversion(),
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
    case 0: dateInner = (java.time.LocalDate)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'dateInner' field.
   * @return The value of the 'dateInner' field.
   */
  public java.time.LocalDate getDateInner() {
    return dateInner;
  }


  /**
   * Sets the value of the 'dateInner' field.
   * @param value the value to set.
   */
  public void setDateInner(java.time.LocalDate value) {
    this.dateInner = value;
  }

  /**
   * Creates a new TestAvroNested RecordBuilder.
   * @return A new TestAvroNested RecordBuilder
   */
  public static org.apache.beam.sdk.schemas.TestAvroNested.Builder newBuilder() {
    return new org.apache.beam.sdk.schemas.TestAvroNested.Builder();
  }

  /**
   * Creates a new TestAvroNested RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TestAvroNested RecordBuilder
   */
  public static org.apache.beam.sdk.schemas.TestAvroNested.Builder newBuilder(org.apache.beam.sdk.schemas.TestAvroNested.Builder other) {
    if (other == null) {
      return new org.apache.beam.sdk.schemas.TestAvroNested.Builder();
    } else {
      return new org.apache.beam.sdk.schemas.TestAvroNested.Builder(other);
    }
  }

  /**
   * Creates a new TestAvroNested RecordBuilder by copying an existing TestAvroNested instance.
   * @param other The existing instance to copy.
   * @return A new TestAvroNested RecordBuilder
   */
  public static org.apache.beam.sdk.schemas.TestAvroNested.Builder newBuilder(org.apache.beam.sdk.schemas.TestAvroNested other) {
    if (other == null) {
      return new org.apache.beam.sdk.schemas.TestAvroNested.Builder();
    } else {
      return new org.apache.beam.sdk.schemas.TestAvroNested.Builder(other);
    }
  }

  /**
   * RecordBuilder for TestAvroNested instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TestAvroNested>
    implements org.apache.avro.data.RecordBuilder<TestAvroNested> {

    private java.time.LocalDate dateInner;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.beam.sdk.schemas.TestAvroNested.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dateInner)) {
        this.dateInner = data().deepCopy(fields()[0].schema(), other.dateInner);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing TestAvroNested instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.beam.sdk.schemas.TestAvroNested other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.dateInner)) {
        this.dateInner = data().deepCopy(fields()[0].schema(), other.dateInner);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'dateInner' field.
      * @return The value.
      */
    public java.time.LocalDate getDateInner() {
      return dateInner;
    }


    /**
      * Sets the value of the 'dateInner' field.
      * @param value The value of 'dateInner'.
      * @return This builder.
      */
    public org.apache.beam.sdk.schemas.TestAvroNested.Builder setDateInner(java.time.LocalDate value) {
      validate(fields()[0], value);
      this.dateInner = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'dateInner' field has been set.
      * @return True if the 'dateInner' field has been set, false otherwise.
      */
    public boolean hasDateInner() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'dateInner' field.
      * @return This builder.
      */
    public org.apache.beam.sdk.schemas.TestAvroNested.Builder clearDateInner() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TestAvroNested build() {
      try {
        TestAvroNested record = new TestAvroNested();
        record.dateInner = fieldSetFlags()[0] ? this.dateInner : (java.time.LocalDate) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TestAvroNested>
    WRITER$ = (org.apache.avro.io.DatumWriter<TestAvroNested>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TestAvroNested>
    READER$ = (org.apache.avro.io.DatumReader<TestAvroNested>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










