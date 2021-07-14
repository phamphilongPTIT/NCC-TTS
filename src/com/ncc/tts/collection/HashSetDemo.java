package com.ncc.tts.collection;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("Hello");
        hashSet.add("NCC");

        System.out.println("Cac phan tu cua set: "+hashSet);
        System.out.println(hashSet.contains("Hello"));
    }
}
