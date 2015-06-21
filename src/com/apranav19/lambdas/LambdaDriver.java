package com.apranav19.lambdas;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by pranav on 6/20/15.
 */
public class LambdaDriver {
    public static void main(String [] args){
        List<String> players = Arrays.asList("Wilshere", "Oxlade-Chamberlain", "Gibbs", "Chambers", "Welbeck", "Ramsey", "Walcott");

        //Apply lambda expression to sort players
        Collections.sort(players, (String player1, String player2) -> {
            return player1.compareTo(player2);
        });

        System.out.println("-----------------");
        System.out.println("Printing Players");
        for(String player: players){
            System.out.println(player);
        }
    }
}
