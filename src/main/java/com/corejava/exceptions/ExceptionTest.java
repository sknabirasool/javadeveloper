package com.corejava.exceptions;

public class ExceptionTest {

    public void recoverse(){
        recoverse();
    }
    public static void main(String[] args) {

        ExceptionTest test = new ExceptionTest();
        test.recoverse();
    }
}
