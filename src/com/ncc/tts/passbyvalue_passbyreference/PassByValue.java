package com.ncc.tts.passbyvalue_passbyreference;

public class PassByValue {
    int number = 6;

    void demo(int data){
        number = data + 10;
    }

    public static void main(String[] args) {
        PassByValue ps = new PassByValue();
        System.out.println("Result: "+ps.number);
        ps.demo(50);
        System.out.println("Result: "+ps.number);
    }
}
