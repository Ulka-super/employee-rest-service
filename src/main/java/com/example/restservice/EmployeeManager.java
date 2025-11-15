package com.example.restservice;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class EmployeeManager {
    private static Employees employees = new Employees();

    static {
        employees.getEmployees().addAll(Arrays.asList(
            new Employee("1", "John", "Doe", "john.doe@example.com", "Manager"),
            new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Developer"),
            new Employee("3", "Bob", "Brown", "bob.brown@example.com", "Designer")
        ));
    }

    // getter
    public static Employees getAllEmployees() {
        return employees;
    }

    // add employee
    public static void addEmployee(Employee employee) {
        employees.getEmployees().add(employee);
    }
}
