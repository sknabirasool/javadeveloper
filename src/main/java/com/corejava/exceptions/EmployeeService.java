package com.corejava.exceptions;

import com.corejava.opps.Employee;

public class EmployeeService {

    public  void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args)  {
        EmployeeService employeeService = new EmployeeService();
        try {
            employeeService.validateAge(1);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
