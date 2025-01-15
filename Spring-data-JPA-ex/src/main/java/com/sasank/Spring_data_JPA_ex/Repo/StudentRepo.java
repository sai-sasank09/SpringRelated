package com.sasank.Spring_data_JPA_ex.Repo;
import com.sasank.Spring_data_JPA_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query("select s from Student s where s.name=?1")
    List<Student> findAllByName(String name);



}
