package com.example.dependencyinversion.two;

public class DataAccessFactory {
    public static EmployeeDataAccess getEmployeeDataAccessObject(){
        return new EmployeeDataAccess();
    }
}
