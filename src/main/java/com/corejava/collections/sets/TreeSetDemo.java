package com.corejava.collections.sets;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        try {
            treeSet.add("Java");
            treeSet.add("C#");

            treeSet.add("Java");
            treeSet.add("C#");
            treeSet.add(null);

        }catch (NullPointerException e){
            System.out.println(treeSet);
            System.out.println(e.getMessage());
        }

    }
}
