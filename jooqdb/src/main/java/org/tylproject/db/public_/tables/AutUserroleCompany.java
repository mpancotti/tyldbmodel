/**
 * This class is generated by jOOQ
 */
package org.tylproject.db.public_.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AutUserroleCompany extends org.jooq.impl.TableImpl<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord> {

	private static final long serialVersionUID = -908698216;

	/**
	 * The singleton instance of <code>public.aut_userrole_company</code>
	 */
	public static final org.tylproject.db.public_.tables.AutUserroleCompany AUT_USERROLE_COMPANY = new org.tylproject.db.public_.tables.AutUserroleCompany();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord> getRecordType() {
		return org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord.class;
	}

	/**
	 * The column <code>public.aut_userrole_company.id_aut_userrole_company</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, java.lang.Integer> ID_AUT_USERROLE_COMPANY = createField("id_aut_userrole_company", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.aut_userrole_company.id_aut_user</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, java.lang.String> ID_AUT_USER = createField("id_aut_user", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>public.aut_userrole_company.id_aut_userrole</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, java.lang.String> ID_AUT_USERROLE = createField("id_aut_userrole", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>public.aut_userrole_company.id_aut_company</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, java.lang.String> ID_AUT_COMPANY = createField("id_aut_company", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>public.aut_userrole_company.version</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, java.lang.Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * The column <code>public.aut_userrole_company.track</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, org.tylproject.db.public_.udt.records.TrackRecord> TRACK = createField("track", org.tylproject.db.public_.udt.Track.TRACK.getDataType(), this, "");

	/**
	 * Create a <code>public.aut_userrole_company</code> table reference
	 */
	public AutUserroleCompany() {
		this("aut_userrole_company", null);
	}

	/**
	 * Create an aliased <code>public.aut_userrole_company</code> table reference
	 */
	public AutUserroleCompany(java.lang.String alias) {
		this(alias, org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY);
	}

	private AutUserroleCompany(java.lang.String alias, org.jooq.Table<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord> aliased) {
		this(alias, aliased, null);
	}

	private AutUserroleCompany(java.lang.String alias, org.jooq.Table<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.tylproject.db.public_.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, java.lang.Integer> getIdentity() {
		return org.tylproject.db.public_.Keys.IDENTITY_AUT_USERROLE_COMPANY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord> getPrimaryKey() {
		return org.tylproject.db.public_.Keys.AUT_USERROLE_COMPANY_AUT_USERCOMPROLE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord>>asList(org.tylproject.db.public_.Keys.AUT_USERROLE_COMPANY_AUT_USERCOMPROLE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, ?>>asList(org.tylproject.db.public_.Keys.AUT_USERROLE_COMPANY__AUT_USER_FK, org.tylproject.db.public_.Keys.AUT_USERROLE_COMPANY__AUT_USERROLE_FK, org.tylproject.db.public_.Keys.AUT_USERROLE_COMPANY__AUT_USERROLE_COMPANY_FK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, java.lang.Integer> getRecordVersion() {
		return org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.tylproject.db.public_.tables.AutUserroleCompany as(java.lang.String alias) {
		return new org.tylproject.db.public_.tables.AutUserroleCompany(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.tylproject.db.public_.tables.AutUserroleCompany rename(java.lang.String name) {
		return new org.tylproject.db.public_.tables.AutUserroleCompany(name, null);
	}
}
