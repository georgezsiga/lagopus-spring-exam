package com.greenfox.spring.Model;

import java.util.ArrayList;

/**
 * Created by georgezsiga on 6/6/17.
 */
public class Answers {

  int id;
  ArrayList<Answer> answers;

  public Answers(ArrayList<Answer> answers) {
    this.id = 1;
    this.answers = answers;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ArrayList<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(ArrayList<Answer> answers) {
    this.answers = answers;
  }
}

