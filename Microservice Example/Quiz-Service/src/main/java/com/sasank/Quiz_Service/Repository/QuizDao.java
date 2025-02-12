package com.sasank.Quiz_Service.Repository;

import com.sasank.Quiz_Service.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
