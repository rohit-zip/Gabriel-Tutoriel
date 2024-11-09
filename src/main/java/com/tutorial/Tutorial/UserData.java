package com.tutorial.Tutorial;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Owner - Arora Consulting Private Limited
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial
 * Created_on - November 09 - 2024
 * Created_at - 20:08
 */

@Entity
public class UserData {

    @Id
    private int id;
    private String name;
    private int age;


    UserData() {}

    UserData(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
