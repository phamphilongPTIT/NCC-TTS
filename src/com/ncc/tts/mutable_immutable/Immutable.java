package com.ncc.tts.mutable_immutable;

public class Immutable {

    private String fullName;
    private int age;

    public Immutable(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
