package com.corejava.exceptions;

public class FinallyDemo {

    public static void main(String[] args) {

        try {
            int a=10;
            int b=0;
            int c=a/b;

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        finally {
            System.out.println("finally");
        }
    }

}
