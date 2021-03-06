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
public class BasDistrictRecord extends org.jooq.impl.UpdatableRecordImpl<org.tylproject.db.public_.tables.records.BasDistrictRecord> implements org.jooq.Record8<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> {

	private static final long serialVersionUID = 1177201924;

	/**
	 * Setter for <code>public.bas_district.id_bas_district</code>.
	 */
	public BasDistrictRecord setIdBasDistrict(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_district.id_bas_district</code>.
	 */
	public java.lang.Integer getIdBasDistrict() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.bas_district.id_bas_country</code>.
	 */
	public BasDistrictRecord setIdBasCountry(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_district.id_bas_country</code>.
	 */
	public java.lang.String getIdBasCountry() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.bas_district.district</code>.
	 */
	public BasDistrictRecord setDistrict(java.lang.String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_district.district</code>.
	 */
	public java.lang.String getDistrict() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.bas_district.city_name</code>.
	 */
	public BasDistrictRecord setCityName(java.lang.String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_district.city_name</code>.
	 */
	public java.lang.String getCityName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.bas_district.postal_code</code>.
	 */
	public BasDistrictRecord setPostalCode(java.lang.String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_district.postal_code</code>.
	 */
	public java.lang.String getPostalCode() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.bas_district.canceled</code>.
	 */
	public BasDistrictRecord setCanceled(java.lang.Boolean value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_district.canceled</code>.
	 */
	public java.lang.Boolean getCanceled() {
		return (java.lang.Boolean) getValue(5);
	}

	/**
	 * Setter for <code>public.bas_district.version</code>.
	 */
	public BasDistrictRecord setVersion(java.lang.Integer value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_district.version</code>.
	 */
	public java.lang.Integer getVersion() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>public.bas_district.track</code>.
	 */
	public BasDistrictRecord setTrack(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>public.bas_district.track</code>.
	 */
	public org.tylproject.db.public_.udt.records.TrackRecord getTrack() {
		return (org.tylproject.db.public_.udt.records.TrackRecord) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT.ID_BAS_DISTRICT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT.ID_BAS_COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT.DISTRICT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT.CITY_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT.POSTAL_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field6() {
		return org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT.CANCELED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.tylproject.db.public_.udt.records.TrackRecord> field8() {
		return org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT.TRACK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdBasDistrict();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getIdBasCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDistrict();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getCityName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPostalCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value6() {
		return getCanceled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.tylproject.db.public_.udt.records.TrackRecord value8() {
		return getTrack();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasDistrictRecord value1(java.lang.Integer value) {
		setIdBasDistrict(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasDistrictRecord value2(java.lang.String value) {
		setIdBasCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasDistrictRecord value3(java.lang.String value) {
		setDistrict(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasDistrictRecord value4(java.lang.String value) {
		setCityName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasDistrictRecord value5(java.lang.String value) {
		setPostalCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasDistrictRecord value6(java.lang.Boolean value) {
		setCanceled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasDistrictRecord value7(java.lang.Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasDistrictRecord value8(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setTrack(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BasDistrictRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Boolean value6, java.lang.Integer value7, org.tylproject.db.public_.udt.records.TrackRecord value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BasDistrictRecord
	 */
	public BasDistrictRecord() {
		super(org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT);
	}

	/**
	 * Create a detached, initialised BasDistrictRecord
	 */
	public BasDistrictRecord(java.lang.Integer idBasDistrict, java.lang.String idBasCountry, java.lang.String district, java.lang.String cityName, java.lang.String postalCode, java.lang.Boolean canceled, java.lang.Integer version, org.tylproject.db.public_.udt.records.TrackRecord track) {
		super(org.tylproject.db.public_.tables.BasDistrict.BAS_DISTRICT);

		setValue(0, idBasDistrict);
		setValue(1, idBasCountry);
		setValue(2, district);
		setValue(3, cityName);
		setValue(4, postalCode);
		setValue(5, canceled);
		setValue(6, version);
		setValue(7, track);
	}
}
