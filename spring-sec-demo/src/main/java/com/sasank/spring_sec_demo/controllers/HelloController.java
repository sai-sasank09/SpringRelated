package com.sasank.spring_sec_demo.controllers;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greet(HttpServletRequest request){
        return  "hello world " + request.getSession().getId();
    }

}
