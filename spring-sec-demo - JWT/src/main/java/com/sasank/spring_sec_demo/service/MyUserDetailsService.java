package com.sasank.spring_sec_demo.service;


import com.sasank.spring_sec_demo.model.User;
import com.sasank.spring_sec_demo.dao.UserRepo;
import com.sasank.spring_sec_demo.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =repo.findByUsername(username);
        if(user == null) {
            System.out.println("404 user not found");
            throw new UsernameNotFoundException("nahi mila");
        }
        return new UserPrincipal(user);
    }
}
