package com.corejava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class CountWordsFrequencey {

    public static void main(String[] args) {

        String str = "Kafka Spring Java Kafka Node Spring";

        String[] words = str.split(" ");

        Map<String,Integer> map = new HashMap<String,Integer>();

        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }

        System.out.println(map);
    }
}
