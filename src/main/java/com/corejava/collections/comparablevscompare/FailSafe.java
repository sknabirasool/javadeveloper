package com.corejava.collections.comparablevscompare;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

    public static void main(String[] args) {

                CopyOnWriteArrayList<String> list =
                        new CopyOnWriteArrayList<>();

                list.add("Java");
                list.add("Spring");
                list.add("Kafka");

                for(String value : list) {

                    if(value.equals("Spring")) {

                        list.remove(value);
                    }
                }

                System.out.println(list);
            }
        }

