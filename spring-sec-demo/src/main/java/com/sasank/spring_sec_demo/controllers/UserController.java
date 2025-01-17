package com.sasank.spring_sec_demo.controllers;

import com.sasank.spring_sec_demo.model.User;
import com.sasank.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;



    @PostMapping("register")
    public User register(@RequestBody User user){
        service.saveUser(user);
        return user;
    }

}

