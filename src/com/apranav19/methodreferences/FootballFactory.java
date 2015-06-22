package com.apranav19.methodreferences;

/**
 * Created by pranav on 6/21/15.
 */
public interface FootballFactory<FP> {
    FP create(String firstName, String lastName, String position, Integer kitNumber);
}
