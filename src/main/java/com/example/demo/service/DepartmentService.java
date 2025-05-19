package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(long departmentId, String departmentName, String departmentAddress, String departmentCode);
    List<Department> getAllDepartment();
    List<Department> getDepartmentByDepartmentAddress(String departmentAddress);
    Department getDepartmentByDepartmentId(long departmentId);
    int deleteDepartmentById(long departmentId);
}
