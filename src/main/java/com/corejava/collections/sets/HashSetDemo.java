package com.corejava.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {


        Set<String> names = new HashSet<>();
        names.add("Java");
        names.add("C#");
        names.add("JavaEE");
        names.add("C++");
        names.add("Python");
        names.add("C#");
        names.add(null);


        System.out.println(names);
    }
}
