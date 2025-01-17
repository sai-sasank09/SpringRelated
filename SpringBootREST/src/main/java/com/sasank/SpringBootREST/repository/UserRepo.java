package com.sasank.SpringBootREST.repository;

import com.sasank.SpringBootREST.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
