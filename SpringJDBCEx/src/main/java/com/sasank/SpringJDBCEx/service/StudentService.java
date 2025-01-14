package com.sasank.SpringJDBCEx.service;

import com.sasank.SpringJDBCEx.Repository.StudentRepo;
import com.sasank.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    private StudentRepo repo;
    public void addStudent(Student s) {
       repo.save(s);
    }

    public List<Student> getStudents() {
       return repo.findAll();
    }
}
