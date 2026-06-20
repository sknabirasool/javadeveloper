package com.corejava.Strings;

public class CountVoewls {

    public static void main(String[] args) {

        String str="Hello";
        int count=0;
//        char[] arr=str.toCharArray();
//
//
//
//         for(int i=0;i<arr.length;i++){
//             if("aeiou".indexOf(arr[i])!=-1){
//                 count++;
//             }
//         }
//        System.out.println(count);


         for(char c:str.toCharArray()){
             if("aeiou".indexOf(c)!=-1){
                 count++;
             }
         }
        System.out.println(count);

    }
}
