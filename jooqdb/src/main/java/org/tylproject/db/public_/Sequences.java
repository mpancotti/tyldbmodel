/**
 * This class is generated by jOOQ
 */
package org.tylproject.db.public_;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in public
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.aut_usercomprole_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> AUT_USERCOMPROLE_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("aut_usercomprole_id_seq", org.tylproject.db.public_.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.bas_district_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> BAS_DISTRICT_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("bas_district_id_seq", org.tylproject.db.public_.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.exc_exchangerate_idExc_exchangerate_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> EXC_EXCHANGERATE_IDEXC_EXCHANGERATE_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("exc_exchangerate_idExc_exchangerate_seq", org.tylproject.db.public_.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.exc_exchangerate_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> EXC_EXCHANGERATE_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("exc_exchangerate_id_seq", org.tylproject.db.public_.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.todos_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> TODOS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("todos_id_seq", org.tylproject.db.public_.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
