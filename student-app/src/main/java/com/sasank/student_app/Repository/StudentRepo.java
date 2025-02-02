package com.sasank.student_app.Repository;

import com.sasank.student_app.Model.Student;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo  extends JpaRepository<Student,Integer> {

}
