package com.ncc.tts.collection;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("NCC");
        list.add("PLUS");
        list.add("Test");
        list.add("Hello");

        list.set(1, "Hello");

        list.remove(2);
        list.get(1);
        System.out.println(list);

        for (String list1: list) {
            System.out.println(list.indexOf(list1) +"-"+list1);
        }
    }

}
