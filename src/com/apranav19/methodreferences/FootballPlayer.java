package com.apranav19.methodreferences;

/**
 * Created by pranav on 6/21/15.
 */
public class FootballPlayer {
    String firstName;
    String lastName;
    Integer kitNumber;
    String position;

    public FootballPlayer(){}

    public FootballPlayer(String firstName, String lastName, String position, Integer kitNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.kitNumber = kitNumber;
    }

    public String toString(){
        return "Name: " + firstName + " " + lastName
                + "\nPosition: " + position
                + "\nKit Number: " + kitNumber;
    }
}
