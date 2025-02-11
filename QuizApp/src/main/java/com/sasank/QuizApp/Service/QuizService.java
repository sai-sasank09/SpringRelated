package com.sasank.QuizApp.Service;

import com.sasank.QuizApp.Model.QuestionWrapper;
import com.sasank.QuizApp.Model.Questions;
import com.sasank.QuizApp.Model.Quiz;
import com.sasank.QuizApp.Model.Response;
import com.sasank.QuizApp.Repository.QuestionsRepo;
import com.sasank.QuizApp.Repository.QuizDao;
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
    QuestionsRepo questionsRepo;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Questions> questions=questionsRepo.findRandomQuestionsByCategory(category,numQ);
        Quiz quiz= new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Quiz created", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        Optional<Quiz> quiz=quizDao.findById(id);
        List<Questions> questionsByDb=quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser=new ArrayList<>();
        for(Questions q:questionsByDb){
            questionsForUser.add(new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4()));
        }
        return new ResponseEntity<>(questionsForUser,HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
        List<Questions> questions = quiz.getQuestions();
        int right = 0;
        int i = 0;
        for(Response response : responses){
            if(response.getResponse().equals(questions.get(i).getRightAnswer()))
                right++;

            i++;
        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
