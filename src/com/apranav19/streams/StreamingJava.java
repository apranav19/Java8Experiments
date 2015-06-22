package com.apranav19.streams;

import com.apranav19.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * This class demonstrates how Streams work
 * Created by pranav on 6/22/15.
 */
public class StreamingJava {
    public static void main(String [] args){
        // Streams are created on a source like a Collection
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack", "Wilshere", 23, 2.90));
        students.add(new Student("Mesut", "Ozil", 25, 3.75));
        students.add(new Student("Alexis", "Sanchez", 26, 3.88));
        students.add(new Student("Kieran", "Gibbs", 23, 3.18));

        // We can then generate a stream, using the stream()
        // Let's compute the average GPA of the students
        Optional<Double> result = students
                            .stream()
                            .map((s) -> s.GPA)
                            .reduce((s1, s2) -> s1 + s2);

        double averageGPA = result.get()/students.size();

        System.out.println("The AVERAGE GPA IS: " + averageGPA);

        //We can also make use of the filter() on streams
        //This helps us exclude certain elements based on a predicate
        //In this case, let's say that we would like to exclude
        //Students with a GPA below 3.5
        List<Student> honorStudents = students
                                    .stream()
                                    .filter((s) -> s.GPA > 3.50)
                                    .collect(Collectors.toList());

        System.out.println("The HONOR students are: \n");
        //Let's maintain the functional programming style and use forEach()
        honorStudents.forEach(System.out::println);
    }

}
