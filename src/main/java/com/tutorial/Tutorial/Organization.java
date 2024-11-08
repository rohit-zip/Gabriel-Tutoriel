package com.tutorial.Tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Owner - Arora Consulting Private Limited
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial
 * Created_on - November 08 - 2024
 * Created_at - 20:24
 */

@Component
public class Organization {

    // Approach 1
    @Autowired
    private Employee employee;

    // tight coupling
//    public void userDetails(String name, int age) {
//        Employee employee = new Employee();
//        employee.setAge(age);
//        employee.setName(name);
//    }

    public void userDetails(String name, int age) {
        employee.setName(name);
    }

    public void userDetails2(String name, int age) {
        employee.setName(name);
    }
}
