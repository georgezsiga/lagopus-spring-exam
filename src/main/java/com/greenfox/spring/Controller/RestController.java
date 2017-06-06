package com.greenfox.spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by georgezsiga on 6/6/17.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/questions")
  public Questions questions() {
    return questions;
  }

}
