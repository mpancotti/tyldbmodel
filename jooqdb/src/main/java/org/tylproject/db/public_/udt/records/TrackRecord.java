/**
 * This class is generated by jOOQ
 */
package org.tylproject.db.public_.udt.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrackRecord extends org.jooq.impl.UDTRecordImpl<org.tylproject.db.public_.udt.records.TrackRecord> implements org.jooq.Record4<java.sql.Timestamp, java.lang.String, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = -1288708294;

	/**
	 * Setter for <code>public.track.created_on</code>.
	 */
	public TrackRecord setCreatedOn(java.sql.Timestamp value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.track.created_on</code>.
	 */
	public java.sql.Timestamp getCreatedOn() {
		return (java.sql.Timestamp) getValue(0);
	}

	/**
	 * Setter for <code>public.track.created_by</code>.
	 */
	public TrackRecord setCreatedBy(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.track.created_by</code>.
	 */
	public java.lang.String getCreatedBy() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.track.updated_on</code>.
	 */
	public TrackRecord setUpdatedOn(java.sql.Timestamp value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.track.updated_on</code>.
	 */
	public java.sql.Timestamp getUpdatedOn() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>public.track.updated_by</code>.
	 */
	public TrackRecord setUpdatedBy(java.lang.String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.track.updated_by</code>.
	 */
	public java.lang.String getUpdatedBy() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.sql.Timestamp, java.lang.String, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.sql.Timestamp, java.lang.String, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field1() {
		return org.tylproject.db.public_.udt.Track.CREATED_ON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.tylproject.db.public_.udt.Track.CREATED_BY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.tylproject.db.public_.udt.Track.UPDATED_ON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.tylproject.db.public_.udt.Track.UPDATED_BY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value1() {
		return getCreatedOn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCreatedBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getUpdatedOn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getUpdatedBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrackRecord value1(java.sql.Timestamp value) {
		setCreatedOn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrackRecord value2(java.lang.String value) {
		setCreatedBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrackRecord value3(java.sql.Timestamp value) {
		setUpdatedOn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrackRecord value4(java.lang.String value) {
		setUpdatedBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrackRecord values(java.sql.Timestamp value1, java.lang.String value2, java.sql.Timestamp value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TrackRecord
	 */
	public TrackRecord() {
		super(org.tylproject.db.public_.udt.Track.TRACK);
	}

	/**
	 * Create a detached, initialised TrackRecord
	 */
	public TrackRecord(java.sql.Timestamp createdOn, java.lang.String createdBy, java.sql.Timestamp updatedOn, java.lang.String updatedBy) {
		super(org.tylproject.db.public_.udt.Track.TRACK);

		setValue(0, createdOn);
		setValue(1, createdBy);
		setValue(2, updatedOn);
		setValue(3, updatedBy);
	}
}