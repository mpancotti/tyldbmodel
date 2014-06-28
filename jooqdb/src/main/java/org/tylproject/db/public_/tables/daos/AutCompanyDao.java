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
public class AutCompanyDao extends org.jooq.impl.DAOImpl<org.tylproject.db.public_.tables.records.AutCompanyRecord, org.tylproject.db.public_.tables.pojos.AutCompany, java.lang.String> {

	/**
	 * Create a new AutCompanyDao without any configuration
	 */
	public AutCompanyDao() {
		super(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY, org.tylproject.db.public_.tables.pojos.AutCompany.class);
	}

	/**
	 * Create a new AutCompanyDao with an attached configuration
	 */
	public AutCompanyDao(org.jooq.Configuration configuration) {
		super(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY, org.tylproject.db.public_.tables.pojos.AutCompany.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(org.tylproject.db.public_.tables.pojos.AutCompany object) {
		return object.getIdAutCompany();
	}

	/**
	 * Fetch records that have <code>id_aut_company IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutCompany> fetchByIdAutCompany(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.ID_AUT_COMPANY, values);
	}

	/**
	 * Fetch a unique record that has <code>id_aut_company = value</code>
	 */
	public org.tylproject.db.public_.tables.pojos.AutCompany fetchOneByIdAutCompany(java.lang.String value) {
		return fetchOne(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.ID_AUT_COMPANY, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutCompany> fetchByName(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.NAME, values);
	}

	/**
	 * Fetch records that have <code>id_par_party IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutCompany> fetchByIdParParty(java.lang.Integer... values) {
		return fetch(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.ID_PAR_PARTY, values);
	}

	/**
	 * Fetch records that have <code>canceled IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutCompany> fetchByCanceled(java.lang.Boolean... values) {
		return fetch(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.CANCELED, values);
	}

	/**
	 * Fetch records that have <code>version IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutCompany> fetchByVersion(java.lang.Integer... values) {
		return fetch(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.VERSION, values);
	}

	/**
	 * Fetch records that have <code>track IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutCompany> fetchByTrack(org.tylproject.db.public_.udt.records.TrackRecord... values) {
		return fetch(org.tylproject.db.public_.tables.AutCompany.AUT_COMPANY.TRACK, values);
	}
}
