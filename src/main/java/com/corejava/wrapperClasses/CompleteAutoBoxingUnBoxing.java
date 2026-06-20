package com.corejava.wrapperClasses;

public class CompleteAutoBoxingUnBoxing {


        public static void main(String[] args) {

            int age = 25;

            Integer ageObj = age;   // Autoboxing

            int newAge = ageObj;    // Unboxing

            System.out.println(ageObj);
            System.out.println(newAge);
        }
}
