/**
 * This class is generated by jOOQ
 */
package com.dozortsev.adviceexchange.domain.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionTagRecord extends org.jooq.impl.TableRecordImpl<com.dozortsev.adviceexchange.domain.jooq.tables.records.QuestionTagRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 30061999;

	/**
	 * Setter for <code>adviceexchange.question_tag.qt_question_id</code>.
	 */
	public void setQtQuestionId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>adviceexchange.question_tag.qt_question_id</code>.
	 */
	public java.lang.Integer getQtQuestionId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>adviceexchange.question_tag.qt_tag_id</code>.
	 */
	public void setQtTagId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>adviceexchange.question_tag.qt_tag_id</code>.
	 */
	public java.lang.Integer getQtTagId() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.dozortsev.adviceexchange.domain.jooq.tables.QuestionTag.QUESTION_TAG.QT_QUESTION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.dozortsev.adviceexchange.domain.jooq.tables.QuestionTag.QUESTION_TAG.QT_TAG_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getQtQuestionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getQtTagId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionTagRecord value1(java.lang.Integer value) {
		setQtQuestionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionTagRecord value2(java.lang.Integer value) {
		setQtTagId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QuestionTagRecord values(java.lang.Integer value1, java.lang.Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached QuestionTagRecord
	 */
	public QuestionTagRecord() {
		super(com.dozortsev.adviceexchange.domain.jooq.tables.QuestionTag.QUESTION_TAG);
	}

	/**
	 * Create a detached, initialised QuestionTagRecord
	 */
	public QuestionTagRecord(java.lang.Integer qtQuestionId, java.lang.Integer qtTagId) {
		super(com.dozortsev.adviceexchange.domain.jooq.tables.QuestionTag.QUESTION_TAG);

		setValue(0, qtQuestionId);
		setValue(1, qtTagId);
	}
}
