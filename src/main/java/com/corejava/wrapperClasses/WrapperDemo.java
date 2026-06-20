package com.corejava.wrapperClasses;

import java.util.ArrayList;

public class WrapperDemo {

    /**
     * A wrapper class is a wrapper it is convert  to primitive data types to Objects
     * char CHARACTER
     * int Integer
     * float FLOAT
     * double DOUBLE
     * @param args
     */
    public static void main(String[] args) {

        //primitive
        int age = 25;

        //wrapper
        Integer num= Integer.valueOf(100);
        System.out.println(num);

        /**
         * Why Wrapper clasess
         * Collections only works with Objects
         */

        //ArrayList<int> list = new ArrayList<>();//thorw compile time error

        ArrayList<Integer> list = new ArrayList<>();

//        Creating Wrapper Objects

        Integer num2=Integer.valueOf(100);

        //unboxing
        int num3=num2;
    }
}
