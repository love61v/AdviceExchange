/**
 * This class is generated by jOOQ
 */
package com.dozortsev.adviceexchange.domain.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserBadge extends org.jooq.impl.TableImpl<com.dozortsev.adviceexchange.domain.jooq.tables.records.UserBadgeRecord> {

	private static final long serialVersionUID = -255460885;

	/**
	 * The singleton instance of <code>adviceexchange.user_badge</code>
	 */
	public static final com.dozortsev.adviceexchange.domain.jooq.tables.UserBadge USER_BADGE = new com.dozortsev.adviceexchange.domain.jooq.tables.UserBadge();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.dozortsev.adviceexchange.domain.jooq.tables.records.UserBadgeRecord> getRecordType() {
		return com.dozortsev.adviceexchange.domain.jooq.tables.records.UserBadgeRecord.class;
	}

	/**
	 * The column <code>adviceexchange.user_badge.ub_badge_id</code>.
	 */
	public final org.jooq.TableField<com.dozortsev.adviceexchange.domain.jooq.tables.records.UserBadgeRecord, java.lang.Integer> UB_BADGE_ID = createField("ub_badge_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>adviceexchange.user_badge.ub_user_id</code>.
	 */
	public final org.jooq.TableField<com.dozortsev.adviceexchange.domain.jooq.tables.records.UserBadgeRecord, java.lang.Integer> UB_USER_ID = createField("ub_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>adviceexchange.user_badge</code> table reference
	 */
	public UserBadge() {
		this("user_badge", null);
	}

	/**
	 * Create an aliased <code>adviceexchange.user_badge</code> table reference
	 */
	public UserBadge(java.lang.String alias) {
		this(alias, com.dozortsev.adviceexchange.domain.jooq.tables.UserBadge.USER_BADGE);
	}

	private UserBadge(java.lang.String alias, org.jooq.Table<com.dozortsev.adviceexchange.domain.jooq.tables.records.UserBadgeRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserBadge(java.lang.String alias, org.jooq.Table<com.dozortsev.adviceexchange.domain.jooq.tables.records.UserBadgeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.dozortsev.adviceexchange.domain.jooq.Adviceexchange.ADVICEEXCHANGE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.UserBadgeRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.UserBadgeRecord, ?>>asList(com.dozortsev.adviceexchange.domain.jooq.Keys.FK_UB_BADGE_ID, com.dozortsev.adviceexchange.domain.jooq.Keys.FK_UB_USER_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.dozortsev.adviceexchange.domain.jooq.tables.UserBadge as(java.lang.String alias) {
		return new com.dozortsev.adviceexchange.domain.jooq.tables.UserBadge(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.dozortsev.adviceexchange.domain.jooq.tables.UserBadge rename(java.lang.String name) {
		return new com.dozortsev.adviceexchange.domain.jooq.tables.UserBadge(name, null);
	}
}
