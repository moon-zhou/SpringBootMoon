package com.moon.SpringBootMoon.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moon.SpringBootMoon.util.MoonPropertiesUpdate;

@Controller
public class ThymeleafController {

    @Autowired
    private MoonPropertiesUpdate moonProperties;
//    private MoonProperties moonProperties;
    
    // http://localhost:8080/hi
    @RequestMapping("/hi")
    public String hello(Locale locale, Model model) {
        model.addAttribute("greeting", "Hello!");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("currentTime", formattedDate);
        
        model.addAttribute("title", moonProperties.getTitle());
        model.addAttribute("description", moonProperties.getDescription());
        model.addAttribute("age", moonProperties.getAge());
        model.addAttribute("content", moonProperties.getContent());
        
        return "hello";
    }

}