package com.jeevan.mongodb.com.controller;

import com.jeevan.mongodb.com.entity.Employee;
import com.jeevan.mongodb.com.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAllEmployees() {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.findAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findEmployeeByEmployeeId(@PathVariable(value = "id") String employeeId) {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.findEmployeeByEmployeeId(employeeId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeBYEmployeeId(@PathVariable(value = "id") String employeeId) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(this.employeeService.deleteEmployeeByEmployeeId(employeeId));
    }
}
