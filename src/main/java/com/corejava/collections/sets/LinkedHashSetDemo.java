package com.corejava.collections.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C#");
        linkedHashSet.add("Java");
        System.out.println(linkedHashSet);
    }
}
