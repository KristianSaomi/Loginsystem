package com.group8.userlogin;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers( ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/aboutUs").setViewName("aboutUs");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/error").setViewName("error");
        registry.addViewController("/thankyou").setViewName("thankyou");
        registry.addViewController("/edit").setViewName("edit");
        registry.addViewController("/updateCustomer").setViewName("updateCustomer");
        registry.addViewController("/changeLog").setViewName("changeLog");

    }







}
