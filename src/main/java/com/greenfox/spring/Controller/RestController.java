package com.greenfox.spring.Controller;

import com.greenfox.spring.Model.Questions;
import com.greenfox.spring.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by georgezsiga on 6/6/17.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  QuestionRepository questionRepository;

  @GetMapping("/questions")
  public Questions questions() {
    return new Questions(questionRepository.findTop5ByQuestion());
  }

}
