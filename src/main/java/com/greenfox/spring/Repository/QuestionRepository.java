package com.greenfox.spring.Repository;

import com.greenfox.spring.Model.Question;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by georgezsiga on 6/6/17.
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
