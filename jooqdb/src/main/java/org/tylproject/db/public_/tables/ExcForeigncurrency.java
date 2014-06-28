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
public class ExcForeigncurrency extends org.jooq.impl.TableImpl<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord> {

	private static final long serialVersionUID = -1949702526;

	/**
	 * The singleton instance of <code>public.exc_foreigncurrency</code>
	 */
	public static final org.tylproject.db.public_.tables.ExcForeigncurrency EXC_FOREIGNCURRENCY = new org.tylproject.db.public_.tables.ExcForeigncurrency();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord> getRecordType() {
		return org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord.class;
	}

	/**
	 * The column <code>public.exc_foreigncurrency.id_exc_foreigncurrency</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord, java.lang.String> ID_EXC_FOREIGNCURRENCY = createField("id_exc_foreigncurrency", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false), this, "");

	/**
	 * Create a <code>public.exc_foreigncurrency</code> table reference
	 */
	public ExcForeigncurrency() {
		this("exc_foreigncurrency", null);
	}

	/**
	 * Create an aliased <code>public.exc_foreigncurrency</code> table reference
	 */
	public ExcForeigncurrency(java.lang.String alias) {
		this(alias, org.tylproject.db.public_.tables.ExcForeigncurrency.EXC_FOREIGNCURRENCY);
	}

	private ExcForeigncurrency(java.lang.String alias, org.jooq.Table<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord> aliased) {
		this(alias, aliased, null);
	}

	private ExcForeigncurrency(java.lang.String alias, org.jooq.Table<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.tylproject.db.public_.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord> getPrimaryKey() {
		return org.tylproject.db.public_.Keys.TABEXC_FOREIGNCURRENCY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord>>asList(org.tylproject.db.public_.Keys.TABEXC_FOREIGNCURRENCY_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.tylproject.db.public_.tables.ExcForeigncurrency as(java.lang.String alias) {
		return new org.tylproject.db.public_.tables.ExcForeigncurrency(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.tylproject.db.public_.tables.ExcForeigncurrency rename(java.lang.String name) {
		return new org.tylproject.db.public_.tables.ExcForeigncurrency(name, null);
	}
}