package com.corejava.opps;

public class Employee {
    private  int id;
    private String name;
    private int age;
    private int salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {

        if(id > 0){
            this.id = id;
        }else {
            throw new IllegalArgumentException("Employee ID must be greater than 0");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name != null && !name.isEmpty()){
            this.name = name;
        }else {
            throw new IllegalArgumentException("Employee name cannot be empty");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=18 && age <=60) {
            this.age = age;
        }else  {
            throw new IllegalArgumentException("Employee age  must be between 18 to 60 ");
        }

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {

        if(salary > 0 && salary <= 10000) {
            this.salary = salary;
        }else
            throw new IllegalArgumentException("Employee salary must be between 0 and 100");
    }

    public void display(){
        System.out.println("Employee information");
        System.out.println("EMP ID :"+id+ "EMP Name "+name+" age "+age+" salary "+salary);
    }

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setId(1);
        emp.setName("Nabi");
        emp.setAge(46);
        emp.setSalary(200);
        emp.display();

    }
}
