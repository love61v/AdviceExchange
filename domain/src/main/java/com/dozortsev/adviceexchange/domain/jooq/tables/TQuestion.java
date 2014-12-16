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
public class TQuestion extends org.jooq.impl.TableImpl<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord> {

	private static final long serialVersionUID = 1144120911;

	/**
	 * The singleton instance of <code>adviceexchange.question</code>
	 */
	public static final com.dozortsev.adviceexchange.domain.jooq.tables.TQuestion QUESTION = new com.dozortsev.adviceexchange.domain.jooq.tables.TQuestion();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord> getRecordType() {
		return com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord.class;
	}

	/**
	 * The column <code>adviceexchange.question.id</code>.
	 */
	public final org.jooq.TableField<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>adviceexchange.question.title</code>.
	 */
	public final org.jooq.TableField<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

	/**
	 * Create a <code>adviceexchange.question</code> table reference
	 */
	public TQuestion() {
		this("question", null);
	}

	/**
	 * Create an aliased <code>adviceexchange.question</code> table reference
	 */
	public TQuestion(java.lang.String alias) {
		this(alias, com.dozortsev.adviceexchange.domain.jooq.tables.TQuestion.QUESTION);
	}

	private TQuestion(java.lang.String alias, org.jooq.Table<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord> aliased) {
		this(alias, aliased, null);
	}

	private TQuestion(java.lang.String alias, org.jooq.Table<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.dozortsev.adviceexchange.domain.jooq.Adviceexchange.ADVICEEXCHANGE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord, java.lang.Integer> getIdentity() {
		return com.dozortsev.adviceexchange.domain.jooq.Keys.IDENTITY_QUESTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord> getPrimaryKey() {
		return com.dozortsev.adviceexchange.domain.jooq.Keys.KEY_QUESTION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord>>asList(com.dozortsev.adviceexchange.domain.jooq.Keys.KEY_QUESTION_PRIMARY, com.dozortsev.adviceexchange.domain.jooq.Keys.KEY_QUESTION_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionRecord, ?>>asList(com.dozortsev.adviceexchange.domain.jooq.Keys.FK_QS_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.dozortsev.adviceexchange.domain.jooq.tables.TQuestion as(java.lang.String alias) {
		return new com.dozortsev.adviceexchange.domain.jooq.tables.TQuestion(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.dozortsev.adviceexchange.domain.jooq.tables.TQuestion rename(java.lang.String name) {
		return new com.dozortsev.adviceexchange.domain.jooq.tables.TQuestion(name, null);
	}
}