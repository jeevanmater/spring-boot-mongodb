package com.jeevan.mongodb.com.service;

import com.jeevan.mongodb.com.entity.Employee;
import com.jeevan.mongodb.com.repo.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return this.employeeRepository.save(employee);
    }
    public List<Employee> findAllEmployees(){
        return this.employeeRepository.findAll();
    }
    public Employee findEmployeeByEmployeeId(String employeeId){
        return this.employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("Employee not found with this employee id: " + employeeId));

    }
    public String deleteEmployeeByEmployeeId(String employeeId){
        this.employeeRepository.deleteById(employeeId);
        return "Employee is deleted successfully with id: " + employeeId;
    }


}
