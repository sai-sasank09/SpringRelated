package com.example.QuestionService.Controller;

import com.example.QuestionService.Model.QuestionWrapper;
import com.example.QuestionService.Model.Questions;
import com.example.QuestionService.Model.Response;
import com.example.QuestionService.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getQuestions() {
          return questionService.getQuestions();

    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Questions>> getQuestionsByCategory( @PathVariable String category) {
        return questionService.getQuestionsByCategory(category);

    }

    @PostMapping("addQuestion")
    public ResponseEntity<String> addQuestion(Questions question) {
        return questionService.addQuestion(question);
    }

    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName, @RequestParam int numQuestions) {
        return questionService.getQuestionsForQuiz(categoryName, numQuestions);
    }

    @PostMapping("getQuestion")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsByIds(@RequestBody List<Integer> questionIds) {
        return questionService.getQuestionsByIds(questionIds);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
        return questionService.getScore(responses);
    }


    //generate
    //getQuestion(questionId)
    //calculateResult


}
