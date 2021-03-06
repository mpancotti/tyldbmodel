/**
 * This class is generated by jOOQ
 */
package org.tylproject.db.public_.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BasCountryRecord extends org.jooq.impl.UpdatableRecordImpl<org.tylproject.db.public_.tables.records.BasCountryRecord> implements org.jooq.Record7<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> {

	private static final long serialVersionUID = -1699580544;

	/**
	 * Setter for <code>public.bas_country.id_bas_country</code>.
	 */
	public BasCountryRecord setIdBasCountry(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_country.id_bas_country</code>.
	 */
	public java.lang.String getIdBasCountry() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.bas_country.official_name</code>.
	 */
	public BasCountryRecord setOfficialName(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_country.official_name</code>.
	 */
	public java.lang.String getOfficialName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.bas_country.two_chars_code</code>.
	 */
	public BasCountryRecord setTwoCharsCode(java.lang.String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_country.two_chars_code</code>.
	 */
	public java.lang.String getTwoCharsCode() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.bas_country.numeric_code</code>.
	 */
	public BasCountryRecord setNumericCode(java.lang.Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_country.numeric_code</code>.
	 */
	public java.lang.Integer getNumericCode() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.bas_country.canceled</code>.
	 */
	public BasCountryRecord setCanceled(java.lang.Boolean value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_country.canceled</code>.
	 */
	public java.lang.Boolean getCanceled() {
		return (java.lang.Boolean) getValue(4);
	}

	/**
	 * Setter for <code>public.bas_country.version</code>.
	 */
	public BasCountryRecord setVersion(java.lang.Integer value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_country.version</code>.
	 */
	public java.lang.Integer getVersion() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.bas_country.track</code>.
	 */
	public BasCountryRecord setTrack(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_country.track</code>.
	 */
	public org.tylproject.db.public_.udt.records.TrackRecord getTrack() {
		return (org.tylproject.db.public_.udt.records.TrackRecord) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.tylproject.db.public_.tables.BasCountry.BAS_COUNTRY.ID_BAS_COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.tylproject.db.public_.tables.BasCountry.BAS_COUNTRY.OFFICIAL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.tylproject.db.public_.tables.BasCountry.BAS_COUNTRY.TWO_CHARS_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.tylproject.db.public_.tables.BasCountry.BAS_COUNTRY.NUMERIC_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return org.tylproject.db.public_.tables.BasCountry.BAS_COUNTRY.CANCELED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.tylproject.db.public_.tables.BasCountry.BAS_COUNTRY.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.tylproject.db.public_.udt.records.TrackRecord> field7() {
		return org.tylproject.db.public_.tables.BasCountry.BAS_COUNTRY.TRACK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getIdBasCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getOfficialName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTwoCharsCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getNumericCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getCanceled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.tylproject.db.public_.udt.records.TrackRecord value7() {
		return getTrack();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasCountryRecord value1(java.lang.String value) {
		setIdBasCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasCountryRecord value2(java.lang.String value) {
		setOfficialName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasCountryRecord value3(java.lang.String value) {
		setTwoCharsCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasCountryRecord value4(java.lang.Integer value) {
		setNumericCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasCountryRecord value5(java.lang.Boolean value) {
		setCanceled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasCountryRecord value6(java.lang.Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasCountryRecord value7(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setTrack(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasCountryRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Integer value4, java.lang.Boolean value5, java.lang.Integer value6, org.tylproject.db.public_.udt.records.TrackRecord value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BasCountryRecord
	 */
	public BasCountryRecord() {
		super(org.tylproject.db.public_.tables.BasCountry.BAS_COUNTRY);
	}

	/**
	 * Create a detached, initialised BasCountryRecord
	 */
	public BasCountryRecord(java.lang.String idBasCountry, java.lang.String officialName, java.lang.String twoCharsCode, java.lang.Integer numericCode, java.lang.Boolean canceled, java.lang.Integer version, org.tylproject.db.public_.udt.records.TrackRecord track) {
		super(org.tylproject.db.public_.tables.BasCountry.BAS_COUNTRY);

		setValue(0, idBasCountry);
		setValue(1, officialName);
		setValue(2, twoCharsCode);
		setValue(3, numericCode);
		setValue(4, canceled);
		setValue(5, version);
		setValue(6, track);
	}
}
