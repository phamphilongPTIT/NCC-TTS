package com.ncc.tts.stringbuffer_stringbuilder;

public class StringBufferDemo {

    static void demoStringBuffer(){
        StringBuffer sb = new StringBuffer("hello ");
        sb.append("NCC PLUS");
        System.out.println("APPEND: "+sb);
        sb.insert(1,"alo");
        System.out.println("INSERT: "+sb);
        sb.replace(0,3,"Tre");
        System.out.println("REPLACE: "+sb);
        sb.delete(0,3);
        System.out.println("DELETE: "+sb);
        sb.reverse();
        System.out.println("REVERSE: "+sb);

    }

    public static void main(String[] args) {
        StringBufferDemo.demoStringBuffer();
    }
}
