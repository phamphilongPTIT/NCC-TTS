package com.ncc.tts.handle_exception;

public class ThrowDemo {

   public static void check(int number){
       try {

           if (number < 10) {
                throw new ArithmeticException("Not Valid");
           }
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
   }

    public static void main(String[] args) {
        check(9);
    }
}
