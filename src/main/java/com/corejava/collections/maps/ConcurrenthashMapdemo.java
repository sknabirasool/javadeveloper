package com.corejava.collections.maps;

import java.security.KeyStore;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenthashMapdemo {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1,"Java");
        map.put(2,"Spring");

        for(Map.Entry<Integer, String> entry:map.entrySet()){
            System.out.println(entry.getValue());
            map.put(3,"Nabi");
        }


    }
}
