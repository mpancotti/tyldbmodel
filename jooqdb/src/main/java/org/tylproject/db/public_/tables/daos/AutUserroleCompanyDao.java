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
public class AutUserroleCompanyDao extends org.jooq.impl.DAOImpl<org.tylproject.db.public_.tables.records.AutUserroleCompanyRecord, org.tylproject.db.public_.tables.pojos.AutUserroleCompany, java.lang.Integer> {

	/**
	 * Create a new AutUserroleCompanyDao without any configuration
	 */
	public AutUserroleCompanyDao() {
		super(org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY, org.tylproject.db.public_.tables.pojos.AutUserroleCompany.class);
	}

	/**
	 * Create a new AutUserroleCompanyDao with an attached configuration
	 */
	public AutUserroleCompanyDao(org.jooq.Configuration configuration) {
		super(org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY, org.tylproject.db.public_.tables.pojos.AutUserroleCompany.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.tylproject.db.public_.tables.pojos.AutUserroleCompany object) {
		return object.getIdAutUserroleCompany();
	}

	/**
	 * Fetch records that have <code>id_aut_userrole_company IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutUserroleCompany> fetchByIdAutUserroleCompany(java.lang.Integer... values) {
		return fetch(org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY.ID_AUT_USERROLE_COMPANY, values);
	}

	/**
	 * Fetch a unique record that has <code>id_aut_userrole_company = value</code>
	 */
	public org.tylproject.db.public_.tables.pojos.AutUserroleCompany fetchOneByIdAutUserroleCompany(java.lang.Integer value) {
		return fetchOne(org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY.ID_AUT_USERROLE_COMPANY, value);
	}

	/**
	 * Fetch records that have <code>id_aut_user IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutUserroleCompany> fetchByIdAutUser(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY.ID_AUT_USER, values);
	}

	/**
	 * Fetch records that have <code>id_aut_userrole IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutUserroleCompany> fetchByIdAutUserrole(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY.ID_AUT_USERROLE, values);
	}

	/**
	 * Fetch records that have <code>id_aut_company IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutUserroleCompany> fetchByIdAutCompany(java.lang.String... values) {
		return fetch(org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY.ID_AUT_COMPANY, values);
	}

	/**
	 * Fetch records that have <code>version IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutUserroleCompany> fetchByVersion(java.lang.Integer... values) {
		return fetch(org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY.VERSION, values);
	}

	/**
	 * Fetch records that have <code>track IN (values)</code>
	 */
	public java.util.List<org.tylproject.db.public_.tables.pojos.AutUserroleCompany> fetchByTrack(org.tylproject.db.public_.udt.records.TrackRecord... values) {
		return fetch(org.tylproject.db.public_.tables.AutUserroleCompany.AUT_USERROLE_COMPANY.TRACK, values);
	}
}
