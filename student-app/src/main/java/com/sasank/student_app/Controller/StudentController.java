package com.sasank.student_app.Controller;

import com.sasank.student_app.Model.Student;
import com.sasank.student_app.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    List<Student> getStudents(){

      return repo.findAll();
    }

    @RequestMapping("addStudent")
    public void addStudent(){
        Student s= new Student();
        s.setAge(25);
        s.setName("Rahul");
        repo.save(s);
    }
}
