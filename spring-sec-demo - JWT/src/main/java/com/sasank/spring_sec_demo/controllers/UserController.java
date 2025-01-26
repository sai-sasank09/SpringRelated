package com.sasank.spring_sec_demo.controllers;

import com.sasank.spring_sec_demo.model.User;
import com.sasank.spring_sec_demo.service.JwtService;
import com.sasank.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
   private JwtService JwtService;
    @PostMapping("register")
    public User register(@RequestBody User user){
        service.saveUser(user);
        return user;
    }

    @PostMapping("login")
    public String login(@RequestBody User user){
        try {
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
            if (authentication.isAuthenticated()) {
                return JwtService.generateToken(user.getUsername());
            } else {
                return "Login failed"; // This code should not be reached.
            }
        } catch (AuthenticationException ex) {
            return "Login failed: " + ex.getMessage(); // You can log it or provide a custom message if needed
        }
    }


}

