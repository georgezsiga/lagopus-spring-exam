package com.greenfox.spring;

import com.greenfox.spring.Model.Answer;
import com.greenfox.spring.Model.Question;
import com.greenfox.spring.Repository.AnswerRepository;
import com.greenfox.spring.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringexamApplication implements CommandLineRunner{

	@Autowired
	QuestionRepository questionRepository;

	@Autowired
  AnswerRepository answerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringexamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
