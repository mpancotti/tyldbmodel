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
public class BasFreezereasonDao extends org.jooq.impl.DAOImpl<org.tylproject.db.public_.tables.records.BasFreezereasonRecord, org.tylproject.db.public_.tables.pojos.BasFreezereason, java.lang.String> {

	/**
	 * Create a new BasFreezereasonDao without any configuration
	 */
	public BasFreezereasonDao() {
		super(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON, org.tylproject.db.public_.tables.pojos.BasFreezereason.class);
	}

	/**
	 * Create a new BasFreezereasonDao with an attached configuration
	 */
	public BasFreezereasonDao(org.jooq.Configuration configuration) {
		super(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON, org.tylproject.db.public_.tables.pojos.BasFreezereason.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(org.tylproject.db.public_.tables.pojos.BasFreezereason object) {
		return object.getIdFreezereason();
	}

	/**
	 * Fetch records that have <code>id_freezereason IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.BasFreezereason> fetchByIdFreezereason(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON.ID_FREEZEREASON, values);
	}

	/**
	 * Fetch a unique record that has <code>id_freezereason = value</code>
	 */
	public org.tylproject.db.public_.tables.pojos.BasFreezereason fetchOneByIdFreezereason(java.lang.String value) {
		return fetchOne(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON.ID_FREEZEREASON, value);
	}

	/**
	 * Fetch records that have <code>discriminator IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.BasFreezereason> fetchByDiscriminator(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON.DISCRIMINATOR, values);
	}

	/**
	 * Fetch records that have <code>created_on IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.BasFreezereason> fetchByCreatedOn(java.sql.Timestamp... values) {
		return fetch(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON.CREATED_ON, values);
	}

	/**
	 * Fetch records that have <code>created_by IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.BasFreezereason> fetchByCreatedBy(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON.CREATED_BY, values);
	}

	/**
	 * Fetch records that have <code>updated_on IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.BasFreezereason> fetchByUpdatedOn(java.sql.Timestamp... values) {
		return fetch(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON.UPDATED_ON, values);
	}

	/**
	 * Fetch records that have <code>updated_by IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.BasFreezereason> fetchByUpdatedBy(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON.UPDATED_BY, values);
	}

	/**
	 * Fetch records that have <code>canceled IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.BasFreezereason> fetchByCanceled(java.lang.Boolean... values) {
		return fetch(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON.CANCELED, values);
	}

	/**
	 * Fetch records that have <code>version IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.BasFreezereason> fetchByVersion(java.lang.Integer... values) {
		return fetch(org.tylproject.db.public_.tables.BasFreezereason.BAS_FREEZEREASON.VERSION, values);
	}
}