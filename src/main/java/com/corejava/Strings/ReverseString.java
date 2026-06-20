package com.corejava.Strings;

public class ReverseString {
    public static void main(String[] args) {

        String str="JAVA";
        String rev="";
        /*
            Given String is JAVA
            find length of String

         */
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

    }
}
