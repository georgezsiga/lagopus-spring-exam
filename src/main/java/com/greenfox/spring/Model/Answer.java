package com.greenfox.spring.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by georgezsiga on 6/6/17.
 */
@Entity
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String answer;

  public Answer() {
  }

  public Answer(String answer) {
    this.answer = answer;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }
}
