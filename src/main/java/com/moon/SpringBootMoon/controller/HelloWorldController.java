package com.moon.SpringBootMoon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moon.SpringBootMoon.domain.User;

@RestController
public class HelloWorldController {
    
    // http://localhost:8080/hello
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    
    // http://localhost:8080/getUser
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }
}