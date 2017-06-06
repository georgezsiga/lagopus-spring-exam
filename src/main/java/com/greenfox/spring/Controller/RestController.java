package com.greenfox.spring.Controller;

import com.greenfox.spring.Logic;
import com.greenfox.spring.Model.Answers;
import com.greenfox.spring.Model.ProjectList;
import com.greenfox.spring.Model.Questions;
import com.greenfox.spring.Repository.AnswerRepository;
import com.greenfox.spring.Repository.QuestionRepository;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import sun.net.www.protocol.http.HttpURLConnection;

/**
 * Created by georgezsiga on 6/6/17.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  private QuestionRepository questionRepository;

  @Autowired
  private AnswerRepository answerRepository;

  Logic logic = new Logic();

  String url = "https://springexamserver.herokuapp.com/projects/eagles";
  Questions sentQuestions;

  @GetMapping("/questions")
  public Questions questions() {
    sentQuestions = new Questions(questionRepository.findTop5By());
    return sentQuestions;
  }

  @PostMapping("/answers")
  public ProjectList answers(@RequestBody Answers answers) {
    if (logic.checkAnswers(sentQuestions, answers.getAnswers())) {

      return new ProjectList();
    }
    return new ProjectList();
  }

  private void sendGet() throws Exception {

    String url = "https://springexamserver.herokuapp.com/projects/eagles";

    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("GET");

    //add request header
    con.setRequestProperty("Content-type", "application/json");

    int responseCode = con.getResponseCode();
    System.out.println("\nSending 'GET' request to URL : " + url);
    System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();

    //print result
    System.out.println(response.toString());

  }

}
