/**
 * This class is generated by jOOQ
 */
package org.tylproject.db.public_.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AutUser implements java.io.Serializable {

	private static final long serialVersionUID = 856013099;

	private java.lang.String                          login;
	private java.lang.String                          password;
	private java.lang.String                          passwordHint;
	private java.sql.Timestamp                        validThru;
	private java.lang.Boolean                         validityManaged;
	private java.lang.Integer                         idParParty;
	private java.lang.Boolean                         canceled;
	private java.lang.Integer                         version;
	private org.tylproject.db.public_.udt.pojos.Track track;

	public AutUser() {}

	public AutUser(
		java.lang.String                          login,
		java.lang.String                          password,
		java.lang.String                          passwordHint,
		java.sql.Timestamp                        validThru,
		java.lang.Boolean                         validityManaged,
		java.lang.Integer                         idParParty,
		java.lang.Boolean                         canceled,
		java.lang.Integer                         version,
		org.tylproject.db.public_.udt.pojos.Track track
	) {
		this.login = login;
		this.password = password;
		this.passwordHint = passwordHint;
		this.validThru = validThru;
		this.validityManaged = validityManaged;
		this.idParParty = idParParty;
		this.canceled = canceled;
		this.version = version;
		this.track = track;
	}

	public java.lang.String getLogin() {
		return this.login;
	}

	public AutUser setLogin(java.lang.String login) {
		this.login = login;
		return this;
	}

	public java.lang.String getPassword() {
		return this.password;
	}

	public AutUser setPassword(java.lang.String password) {
		this.password = password;
		return this;
	}

	public java.lang.String getPasswordHint() {
		return this.passwordHint;
	}

	public AutUser setPasswordHint(java.lang.String passwordHint) {
		this.passwordHint = passwordHint;
		return this;
	}

	public java.sql.Timestamp getValidThru() {
		return this.validThru;
	}

	public AutUser setValidThru(java.sql.Timestamp validThru) {
		this.validThru = validThru;
		return this;
	}

	public java.lang.Boolean getValidityManaged() {
		return this.validityManaged;
	}

	public AutUser setValidityManaged(java.lang.Boolean validityManaged) {
		this.validityManaged = validityManaged;
		return this;
	}

	public java.lang.Integer getIdParParty() {
		return this.idParParty;
	}

	public AutUser setIdParParty(java.lang.Integer idParParty) {
		this.idParParty = idParParty;
		return this;
	}

	public java.lang.Boolean getCanceled() {
		return this.canceled;
	}

	public AutUser setCanceled(java.lang.Boolean canceled) {
		this.canceled = canceled;
		return this;
	}

	public java.lang.Integer getVersion() {
		return this.version;
	}

	public AutUser setVersion(java.lang.Integer version) {
		this.version = version;
		return this;
	}

	public org.tylproject.db.public_.udt.pojos.Track getTrack() {
		return this.track;
	}

	public AutUser setTrack(org.tylproject.db.public_.udt.pojos.Track track) {
		this.track = track;
		return this;
	}
}
