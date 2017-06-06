package com.greenfox.spring.Repository;

import com.greenfox.spring.Model.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by georgezsiga on 6/6/17.
 */
public interface AnswerRepository extends CrudRepository<Answer, Long> {

  Answer findFirstById(@Param("id") Long id);

}
