package com.corejava.Strings;

public class Palindram2 {

    public static void main(String[] args) {

       String str="madam";
       boolean palindram=true;
       int start=0;
       int end=str.length()-1;

       while(start<=end){
           if(str.charAt(start) !=str.charAt(end)){
               palindram=false;
               break;
           }
           start++;
           end--;
       }
        System.out.println(palindram);
    }

}
