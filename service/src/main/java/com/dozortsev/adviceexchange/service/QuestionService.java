package com.dozortsev.adviceexchange.service;

import com.dozortsev.adviceexchange.domain.Answer;
import com.dozortsev.adviceexchange.domain.Question;

import java.util.Set;

public interface QuestionService extends GenericService<Long, Question> {

    Integer addAnswer(Question question, Answer answer);

    Integer delAnswer(Answer answer);

    Set<Question> findQuestionsByKeyWords(String... keyWords);

    Set<Question> loadFrom(Integer offset);

    Set<Question> findQuestionsByUserId(Long userId);

    Set<Question> findQuestionsByTags(String... tags);
}
