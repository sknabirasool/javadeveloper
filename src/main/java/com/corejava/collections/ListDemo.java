package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    /**
     * List is a interface
     * List maintain insert order
     * Allow Duplicates values
     * Allow Null Vales
     * Index based Access
     */
    public static void main(String[] args) {

        /**
         * Array list is a dynamic list implementation of List
         * default capacity is 10
         * once full old=old/2
         * 10=10/2=>15
         */
        List<String> names=new ArrayList<String>();

        names.add("Daniel");
        names.add("Jack");
        names.add("Sthep");
        System.out.println(names);
        System.out.println(names.get(1));

    }
}
