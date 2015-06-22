package com.apranav19.builtinfunctionalinterfaces;

import com.apranav19.methodreferences.FootballPlayer;

import java.util.function.Consumer;

/**
 * This class demonstrates what a Consumer does
 * Created by pranav on 6/22/15.
 */
public class Consumers {
    public static void main(String [] args){
        // Let's create a consumer that consumes a player and spits out the String format
        Consumer<FootballPlayer> playerConsumer = (player) -> System.out.println(player.toString());
        playerConsumer.accept(new FootballPlayer("Jack", "Wilshere", "CDM", 10));
    }
}
