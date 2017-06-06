package com.greenfox.spring.Controller;

import com.greenfox.spring.Model.Answers;
import com.greenfox.spring.Model.Questions;
import com.greenfox.spring.Repository.AnswerRepository;
import com.greenfox.spring.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by georgezsiga on 6/6/17.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  private QuestionRepository questionRepository;

  @Autowired
  private AnswerRepository answerRepository;

  @GetMapping("/questions")
  public Questions questions() {
    return new Questions(questionRepository.findAll());
  }

  @PostMapping("/answers")
  public Answers answers() {
    return new Answers(answerRepository.findAll());
  }

}
