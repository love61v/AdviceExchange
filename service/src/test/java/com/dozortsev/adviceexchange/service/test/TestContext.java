package com.dozortsev.adviceexchange.service.test;

import com.dozortsev.adviceexchange.service.*;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/META-INF/spring/test-application-context.xml")
public abstract class TestContext {

    static final Logger log = Logger.getLogger(TestContext.class);

    @Autowired protected TagService tagService;

    @Autowired protected UserService userService;

    @Autowired protected QuestionService questionService;

    @Autowired protected AnswerService answerService;

    @Autowired protected CommentService commentService;
}