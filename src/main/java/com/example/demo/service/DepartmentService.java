package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department SaveDepartment(Department department);
    List<Department> FetchDepartmentList();
    Department UpdateDepartment(Department department, Long departmentId);
    void DeleteDepartmentById(Long departmentId);
}
