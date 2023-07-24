package com.example.dependencyinversion.two;

//Dependency inversion - High level modules should not directly depend on low level modules,
//instead they should depend on abstractions.
//also abstractions should not depend upon details, Details should depend upon abstractions.
public class EmployeeBusinessLogic {
    EmployeeDataAccess employeeDataAccess;

    public EmployeeBusinessLogic() {
        employeeDataAccess=DataAccessFactory.getEmployeeDataAccessObject();
    }

    public Employee getEmployeeDetails(int id){
        return employeeDataAccess.getEmployeeDetails(id);
    }
}
