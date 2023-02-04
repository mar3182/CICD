package com.example.hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigMVC implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry reg) {
        //Add the view controllers
        reg.addViewController("/home").setViewName("home");
        reg.addViewController("/").setViewName("home");
        reg.addViewController("/hello-spring").setViewName("hello-spring");
    }
}
