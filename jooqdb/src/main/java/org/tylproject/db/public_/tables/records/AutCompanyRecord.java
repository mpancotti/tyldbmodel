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
public class AutCompanyRecord extends org.jooq.impl.UpdatableRecordImpl<org.tylproject.db.public_.tables.records.AutCompanyRecord> implements org.jooq.Record6<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> {

	private static final long serialVersionUID = -1978936586;

	/**
	 * Setter for <code>public.aut_company.id_aut_company</code>.
	 */
	public AutCompanyRecord setIdAutCompany(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_company.id_aut_company</code>.
	 */
	public java.lang.String getIdAutCompany() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.aut_company.name</code>.
	 */
	public AutCompanyRecord setName(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_company.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.aut_company.id_par_party</code>.
	 */
	public AutCompanyRecord setIdParParty(java.lang.Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_company.id_par_party</code>.
	 */
	public java.lang.Integer getIdParParty() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.aut_company.canceled</code>.
	 */
	public AutCompanyRecord setCanceled(java.lang.Boolean value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_company.canceled</code>.
	 */
	public java.lang.Boolean getCanceled() {
		return (java.lang.Boolean) getValue(3);
	}

	/**
	 * Setter for <code>public.aut_company.version</code>.
	 */
	public AutCompanyRecord setVersion(java.lang.Integer value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_company.version</code>.
	 */
	public java.lang.Integer getVersion() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.aut_company.track</code>.
	 */
	public AutCompanyRecord setTrack(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.aut_company.track</code>.
	 */
	public org.tylproject.db.public_.udt.records.TrackRecord getTrack() {
		return (org.tylproject.db.public_.udt.records.TrackRecord) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer, org.tylproject.db.public_.udt.records.TrackRecord> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.ID_AUT_COMPANY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.ID_PAR_PARTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.CANCELED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.tylproject.db.public_.udt.records.TrackRecord> field6() {
		return org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.TRACK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getIdAutCompany();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getIdParParty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getCanceled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.tylproject.db.public_.udt.records.TrackRecord value6() {
		return getTrack();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutCompanyRecord value1(java.lang.String value) {
		setIdAutCompany(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutCompanyRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutCompanyRecord value3(java.lang.Integer value) {
		setIdParParty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutCompanyRecord value4(java.lang.Boolean value) {
		setCanceled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutCompanyRecord value5(java.lang.Integer value) {
		setVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutCompanyRecord value6(org.tylproject.db.public_.udt.records.TrackRecord value) {
		setTrack(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AutCompanyRecord values(java.lang.String value1, java.lang.String value2, java.lang.Integer value3, java.lang.Boolean value4, java.lang.Integer value5, org.tylproject.db.public_.udt.records.TrackRecord value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AutCompanyRecord
	 */
	public AutCompanyRecord() {
		super(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY);
	}

	/**
	 * Create a detached, initialised AutCompanyRecord
	 */
	public AutCompanyRecord(java.lang.String idAutCompany, java.lang.String name, java.lang.Integer idParParty, java.lang.Boolean canceled, java.lang.Integer version, org.tylproject.db.public_.udt.records.TrackRecord track) {
		super(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY);

		setValue(0, idAutCompany);
		setValue(1, name);
		setValue(2, idParParty);
		setValue(3, canceled);
		setValue(4, version);
		setValue(5, track);
	}
}
