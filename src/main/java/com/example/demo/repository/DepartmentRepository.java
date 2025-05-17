package com.example.demo.repository;

import com.example.demo.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface DepartmentRepository extends MongoRepository<Department, Long> {
    List<Department> FindByDepartmentAddress(String departmentAddress);
    Department FindByDepartmentId(long departmentId);
}
