package com.moon.SpringBootMoon.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MoonProperties {
    
    @Value("${com.moon.title}")
    private String title;
    
    @Value("${com.moon.description}")
    private String description;
    
    @Value("${com.moon.age}")
    private Integer age;

    @Value("${com.moon.content}")
    private String content;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}