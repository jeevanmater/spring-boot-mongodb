package com.jeevan.mongodb.com.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collation = "employee")
public class Employee {
    @Id
    private String id;
    private String name;
    private Integer age;
    private BigDecimal salary;
    private Address address;
}
