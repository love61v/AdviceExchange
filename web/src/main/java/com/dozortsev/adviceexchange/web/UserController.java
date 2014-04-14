package com.dozortsev.adviceexchange.web;

import com.dozortsev.adviceexchange.domain.Question;
import com.dozortsev.adviceexchange.domain.User;
import com.dozortsev.adviceexchange.service.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.Set;

import static org.apache.log4j.Logger.getLogger;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@SessionAttributes({ "user", "map" })
public class UserController {

    @Autowired private UserService userService;

    @Autowired private BadgeService badgeService;

    @Autowired private AnswerService answerService;

    @Autowired private CommentService commentService;

    @Autowired private QuestionService questionService;

    private static final Md5PasswordEncoder encoder = new Md5PasswordEncoder();

    private static final Logger log = getLogger(UserController.class);

    @RequestMapping(value="/questions", method = GET)
    public ModelAndView index(Principal principal, @RequestParam(required = false) Integer page) {

        ModelAndView mav = new ModelAndView("index");

        if (principal != null && page == null)
            mav.addObject("user", userService.findUserByLogin(principal.getName()));

        if (page != null)
            return mav.addObject("questions", questionService.loadFrom((page - 1) * 2));

        return mav.addObject("questions", questionService.loadFrom(0))
                  .addObject("qsCount", questionService.totalCount());
    }

    @RequestMapping(value = "/user/{id}", method = GET)
    public ModelAndView user(@PathVariable Long id) {

        return new ModelAndView("user", "member", userService.findById(id))
                .addObject("questions", questionService.findQuestionsByUserId(id))
                .addObject("answers", answerService.findAnswersByUserId(id));
    }

    @RequestMapping(value = "/questions/create")
    public String askQuestion(@ModelAttribute Question ask, @ModelAttribute User user) {

        ask.setUser(user);
        questionService.create(ask);

        return "redirect:/questions/" + ask.getId();
    }

    @RequestMapping(value = "/questions/{id}")
    public ModelAndView question(@PathVariable Long id) {

        return new ModelAndView("question", "question", questionService.findById(id))
                .addObject("answers", answerService.findAnswersByQuestionId(id))
                .addObject("comments", commentService.findCommentsByQuestionId(id));
    }

    @RequestMapping(value = "/search", method = GET)
    public ModelAndView findQuestions(@RequestParam String tags) {

        Set<Question> questions = questionService.findQuestionsByTags(tags.split(" "));

        return new ModelAndView("index", "questions", questions);
    }

    @RequestMapping(value = "/createAccount", method = POST)
    public String createAccount(@ModelAttribute("member") User member) {

        member.setPassword(encoder.encodePassword(member.getPassword(), null));
        member.getBadges().add(badgeService.findById(2L)); // USER badge

        userService.create(member);

        return "redirect:/login";
    }

    @RequestMapping(value = "/login/failed", method = GET)
    public String loginFail(Model m) {

        m.addAttribute("error", true);

        return "login";
    }
}
