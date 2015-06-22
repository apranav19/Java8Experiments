package com.apranav19.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * This class demonstrates how we can create Parallel Streams
 * Created by pranav on 6/22/15.
 */
public class ParallelStreamingJava {
    public static void main(String [] args){
        // Lets create a large data collection
        final int MAX_SIZE = 100000;
        List<String> values = new ArrayList<>(MAX_SIZE);
        for(int i = 0; i<MAX_SIZE; i++){
            values.add(UUID.randomUUID().toString());
        }

        long t0 = System.nanoTime();
        // Lets create a sequential stream and sort it
        values
                .stream()
                .sorted()
                .count();

        long t1 = System.nanoTime();

        System.out.println(String.format("It took %d ms to sort %d items sequentially", TimeUnit.NANOSECONDS.toMillis(t1 - t0), MAX_SIZE));

        t0 = System.nanoTime();
        // Now lets parallelize things
        values
                .parallelStream()
                .sorted()
                .count();

        t1 = System.nanoTime();

        System.out.println(String.format("It took %d ms to sort %d items in a parallel manner", TimeUnit.NANOSECONDS.toMillis(t1 - t0), MAX_SIZE));

    }
}
