package com.sasank.spring_sec_demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.sasank.spring_sec_demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    List<Student> students=new ArrayList<>(List.of(
            new Student(1,"Navin","Java"),
            new Student(2,"Kiran","Blockchain")
    ));

    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }


    @PostMapping("students")
    public void addStudent(@RequestBody Student student) {
        students.add(student);

    }
}
