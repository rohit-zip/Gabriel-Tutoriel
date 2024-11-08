package com.tutorial.Tutorial;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Owner - Arora Consulting Private Limited
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial
 * Created_on - November 08 - 2024
 * Created_at - 20:23
 */

@Service
public class Employee {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
