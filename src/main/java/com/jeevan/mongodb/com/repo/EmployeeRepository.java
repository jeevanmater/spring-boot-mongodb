package com.jeevan.mongodb.com.repo;

import com.jeevan.mongodb.com.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
