package com.corejava.collections.comparablevscompare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Spring");
        list.add("Kafka");
        list.add("Java");

        Iterator<String> itr=list.iterator();

        //remove element using iterrator

        while(itr.hasNext()){

            String str=itr.next();

            if(str.equals("Spring")){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
