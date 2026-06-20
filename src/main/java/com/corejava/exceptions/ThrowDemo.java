package com.corejava.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowDemo {


    public void readFile() throws IOException {


    }
    public static void main(String[] args) {

        throw  new RuntimeException("Error");
    }
}
