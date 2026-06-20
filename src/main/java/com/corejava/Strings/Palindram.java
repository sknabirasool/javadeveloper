package com.corejava.Strings;

public class Palindram {

    public static void main(String[] args) {

        String str="MADAM";
        String rev="";

        StringBuilder sb=new StringBuilder(str);

        rev=sb.reverse().toString();

        if(rev.equals(str))
        {
            System.out.println("Palindram");
        }else
        {
            System.out.println("Not Palindram");
        }

//        String rev=new StringBuilder(str).reverse().toString();
//        if(rev.equals(str))
//        {
//            System.out.println("Palindram");
//        }


    }

}
