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
public class ExcForeigncurrencyRecord extends org.jooq.impl.UpdatableRecordImpl<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord> implements org.jooq.Record1<java.lang.String> {

	private static final long serialVersionUID = 2084243162;

	/**
	 * Setter for <code>public.exc_foreigncurrency.id_exc_foreigncurrency</code>.
	 */
	public ExcForeigncurrencyRecord setIdExcForeigncurrency(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.exc_foreigncurrency.id_exc_foreigncurrency</code>.
	 */
	public java.lang.String getIdExcForeigncurrency() {
		return (java.lang.String) getValue(0);
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
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.tylproject.db.public_.tables.ExcForeigncurrency.EXC_FOREIGNCURRENCY.ID_EXC_FOREIGNCURRENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getIdExcForeigncurrency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcForeigncurrencyRecord value1(java.lang.String value) {
		setIdExcForeigncurrency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExcForeigncurrencyRecord values(java.lang.String value1) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExcForeigncurrencyRecord
	 */
	public ExcForeigncurrencyRecord() {
		super(org.tylproject.db.public_.tables.ExcForeigncurrency.EXC_FOREIGNCURRENCY);
	}

	/**
	 * Create a detached, initialised ExcForeigncurrencyRecord
	 */
	public ExcForeigncurrencyRecord(java.lang.String idExcForeigncurrency) {
		super(org.tylproject.db.public_.tables.ExcForeigncurrency.EXC_FOREIGNCURRENCY);

		setValue(0, idExcForeigncurrency);
	}
}