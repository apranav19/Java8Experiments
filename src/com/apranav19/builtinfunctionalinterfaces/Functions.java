package com.apranav19.builtinfunctionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * This class demonstrates the what you can do with the built in functional interface:
 * Function.
 * Created by pranav on 6/22/15.
 */
public class Functions {
    public static void main(String [] args){
        // Let's build a function that generates a list
        Function<Integer[], List> getList = Arrays::asList;
        List<Integer> result = getList.apply(new Integer[]{1,2,3,4});

        System.out.println("Printing result: " );
        System.out.println(result);


    }
}
