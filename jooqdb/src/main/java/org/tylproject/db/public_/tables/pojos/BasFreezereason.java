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
public class BasFreezereason implements java.io.Serializable {

	private static final long serialVersionUID = 38598865;

	private java.lang.String   idFreezereason;
	private java.lang.String   discriminator;
	private java.sql.Timestamp createdOn;
	private java.lang.String   createdBy;
	private java.sql.Timestamp updatedOn;
	private java.lang.String   updatedBy;
	private java.lang.Boolean  canceled;
	private java.lang.Integer  version;

	public BasFreezereason() {}

	public BasFreezereason(
		java.lang.String   idFreezereason,
		java.lang.String   discriminator,
		java.sql.Timestamp createdOn,
		java.lang.String   createdBy,
		java.sql.Timestamp updatedOn,
		java.lang.String   updatedBy,
		java.lang.Boolean  canceled,
		java.lang.Integer  version
	) {
		this.idFreezereason = idFreezereason;
		this.discriminator = discriminator;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.updatedOn = updatedOn;
		this.updatedBy = updatedBy;
		this.canceled = canceled;
		this.version = version;
	}

	public java.lang.String getIdFreezereason() {
		return this.idFreezereason;
	}

	public BasFreezereason setIdFreezereason(java.lang.String idFreezereason) {
		this.idFreezereason = idFreezereason;
		return this;
	}

	public java.lang.String getDiscriminator() {
		return this.discriminator;
	}

	public BasFreezereason setDiscriminator(java.lang.String discriminator) {
		this.discriminator = discriminator;
		return this;
	}

	public java.sql.Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public BasFreezereason setCreatedOn(java.sql.Timestamp createdOn) {
		this.createdOn = createdOn;
		return this;
	}

	public java.lang.String getCreatedBy() {
		return this.createdBy;
	}

	public BasFreezereason setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	public java.sql.Timestamp getUpdatedOn() {
		return this.updatedOn;
	}

	public BasFreezereason setUpdatedOn(java.sql.Timestamp updatedOn) {
		this.updatedOn = updatedOn;
		return this;
	}

	public java.lang.String getUpdatedBy() {
		return this.updatedBy;
	}

	public BasFreezereason setUpdatedBy(java.lang.String updatedBy) {
		this.updatedBy = updatedBy;
		return this;
	}

	public java.lang.Boolean getCanceled() {
		return this.canceled;
	}

	public BasFreezereason setCanceled(java.lang.Boolean canceled) {
		this.canceled = canceled;
		return this;
	}

	public java.lang.Integer getVersion() {
		return this.version;
	}

	public BasFreezereason setVersion(java.lang.Integer version) {
		this.version = version;
		return this;
	}
}
