package com.cloud.learn.springboot.employeeservice.resource;

import com.cloud.learn.springboot.employeeservice.entity.Employee;
import com.cloud.learn.springboot.employeeservice.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeResource {

    private EmployeeRepository employeeRepository;

    public EmployeeResource(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees" + "")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployees(@PathVariable Integer id) {
        return employeeRepository.findById(id).get();
    }

    @PostMapping("/employees")
    public List<Employee> getEmployees(@RequestBody List<Employee> employees){
        return employeeRepository.saveAll(employees);
    }

}