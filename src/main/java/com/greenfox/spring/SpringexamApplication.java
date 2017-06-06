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
	  answerRepository.save(new Answer("2017.03.13"));
	  answerRepository.save(new Answer("Whippet"));
	  answerRepository.save(new Answer("Green"));
	  answerRepository.save(new Answer("4"));
	  answerRepository.save(new Answer("16"));
	  answerRepository.save(new Answer("Vulpes"));
	  answerRepository.save(new Answer("~3300"));
	  answerRepository.save(new Answer("Libra"));
	}
}
