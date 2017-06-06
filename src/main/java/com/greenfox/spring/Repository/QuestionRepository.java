package com.greenfox.spring.Repository;

import com.greenfox.spring.Model.Question;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by georgezsiga on 6/6/17.
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {

//  @Query ("SELECT question FROM Question ORDER BY RAND() LIMIT 5")
//  Iterable<Question> findTop5By();

  Iterable<Question> findTop5By();

  Iterable<Question> findAllBy();
}
