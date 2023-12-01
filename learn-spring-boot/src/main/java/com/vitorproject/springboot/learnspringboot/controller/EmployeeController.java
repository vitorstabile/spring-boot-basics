package com.vitorproject.springboot.learnspringboot.controller;

import com.vitorproject.springboot.learnspringboot.dto.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1L, "John", "IT"),
                new Employee(2L, "Mike", "HR")
        );
    }
}
