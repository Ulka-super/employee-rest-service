package com.example.restservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeControllerTests {

    private EmployeeManager manager;

    @BeforeEach
    public void setup() {
        manager = new EmployeeManager(); // fresh manager for each test
    }

    @Test
    public void testGetEmployees_initialListSize() {
        Employees employees = manager.getAllEmployees();
        assertThat(employees.getEmployees().size()).isEqualTo(3); // 3 initialized employees
    }

    @Test
    public void testAddEmployee_addsSuccessfully() {
        Employee newEmp = new Employee("4", "Alice", "Wonder", "alice@example.com", "Tester");
        manager.addEmployee(newEmp);

        Employees employees = manager.getAllEmployees();
        assertThat(employees.getEmployees()).contains(newEmp);
        assertThat(employees.getEmployees().size()).isEqualTo(4);
    }
}
