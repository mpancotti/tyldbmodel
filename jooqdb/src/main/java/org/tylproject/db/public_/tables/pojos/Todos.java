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
public class Todos implements java.io.Serializable {

	private static final long serialVersionUID = -1315272171;

	private java.lang.Integer  id;
	private java.sql.Timestamp creationTime;
	private java.lang.String   description;
	private java.sql.Timestamp modificationTime;
	private java.lang.String   title;

	public Todos() {}

	public Todos(
		java.lang.Integer  id,
		java.sql.Timestamp creationTime,
		java.lang.String   description,
		java.sql.Timestamp modificationTime,
		java.lang.String   title
	) {
		this.id = id;
		this.creationTime = creationTime;
		this.description = description;
		this.modificationTime = modificationTime;
		this.title = title;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public Todos setId(java.lang.Integer id) {
		this.id = id;
		return this;
	}

	public java.sql.Timestamp getCreationTime() {
		return this.creationTime;
	}

	public Todos setCreationTime(java.sql.Timestamp creationTime) {
		this.creationTime = creationTime;
		return this;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public Todos setDescription(java.lang.String description) {
		this.description = description;
		return this;
	}

	public java.sql.Timestamp getModificationTime() {
		return this.modificationTime;
	}

	public Todos setModificationTime(java.sql.Timestamp modificationTime) {
		this.modificationTime = modificationTime;
		return this;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public Todos setTitle(java.lang.String title) {
		this.title = title;
		return this;
	}
}
