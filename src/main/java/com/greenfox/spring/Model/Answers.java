package com.greenfox.spring.Model;

/**
 * Created by georgezsiga on 6/6/17.
 */
public class Answers {

  int id;
  Iterable<Answer> answers;

  public Answers(Iterable<Answer> answers) {
    this.id = 1;
    this.answers = answers;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Iterable<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(Iterable<Answer> answers) {
    this.answers = answers;
  }
}

