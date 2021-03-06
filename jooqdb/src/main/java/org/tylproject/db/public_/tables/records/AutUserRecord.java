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
public class AutUserRecord extends org.jooq.impl.UpdatableRecordImpl<org.tylproject.db.public_.tables.records.AutUserRecord> implements org.jooq.Record9<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> {

	private static final long serialVersionUID = -1847736298;

	/**
	 * Setter for <code>public.aut_user.login</code>.
	 */
	public AutUserRecord setLogin(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_user.login</code>.
	 */
	public java.lang.String getLogin() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.aut_user.password</code>.
	 */
	public AutUserRecord setPassword(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_user.password</code>.
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.aut_user.password_hint</code>.
	 */
	public AutUserRecord setPasswordHint(java.lang.String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_user.password_hint</code>.
	 */
	public java.lang.String getPasswordHint() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.aut_user.valid_thru</code>.
	 */
	public AutUserRecord setValidThru(java.sql.Timestamp value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_user.valid_thru</code>.
	 */
	public java.sql.Timestamp getValidThru() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>public.aut_user.validity_managed</code>.
	 */
	public AutUserRecord setValidityManaged(java.lang.Boolean value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_user.validity_managed</code>.
	 */
	public java.lang.Boolean getValidityManaged() {
		return (java.lang.Boolean) getValue(4);
	}

	/**
	 * Setter for <code>public.aut_user.id_par_party</code>.
	 */
	public AutUserRecord setIdParParty(java.lang.Integer value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_user.id_par_party</code>.
	 */
	public java.lang.Integer getIdParParty() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.aut_user.canceled</code>.
	 */
	public AutUserRecord setCanceled(java.lang.Boolean value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_user.canceled</code>.
	 */
	public java.lang.Boolean getCanceled() {
		return (java.lang.Boolean) getValue(6);
	}

	/**
	 * Setter for <code>public.aut_user.version</code>.
	 */
	public AutUserRecord setVersion(java.lang.Integer value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_user.version</code>.
	 */
	public java.lang.Integer getVersion() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>public.aut_user.track</code>.
	 */
	public AutUserRecord setTrack(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setValue(8, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_user.track</code>.
	 */
	public org.tylproject.db.public_.udt.records.TrackRecord getTrack() {
		return (org.tylproject.db.public_.udt.records.TrackRecord) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.LOGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.PASSWORD_HINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.VALID_THRU;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.VALIDITY_MANAGED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.ID_PAR_PARTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field7() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.CANCELED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.tylproject.db.public_.udt.records.TrackRecord> field9() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.TRACK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getLogin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPasswordHint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getValidThru();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getValidityManaged();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getIdParParty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value7() {
		return getCanceled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.tylproject.db.public_.udt.records.TrackRecord value9() {
		return getTrack();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord value1(java.lang.String value) {
		setLogin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord value2(java.lang.String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord value3(java.lang.String value) {
		setPasswordHint(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord value4(java.sql.Timestamp value) {
		setValidThru(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord value5(java.lang.Boolean value) {
		setValidityManaged(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord value6(java.lang.Integer value) {
		setIdParParty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord value7(java.lang.Boolean value) {
		setCanceled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord value8(java.lang.Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord value9(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setTrack(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutUserRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.sql.Timestamp value4, java.lang.Boolean value5, java.lang.Integer value6, java.lang.Boolean value7, java.lang.Integer value8, org.tylproject.db.public_.udt.records.TrackRecord value9) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AutUserRecord
	 */
	public AutUserRecord() {
		super(org.tylproject.db.public_.tables.AutUser.AUT_USER);
	}

	/**
	 * Create a detached, initialised AutUserRecord
	 */
	public AutUserRecord(java.lang.String login, java.lang.String password, java.lang.String passwordHint, java.sql.Timestamp validThru, java.lang.Boolean validityManaged, java.lang.Integer idParParty, java.lang.Boolean canceled, java.lang.Integer version, org.tylproject.db.public_.udt.records.TrackRecord track) {
		super(org.tylproject.db.public_.tables.AutUser.AUT_USER);

		setValue(0, login);
		setValue(1, password);
		setValue(2, passwordHint);
		setValue(3, validThru);
		setValue(4, validityManaged);
		setValue(5, idParParty);
		setValue(6, canceled);
		setValue(7, version);
		setValue(8, track);
	}
}
