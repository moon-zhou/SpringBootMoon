package com.moon.SpringBootMoon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moon.SpringBootMoon.domain.User;
import com.moon.SpringBootMoon.domain.UserRepository;

@RestController
public class HelloWorldController {
    
    @Autowired
    private UserRepository userRepository;
    
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
    
    @RequestMapping("/getUserCache")
    @Cacheable(value="user-key")
    public User getUserCache() {
        User user = userRepository.findByUserName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return user;
    }
}