package com.dozortsev.adviceexchange.dao;

import com.dozortsev.adviceexchange.domain.Question;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDaoImpl extends GenericDaoImpl<Long, Question> implements QuestionDao {

    public QuestionDaoImpl() {
        this.entityClass = Question.class;
    }
}
