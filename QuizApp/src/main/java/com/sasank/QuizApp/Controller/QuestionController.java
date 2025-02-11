package com.sasank.QuizApp.Controller;

import com.sasank.QuizApp.Model.Questions;
import com.sasank.QuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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


}
