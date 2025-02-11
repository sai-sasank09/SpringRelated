package com.sasank.QuizApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sasank.QuizApp.Model.Questions;

import java.util.List;

@Repository
public interface QuestionsRepo extends JpaRepository<Questions,Integer> {


    List<Questions> findByCategory(String category);

    @Query(value = "SELECT * FROM questions q WHERE q.category =:category ORDER BY RANDOM() LIMIT:numQ", nativeQuery = true)
    List<Questions> findRandomQuestionsByCategory(String category, int numQ);




}


