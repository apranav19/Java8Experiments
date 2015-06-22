package com.apranav19.methodreferences;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by pranav on 6/21/15.
 */
public class MethodReferenceDriver {
    public static void main(String [] args){
        // Create the Football Factory
        // The interface makes use of the reference to the FootballPlayer's constructor.
        FootballFactory<FootballPlayer> laMasia = FootballPlayer::new;

        // Let's produce some world class players from La Masia
        List<FootballPlayer> players = new ArrayList<FootballPlayer>();
        players.add(laMasia.create("Victor", "Valdes", "Goal Keeper", 1));
        players.add(laMasia.create("Carles", "Puyol", "Defender", 5));
        players.add(laMasia.create("Xavi", "Hernandez", "Midfielder", 6));
        players.add(laMasia.create("Andres", "Iniesta", "Midfielder", 8));
        players.add(laMasia.create("Lionel", "Messi", "Right Forward", 10));

        // Print the players
        System.out.println("Presenting the La Masia academy: " );
        for(FootballPlayer player: players){
            System.out.println(player.toString());
            System.out.println();
        }
    }
}
