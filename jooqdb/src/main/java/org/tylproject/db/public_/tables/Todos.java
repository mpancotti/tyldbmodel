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
public class Todos extends org.jooq.impl.TableImpl<org.tylproject.db.public_.tables.records.TodosRecord> {

	private static final long serialVersionUID = 319060016;

	/**
	 * The singleton instance of <code>public.todos</code>
	 */
	public static final org.tylproject.db.public_.tables.Todos TODOS = new org.tylproject.db.public_.tables.Todos();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.tylproject.db.public_.tables.records.TodosRecord> getRecordType() {
		return org.tylproject.db.public_.tables.records.TodosRecord.class;
	}

	/**
	 * The column <code>public.todos.id</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.TodosRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.todos.creation_time</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.TodosRecord, java.sql.Timestamp> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.todos.description</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.TodosRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "");

	/**
	 * The column <code>public.todos.modification_time</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.TodosRecord, java.sql.Timestamp> MODIFICATION_TIME = createField("modification_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.todos.title</code>.
	 */
	public final org.jooq.TableField<org.tylproject.db.public_.tables.records.TodosRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>public.todos</code> table reference
	 */
	public Todos() {
		this("todos", null);
	}

	/**
	 * Create an aliased <code>public.todos</code> table reference
	 */
	public Todos(java.lang.String alias) {
		this(alias, org.tylproject.db.public_.tables.Todos.TODOS);
	}

	private Todos(java.lang.String alias, org.jooq.Table<org.tylproject.db.public_.tables.records.TodosRecord> aliased) {
		this(alias, aliased, null);
	}

	private Todos(java.lang.String alias, org.jooq.Table<org.tylproject.db.public_.tables.records.TodosRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.tylproject.db.public_.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.tylproject.db.public_.tables.records.TodosRecord, java.lang.Integer> getIdentity() {
		return org.tylproject.db.public_.Keys.IDENTITY_TODOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.TodosRecord> getPrimaryKey() {
		return org.tylproject.db.public_.Keys.TODOS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.TodosRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.tylproject.db.public_.tables.records.TodosRecord>>asList(org.tylproject.db.public_.Keys.TODOS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.tylproject.db.public_.tables.Todos as(java.lang.String alias) {
		return new org.tylproject.db.public_.tables.Todos(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.tylproject.db.public_.tables.Todos rename(java.lang.String name) {
		return new org.tylproject.db.public_.tables.Todos(name, null);
	}
}
