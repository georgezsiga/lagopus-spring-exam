package com.greenfox.spring.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by georgezsiga on 6/6/17.
 */
@Entity
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String question;

  public Question() {
  }

  public Question(String question) {
    this.question = question;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }
}
