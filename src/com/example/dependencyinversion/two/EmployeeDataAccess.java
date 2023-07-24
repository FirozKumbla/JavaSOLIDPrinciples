package com.example.dependencyinversion.two;

public class EmployeeDataAccess {
    public Employee getEmployeeDetails(int id){
        Employee emp = new Employee(121, "Amit", "Tech", 2000);
        return emp;
    }
}
