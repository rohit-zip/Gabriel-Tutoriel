package com.tutorial.Tutorial;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Owner - Arora Consulting Private Limited
 * Author - rohit
 * Project - Tutorial
 * Package - com.tutorial.Tutorial
 * Created_on - November 09 - 2024
 * Created_at - 20:44
 */

@Entity
public class Employee {

    @Id
    private int id;
    private String eName;
    private boolean isActive;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
