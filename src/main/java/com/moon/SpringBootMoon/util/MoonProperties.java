package com.moon.SpringBootMoon.util;

import org.springframework.beans.factory.annotation.Value;

public class MoonProperties {
    
    @Value("${com.moon.title}")
    private String title;
    
    @Value("${com.moon.description}")
    private String description;

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

}