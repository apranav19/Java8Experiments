package com.apranav19.builtinfunctionalinterfaces;
import com.apranav19.methodreferences.FootballPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * This class demonstrates how the Supplier Functional Interface works
 * Created by pranav on 6/22/15.
 */
public class Suppliers {
    public static void main(String [] args){
        // Let's create a supplier that simply generates an instance of a Football Player
        Supplier<FootballPlayer> playerSupplier = FootballPlayer::new;

        // We can simply invoke the get() to get an instance of a Football Player
        FootballPlayer player = playerSupplier.get();

        // Let's take another example
        // This supplier simply spits out empty Lists
        Supplier<List>listSupplier = ArrayList<Integer>::new;
        // We can then get some lists
        List<Integer> someList = listSupplier.get();
    }
}
