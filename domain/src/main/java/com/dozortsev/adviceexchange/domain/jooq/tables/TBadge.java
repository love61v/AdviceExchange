/**
 * This class is generated by jOOQ
 */
package com.dozortsev.adviceexchange.domain.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBadge extends org.jooq.impl.TableImpl<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord> {

	private static final long serialVersionUID = 667609876;

	/**
	 * The singleton instance of <code>adviceexchange.badge</code>
	 */
	public static final com.dozortsev.adviceexchange.domain.jooq.tables.TBadge BADGE = new com.dozortsev.adviceexchange.domain.jooq.tables.TBadge();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord> getRecordType() {
		return com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord.class;
	}

	/**
	 * The column <code>adviceexchange.badge.id</code>.
	 */
	public final org.jooq.TableField<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>adviceexchange.badge.name</code>.
	 */
	public final org.jooq.TableField<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>adviceexchange.badge.desc</code>.
	 */
	public final org.jooq.TableField<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord, java.lang.String> DESC = createField("desc", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "");

	/**
	 * Create a <code>adviceexchange.badge</code> table reference
	 */
	public TBadge() {
		this("badge", null);
	}

	/**
	 * Create an aliased <code>adviceexchange.badge</code> table reference
	 */
	public TBadge(java.lang.String alias) {
		this(alias, com.dozortsev.adviceexchange.domain.jooq.tables.TBadge.BADGE);
	}

	private TBadge(java.lang.String alias, org.jooq.Table<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBadge(java.lang.String alias, org.jooq.Table<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.dozortsev.adviceexchange.domain.jooq.Adviceexchange.ADVICEEXCHANGE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord, java.lang.Integer> getIdentity() {
		return com.dozortsev.adviceexchange.domain.jooq.Keys.IDENTITY_BADGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord> getPrimaryKey() {
		return com.dozortsev.adviceexchange.domain.jooq.Keys.KEY_BADGE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.BadgeRecord>>asList(com.dozortsev.adviceexchange.domain.jooq.Keys.KEY_BADGE_PRIMARY, com.dozortsev.adviceexchange.domain.jooq.Keys.KEY_BADGE_ID, com.dozortsev.adviceexchange.domain.jooq.Keys.KEY_BADGE_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.dozortsev.adviceexchange.domain.jooq.tables.TBadge as(java.lang.String alias) {
		return new com.dozortsev.adviceexchange.domain.jooq.tables.TBadge(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.dozortsev.adviceexchange.domain.jooq.tables.TBadge rename(java.lang.String name) {
		return new com.dozortsev.adviceexchange.domain.jooq.tables.TBadge(name, null);
	}
}
