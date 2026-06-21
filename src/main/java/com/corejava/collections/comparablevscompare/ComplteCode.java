package com.corejava.collections.comparablevscompare;

import java.util.*;

class Employee1 {

    private int id;
    private String name;
    private double salary;

    public Employee1(int id,
                    String name,
                    double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return id +
                " " +
                name +
                " " +
                salary;
    }
}

public class ComplteCode {

    public static void main(String[] args) {

        List<Employee1> employees =
                new ArrayList<>();

        employees.add(
                new Employee1(
                        101,
                        "Rahul",
                        50000
                )
        );

        employees.add(
                new Employee1(
                        102,
                        "Ganesh",
                        30000
                )
        );

        employees.add(
                new Employee1(
                        103,
                        "John",
                        40000
                )
        );

        employees.sort(Comparator.comparing(Employee1::getSalary));
        employees.sort((Comparator.comparing(Employee1::getName)));

        employees.forEach(
                System.out::println
        );
    }
}