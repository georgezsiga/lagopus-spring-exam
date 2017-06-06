package com.greenfox.spring;

import com.greenfox.spring.Model.Answer;
import com.greenfox.spring.Model.Answers;
import com.greenfox.spring.Model.Questions;
import com.greenfox.spring.Repository.AnswerRepository;
import java.util.ArrayList;
import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by georgezsiga on 6/6/17.
 */
public class Logic {

  @Autowired
  AnswerRepository answerRepository;

  ArrayList<Answer> rightAnswers = new ArrayList<Answer>();

  public boolean checkAnswers(Questions sentQuestions, ArrayList<Answer> answers) {
    getRightAnswers(sentQuestions);
    if (rightAnswers == answers) {
      return true;
    }
    return false;
  }

  public void getRightAnswers(Questions sentQuestions) {
    ArrayList<com.greenfox.spring.Model.Question> questionList = (ArrayList<com.greenfox.spring.Model.Question>) sentQuestions.getQuestions();
    for (com.greenfox.spring.Model.Question q: questionList) {
      rightAnswers.add(answerRepository.findFirstById(q.getId()));
    }
  }

}
