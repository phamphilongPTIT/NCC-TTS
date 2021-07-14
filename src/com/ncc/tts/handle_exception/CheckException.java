package com.ncc.tts.handle_exception;

public class CheckException extends CustomizeException {

    CheckException(String s) {
        super(s);
    }

    static void validate(int age) throws CustomizeException{

        if (age < 20){
            throw new CustomizeException("Not Valid");
        }else System.out.println("Hello NCC PLUS");
    }

    public static void main(String[] args) {
        try {
            validate(18);
        }catch (Exception e){
            System.out.println("Exception occured: " + e);
        }
    }
}
