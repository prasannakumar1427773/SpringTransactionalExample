package com.spring.example;

import com.spring.example.config.AppConfig;
import com.spring.example.entity.User;
import com.spring.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the UserService bean
        UserService userService = context.getBean(UserService.class);

        // Create a new user
        User newUser = new User();
        newUser.setName("John Doe");
        newUser.setEmail("john.doe@example.com");
        userService.createUser(newUser);

        // Update the user
        userService.updateUser(newUser.getId(), "John Smith", "john.smith@example.com");
    }
}