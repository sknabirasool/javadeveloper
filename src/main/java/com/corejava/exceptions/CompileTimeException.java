package com.corejava.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CompileTimeException {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileReader fr = new FileReader("abc.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }

    }
}
