package com.corejava;

/**
 *  java compilation process
 *  create a Demo.java file
 *  compile Demo.java using javac compiler -> javac Demo.java
 *   compiler convert source code to byte code -> Demo.class file generate
 *   run Demo.java JVM loads byte and executes the byte code
 *
 *   Demo.java
 *     ↓
 *  javac
 *     ↓
 * Demo.class
 *     ↓
 * Class Loader
 *     ↓
 * Bytecode Verifier
 *     ↓
 * Execution Engine
 *     ↓
 * Machine Code
 */
public class Demo {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

    }
}
