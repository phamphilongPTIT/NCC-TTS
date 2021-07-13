package com.ncc.tts.overloading_overriding;

public class Person extends OverridingDemo {

    void run(){
        System.out.println("Check Check");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.run();
    }
}
