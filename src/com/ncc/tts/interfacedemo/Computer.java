package com.ncc.tts.interfacedemo;

public class Computer implements InterfaceDemo, InterfaceDemo2 {
    @Override
    public void run() {
        System.out.println("hello ncc");
    }

    @Override
    public void run1() {
        System.out.println("gud morning");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
        computer.run1();
    }

}
