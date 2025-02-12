package com.example.QuestionService.Repository;

import com.example.QuestionService.Model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsRepo extends JpaRepository<Questions,Integer> {


    List<Questions> findByCategory(String category);

    @Query(value = "SELECT q.id FROM questions q WHERE q.category =:category ORDER BY RANDOM() LIMIT:numQ", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);




}


