package com.corejava.collections.maps;

import java.util.*;

public class Finduplicates {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,4,6,3,4,2,5,6,7,8,3,2,5,4,6);

        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i:list){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        map.forEach((k,v)->{ if(v>1){
        System.out.println(k+" "+v);}
        });

    }
}
