package com.greenfox.spring.Repository;

import com.greenfox.spring.Model.Question;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by georgezsiga on 6/6/17.
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {

  @Query ("SELECT question FROM Question ORDER BY RAND() LIMIT 5")
  ArrayList<Question> findAllByQuestion();

  ArrayList<Question> findTop5ByQuestion();


}
