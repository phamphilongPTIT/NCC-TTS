package com.ncc.tts.final_static;

final class TypeFinalDemo {

    private final int age = 22;

    final int total(){
        int test = age + 2;
        return test;
    }

    public static void main(String[] args) {
        TypeFinalDemo tf = new TypeFinalDemo();
        System.out.println(tf.total());
    }
}
