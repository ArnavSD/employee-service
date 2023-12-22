package com.cloud.learn.springboot.employeeservice.repository;

import com.cloud.learn.springboot.employeeservice.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Integer> {
}
