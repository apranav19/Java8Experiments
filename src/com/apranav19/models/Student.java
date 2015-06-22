package com.apranav19.models;

/**
 * Part of the models package.
 * This class models a typical Student object
 * Created by pranav on 6/22/15.
 */
public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public double GPA;

    public Student(String firstName, String lastName, int age, double GPA){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.GPA = GPA;
    }

    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + "\nAge: " + this.age + "\nGPA: " + this.GPA;
    }
}
