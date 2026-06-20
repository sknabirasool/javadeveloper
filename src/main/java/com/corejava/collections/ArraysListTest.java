package com.corejava.collections;

import javafx.print.Collation;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysListTest {

    public static void main(String[] args) {
        List<String> names =
                new ArrayList<>();

        names.add("Java");
        names.add("Spring");
        names.add("Java");
        names.add("Kafka");


        Set<String> namesData = new LinkedHashSet<>(names);
        System.out.println(namesData);

        String course = "Kafka";

        /**
         * Search course
         */

        if(names.contains(course)){
            System.out.println("Course  exists");
        }else {
            System.out.println("Course Not exists");
        }

        /**
         * Sorting
         */
        Collections.sort(names);
        System.out.println(names);

        /**
         * Reverse and
         */
        Collections.reverse(names);
        System.out.println(names);

        /**
         *  Frequency count
         */

        int count =Collections.frequency(names,"Java");
        System.out.println(count);




    }
}
