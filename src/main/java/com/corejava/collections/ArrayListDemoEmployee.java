package com.corejava.collections;

import java.util.*;
import java.util.stream.Collectors;

class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ArrayListDemoEmployee{
    public static void main(String[] args) {

        List<Employee> employees= new ArrayList<>();

        employees.add(new Employee(101,"Rahul"));
        employees.add(new Employee(102,"Venky"));
        employees.add(new Employee(102,"Venky"));
        employees.add(new Employee(104,"Ankit"));

        employees.forEach(System.out::println);

    }
}