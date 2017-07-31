package com.moon.SpringBootMoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moon.SpringBootMoon.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
    
}