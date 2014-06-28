/**
 * This class is generated by jOOQ
 */
package org.tylproject.db.public_.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExcForeigncurrencyDao extends org.jooq.impl.DAOImpl<org.tylproject.db.public_.tables.records.ExcForeigncurrencyRecord, org.tylproject.db.public_.tables.pojos.ExcForeigncurrency, java.lang.String> {

	/**
	 * Create a new ExcForeigncurrencyDao without any configuration
	 */
	public ExcForeigncurrencyDao() {
		super(org.tylproject.db.public_.tables.ExcForeigncurrency.EXC_FOREIGNCURRENCY, org.tylproject.db.public_.tables.pojos.ExcForeigncurrency.class);
	}

	/**
	 * Create a new ExcForeigncurrencyDao with an attached configuration
	 */
	public ExcForeigncurrencyDao(org.jooq.Configuration configuration) {
		super(org.tylproject.db.public_.tables.ExcForeigncurrency.EXC_FOREIGNCURRENCY, org.tylproject.db.public_.tables.pojos.ExcForeigncurrency.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(org.tylproject.db.public_.tables.pojos.ExcForeigncurrency object) {
		return object.getIdExcForeigncurrency();
	}

	/**
	 * Fetch records that have <code>id_exc_foreigncurrency IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.ExcForeigncurrency> fetchByIdExcForeigncurrency(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.ExcForeigncurrency.EXC_FOREIGNCURRENCY.ID_EXC_FOREIGNCURRENCY, values);
	}

	/**
	 * Fetch a unique record that has <code>id_exc_foreigncurrency = value</code>
	 */
	public org.tylproject.db.public_.tables.pojos.ExcForeigncurrency fetchOneByIdExcForeigncurrency(java.lang.String value) {
		return fetchOne(org.tylproject.db.public_.tables.ExcForeigncurrency.EXC_FOREIGNCURRENCY.ID_EXC_FOREIGNCURRENCY, value);
	}
}
