package com.ncc.tts.overloading_overriding;

public class OverloadingDemo {

    //Thay doi so luong tham so truyen vao
    static int total(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    static int total(int numberOne, int numberTwo, int numberThree){
        return numberOne + numberTwo + numberThree;
    }
    //Thay doi kieu du lieu cua cac tham so
    static int count(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    static double count(double numberOne, int numberTwo, int numberThree){
        return numberOne + numberTwo + numberThree;
    }

    public static void main(String[] args) {
        System.out.println("TOTAL: "+count(2,3));
        System.out.println("TOTAL: "+count(2,3, 4));
    }

}
