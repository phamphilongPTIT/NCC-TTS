package com.ncc.tts.passbyvalue_passbyreference;

public class PassByReference {

    int number = 6;

    void demo(PassByReference pr) {
        pr.number = number + 10;
    }

    public static void main(String[] args) {
        PassByReference pr = new PassByReference();
        System.out.println("Result: " + pr.number);
        pr.demo(pr);
        System.out.println("Result: " + pr.number);
    }
}
