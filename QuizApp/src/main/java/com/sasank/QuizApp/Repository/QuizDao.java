package com.sasank.QuizApp.Repository;

import com.sasank.QuizApp.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
