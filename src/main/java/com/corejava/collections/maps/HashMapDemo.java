package com.corejava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"C#");
        map.put(3,"Java");
        map.put(null,"C#");
        map.put(5,null);

        System.out.println(map);

        for( Integer key : map.keySet() ){
            System.out.println(key+"-->"+map.get(key));
        }
    }
}
