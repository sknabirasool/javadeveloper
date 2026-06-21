package com.corejava.collections.comparablevscompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    private String name;
    private  int id;
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class ComparableTest {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Jack", 101));
        employees.add(new Employee("Jill", 103));
        employees.add(new Employee("Jane", 102));

        Collections.sort(employees);
        System.out.println(employees);
    }
}
