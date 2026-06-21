package com.corejava.collections.comparablevscompare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {
    public static void main(String[] args) {

        List<String> list =
                new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Kafka");

        Iterator<String> itr =
                list.iterator();

        while (itr.hasNext()) {

            String value =
                    itr.next();

            if (value.equals("Spring")) {

                list.remove(value);
            }
        }
        System.out.println(list);
    }
}
