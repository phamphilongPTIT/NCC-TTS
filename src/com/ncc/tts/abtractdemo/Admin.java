package com.ncc.tts.abtractdemo;

public class Admin extends Customer {
    Customer customer =  new Customer();

    public String result(){
      return customer.talkAbout();
    }

    public static void main(String[] args) {
      Admin admin = new Admin();
      System.out.println("bababababa " +admin.result());
    }
}
