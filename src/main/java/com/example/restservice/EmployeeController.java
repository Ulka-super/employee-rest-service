package com.example.restservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public Employees getAllEmployees() {
        return EmployeeManager.getAllEmployees();
    }

    @PostMapping
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        EmployeeManager.addEmployee(employee);
        return new ResponseEntity<>("Employee added successfully", HttpStatus.CREATED);
    }
}
