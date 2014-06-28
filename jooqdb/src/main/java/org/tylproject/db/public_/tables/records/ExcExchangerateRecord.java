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
public class ExcExchangerateRecord extends org.jooq.impl.UpdatableRecordImpl<org.tylproject.db.public_.tables.records.ExcExchangerateRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.math.BigDecimal, java.math.BigDecimal, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> {

	private static final long serialVersionUID = 1228190968;

	/**
	 * Setter for <code>public.exc_exchangerate.id_exc_exchangerate</code>.
	 */
	public ExcExchangerateRecord setIdExcExchangerate(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.id_exc_exchangerate</code>.
	 */
	public java.lang.Integer getIdExcExchangerate() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.exc_exchangerate.from_currency_fk</code>.
	 */
	public ExcExchangerateRecord setFromCurrencyFk(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.from_currency_fk</code>.
	 */
	public java.lang.String getFromCurrencyFk() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.exc_exchangerate.to_currency_fk</code>.
	 */
	public ExcExchangerateRecord setToCurrencyFk(java.lang.String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.to_currency_fk</code>.
	 */
	public java.lang.String getToCurrencyFk() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.exc_exchangerate.from_date</code>.
	 */
	public ExcExchangerateRecord setFromDate(java.sql.Timestamp value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.from_date</code>.
	 */
	public java.sql.Timestamp getFromDate() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>public.exc_exchangerate.thru_date</code>.
	 */
	public ExcExchangerateRecord setThruDate(java.sql.Timestamp value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.thru_date</code>.
	 */
	public java.sql.Timestamp getThruDate() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>public.exc_exchangerate.rate</code>.
	 */
	public ExcExchangerateRecord setRate(java.math.BigDecimal value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.rate</code>.
	 */
	public java.math.BigDecimal getRate() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>public.exc_exchangerate.rounding_factor</code>.
	 */
	public ExcExchangerateRecord setRoundingFactor(java.math.BigDecimal value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.rounding_factor</code>.
	 */
	public java.math.BigDecimal getRoundingFactor() {
		return (java.math.BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>public.exc_exchangerate.canceled</code>.
	 */
	public ExcExchangerateRecord setCanceled(java.lang.Boolean value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.canceled</code>.
	 */
	public java.lang.Boolean getCanceled() {
		return (java.lang.Boolean) getValue(7);
	}

	/**
	 * Setter for <code>public.exc_exchangerate.version</code>.
	 */
	public ExcExchangerateRecord setVersion(java.lang.Integer value) {
		setValue(8, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.version</code>.
	 */
	public java.lang.Integer getVersion() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>public.exc_exchangerate.track</code>.
	 */
	public ExcExchangerateRecord setTrack(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setValue(9, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_exchangerate.track</code>.
	 */
	public org.tylproject.db.public_.udt.records.TrackRecord getTrack() {
		return (org.tylproject.db.public_.udt.records.TrackRecord) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.math.BigDecimal, java.math.BigDecimal, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.math.BigDecimal, java.math.BigDecimal, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.ID_EXC_EXCHANGERATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.FROM_CURRENCY_FK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.TO_CURRENCY_FK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.FROM_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.THRU_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.RATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field7() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.ROUNDING_FACTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field8() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.CANCELED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.tylproject.db.public_.udt.records.TrackRecord> field10() {
		return org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE.TRACK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdExcExchangerate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFromCurrencyFk();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getToCurrencyFk();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getFromDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getThruDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getRate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value7() {
		return getRoundingFactor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value8() {
		return getCanceled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.tylproject.db.public_.udt.records.TrackRecord value10() {
		return getTrack();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value1(java.lang.Integer value) {
		setIdExcExchangerate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value2(java.lang.String value) {
		setFromCurrencyFk(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value3(java.lang.String value) {
		setToCurrencyFk(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value4(java.sql.Timestamp value) {
		setFromDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value5(java.sql.Timestamp value) {
		setThruDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value6(java.math.BigDecimal value) {
		setRate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value7(java.math.BigDecimal value) {
		setRoundingFactor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value8(java.lang.Boolean value) {
		setCanceled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value9(java.lang.Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord value10(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setTrack(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcExchangerateRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.sql.Timestamp value4, java.sql.Timestamp value5, java.math.BigDecimal value6, java.math.BigDecimal value7, java.lang.Boolean value8, java.lang.Integer value9, org.tylproject.db.public_.udt.records.TrackRecord value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExcExchangerateRecord
	 */
	public ExcExchangerateRecord() {
		super(org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE);
	}

	/**
	 * Create a detached, initialised ExcExchangerateRecord
	 */
	public ExcExchangerateRecord(java.lang.Integer idExcExchangerate, java.lang.String fromCurrencyFk, java.lang.String toCurrencyFk, java.sql.Timestamp fromDate, java.sql.Timestamp thruDate, java.math.BigDecimal rate, java.math.BigDecimal roundingFactor, java.lang.Boolean canceled, java.lang.Integer version, org.tylproject.db.public_.udt.records.TrackRecord track) {
		super(org.tylproject.db.public_.tables.ExcExchangerate.EXC_EXCHANGERATE);

		setValue(0, idExcExchangerate);
		setValue(1, fromCurrencyFk);
		setValue(2, toCurrencyFk);
		setValue(3, fromDate);
		setValue(4, thruDate);
		setValue(5, rate);
		setValue(6, roundingFactor);
		setValue(7, canceled);
		setValue(8, version);
		setValue(9, track);
	}
}
