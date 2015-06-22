package com.apranav19.builtinfunctionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * This driver will make use of the Predicate functional interface in Java8
 * Created by pranav on 6/22/15.
 */
public class Predicates {
    public static void main(String [] args){
        // Define a basic Predicate that uses a string
        // It basically checks if a given string has a length greater than 0
        Predicate<String> predicate = (s) -> s.length() > 0;

        // Let's test it
        boolean result = predicate.test("Hello");
        System.out.println("Printing result1: " + result);

        // Let's negate the statement
        result = predicate.negate().test("Hello");
        System.out.println("Printing after negation: " + result);

        // Let's do something a bit more complex
        // Let's see if an 'and' statement can be formulated
        // Let's keep introduce a new predicate, that checks if a string is capitalized
        Predicate<String> predicate2 = (s) -> s.equals(s.toUpperCase());

        // Now we perform an AND operation between the 2 predicates
        Predicate<String> andPredicate = predicate.and(predicate2);
        boolean result2 = andPredicate.test("ARSENAL");

        System.out.println("Printing after performing an AND operation: " + result2);
    }
}
