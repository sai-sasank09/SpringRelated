package com.sasank.Quiz_Service.Feigh;


import com.sasank.Quiz_Service.Model.QuestionWrapper;
import com.sasank.Quiz_Service.Model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "question-service")
public interface QuizInterface {

    @GetMapping("questions/generate")
    ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam("categoryName") String category,
                                                      @RequestParam("numQuestions") int numQuestions);

    @PostMapping("questions/getQuestion")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsByIds(@RequestBody List<Integer> questionIds);

    @PostMapping("questions/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
}
