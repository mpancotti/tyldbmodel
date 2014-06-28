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
public class AutUser extends org.jooq.impl.TableImpl<org.tylproject.db.public_.tables.records.AutUserRecord> {

	private static final long serialVersionUID = 960431242;

	/**
	 * The singleton instance of <code>public.aut_user</code>
	 */
	public static final org.tylproject.db.public_.tables.AutUser AUT_USER = new org.tylproject.db.public_.tables.AutUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.tylproject.db.public_.tables.records.AutUserRecord> getRecordType() {
		return org.tylproject.db.public_.tables.records.AutUserRecord.class;
	}

	/**
	 * The column <code>public.aut_user.login</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, java.lang.String> LOGIN = createField("login", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>public.aut_user.password</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>public.aut_user.password_hint</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, java.lang.String> PASSWORD_HINT = createField("password_hint", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>public.aut_user.valid_thru</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, java.sql.Timestamp> VALID_THRU = createField("valid_thru", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.aut_user.validity_managed</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, java.lang.Boolean> VALIDITY_MANAGED = createField("validity_managed", org.jooq.impl.SQLDataType.BOOLEAN.defaulted(true), this, "");

	/**
	 * The column <code>public.aut_user.id_par_party</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, java.lang.Integer> ID_PAR_PARTY = createField("id_par_party", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.aut_user.canceled</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, java.lang.Boolean> CANCELED = createField("canceled", org.jooq.impl.SQLDataType.BOOLEAN.defaulted(true), this, "");

	/**
	 * The column <code>public.aut_user.version</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, java.lang.Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.aut_user.track</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, org.tylproject.db.public_.udt.records.TrackRecord> TRACK = createField("track", org.tylproject.db.public_.udt.Track.TRACK.getDataType(), this, "");

	/**
	 * Create a <code>public.aut_user</code> table reference
	 */
	public AutUser() {
		this("aut_user", null);
	}

	/**
	 * Create an aliased <code>public.aut_user</code> table reference
	 */
	public AutUser(java.lang.String alias) {
		this(alias, org.tylproject.db.public_.tables.AutUser.AUT_USER);
	}

	private AutUser(java.lang.String alias, org.jooq.Table<org.tylproject.db.public_.tables.records.AutUserRecord> aliased) {
		this(alias, aliased, null);
	}

	private AutUser(java.lang.String alias, org.jooq.Table<org.tylproject.db.public_.tables.records.AutUserRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.tylproject.db.public_.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.AutUserRecord> getPrimaryKey() {
		return org.tylproject.db.public_.Keys.AUT_USER_IDX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.AutUserRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.AutUserRecord>>asList(org.tylproject.db.public_.Keys.AUT_USER_IDX);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.TableField<org.tylproject.db.public_.tables.records.AutUserRecord, java.lang.Integer> getRecordVersion() {
		return org.tylproject.db.public_.tables.AutUser.AUT_USER.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.tylproject.db.public_.tables.AutUser as(java.lang.String alias) {
		return new org.tylproject.db.public_.tables.AutUser(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.tylproject.db.public_.tables.AutUser rename(java.lang.String name) {
		return new org.tylproject.db.public_.tables.AutUser(name, null);
	}
}