package com.example.restservice;
import java.util.Arrays;
import java.util.List;

public class EmployeeManager {
    public static Employees getAllEmployees() {
        List<Employee> list = Arrays.asList(
            new Employee("1", "John", "Doe", "john.doe@example.com", "Manager"),
            new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Developer"),
            new Employee("3", "Bob", "Brown", "bob.brown@example.com", "Designer")
        );
        return new Employees(list);
    }
}
