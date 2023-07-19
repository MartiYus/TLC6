package com.example.SpringDataLibrary.sec;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("firstView");
        registry.addViewController("/").setViewName("firstView");
        registry.addViewController("/hello").setViewName("categories");
        registry.addViewController("/login").setViewName("login");
    }

}
