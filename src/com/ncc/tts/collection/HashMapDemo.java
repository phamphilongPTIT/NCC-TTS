package com.ncc.tts.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Hello");
        hashMap.put(2,"alo");
        hashMap.put(3,"Hello");
        hashMap.put(4,"Hello");

        System.out.println(hashMap);

        for (Integer key : hashMap.keySet()) {
            System.out.println(key +"-"+hashMap.get(key));
        }

        for (Map.Entry<Integer, String> map : hashMap.entrySet()){
            System.out.println(map.getKey() +"-"+ map.getValue());
        }

    }
}
