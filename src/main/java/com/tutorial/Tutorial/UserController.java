package com.tutorial.Tutorial;

import org.springframework.web.bind.annotation.*;

/**
 * Owner - Arora Consulting Private Limited
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial
 * Created_on - November 09 - 2024
 * Created_at - 19:51
 */

@RestController
public class UserController {

    // POST, GET, PUT, PATCH, DELETE

    @GetMapping
    public UserData getUser() {
        System.out.println("Inside Get User Method");
        UserData userData = new UserData("Rohit Parihar", 25, 1);
        return userData;
    }

    // Automatically converts Java Object to Json Object but not vice versa
    // In Spring Boot, the @RequestBody annotation is used to bind incoming HTTP request body
    // to specific object in the controller method
    // It uses a suitable HttpMessageConverter to convert the raw request body into a Java object.
    @PostMapping
    public UserData addUser(@RequestBody UserData userData) {
        System.out.println("Inside Add User Method");
        return userData;
    }

    @PostMapping("/add")
    public int addUser2(@RequestBody UserData userData) {
        System.out.println("Inside Add User 2 Method");
        return userData.getAge();
    }
}
