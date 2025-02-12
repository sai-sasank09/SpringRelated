package com.sasank.Quiz_Service.Service;

import com.sasank.Quiz_Service.Feigh.QuizInterface;
import com.sasank.Quiz_Service.Model.QuestionWrapper;
import com.sasank.Quiz_Service.Model.Quiz;
import com.sasank.Quiz_Service.Model.Response;
import com.sasank.Quiz_Service.Repository.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;


    @Autowired
    QuizInterface  quizInterface;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Integer> questionsIds=quizInterface.getQuestionsForQuiz(category,numQ).getBody();
        Quiz quiz= new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionsIds(questionsIds);
        quizDao.save(quiz);
        return new ResponseEntity<>("Quiz created", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        Quiz quiz=quizDao.findById(id).get();
        List<Integer> questionIds= quiz.getQuestionsIds();
        ResponseEntity<List<QuestionWrapper>> questions=quizInterface.getQuestionsByIds(questionIds);

        return questions;
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
         ResponseEntity<Integer> score=quizInterface.getScore(responses);
        return score;
    }
}
