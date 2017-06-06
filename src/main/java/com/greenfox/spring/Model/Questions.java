package com.greenfox.spring.Model;

import java.util.ArrayList;

/**
 * Created by georgezsiga on 6/6/17.
 */
public class Questions {


  int id;
  ArrayList<Question> questions;

  public Questions(ArrayList<Question> questions) {
    this.id = 1;
    this.questions = questions;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ArrayList<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(ArrayList<Question> questions) {
    this.questions = questions;
  }
}
