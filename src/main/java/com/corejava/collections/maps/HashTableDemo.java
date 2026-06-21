package com.corejava.collections.maps;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> table =
                new Hashtable<>();

        table.put(1,"Java");
        table.put(2,"Spring");

        System.out.println(table);
    }
}
