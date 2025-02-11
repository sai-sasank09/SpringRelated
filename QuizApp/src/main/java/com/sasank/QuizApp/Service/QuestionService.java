package com.sasank.QuizApp.Service;

import com.sasank.QuizApp.Model.Questions;
import com.sasank.QuizApp.Repository.QuestionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionsRepo repo;

    public ResponseEntity<List<Questions>> getQuestions() {
        try{
            return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<List<Questions>> getQuestionsByCategory(String category) {
        try{
            return new ResponseEntity<>( repo.findByCategory(category), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);

    }

    public ResponseEntity<String> addQuestion(Questions question) {
        try {
            repo.save(question);
            return new ResponseEntity<>("Question added successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Failed to add question!", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
