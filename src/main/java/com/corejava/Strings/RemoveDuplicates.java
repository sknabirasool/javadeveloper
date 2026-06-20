package com.corejava.Strings;


/**
str.toCharArray(): Converts "Programming" into an array of individual characters: ['P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'].
result.indexOf(c) == -1: This is the core filtering condition. The indexOf() function searches for character c inside the result string.
If it returns -1, it means the character is not yet in the result.result = result + c: If the character is unique/new, it gets appended to the end of the result.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        String str="Programming";
        String result="";
        for(char c:str.toCharArray()){

            if(result.indexOf(c)==-1){
                result=result+c;
            }

        }
        System.out.println(result);
    }
}
