package com.greenfox.spring;

import com.greenfox.spring.Model.Answer;
import com.greenfox.spring.Model.Answers;
import com.greenfox.spring.Model.Questions;
import com.greenfox.spring.Repository.AnswerRepository;
import com.greenfox.spring.Repository.QuestionRepository;
import java.util.ArrayList;
import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by georgezsiga on 6/6/17.
 */
public class Logic {

  @Autowired
  AnswerRepository answerRepository;

  @Autowired
  QuestionRepository questionRepository;

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

  public ArrayList<com.greenfox.spring.Model.Question> getRandomQuestions() {
    ArrayList<com.greenfox.spring.Model.Question> allQuestions = (ArrayList<com.greenfox.spring.Model.Question>) questionRepository.findAllBy();
    ArrayList<com.greenfox.spring.Model.Question> randomQuestions = new ArrayList<com.greenfox.spring.Model.Question>();
    Long length = Long.valueOf(allQuestions.size());
    while (randomQuestions.size() < 5) {
      randomQuestions.add(questionRepository.findOne(randomNumber(length)));
    }
    return randomQuestions;
  }

  public Long randomNumber(Long totalNumberOfQuestions) {
    Long randNum = Long.valueOf((int) Math.random() * totalNumberOfQuestions + 1);
    return randNum;
  }
}
