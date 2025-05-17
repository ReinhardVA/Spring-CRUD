package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department SaveDepartment(long departmentId, String departmentName, String departmentAddress, String departmentCode);
    List<Department> GetAllDepartment();
    List<Department> GetDepartmentByDepartmentAddress(String departmentAddress);
    Department GetDepartmentByDepartmentId(long departmentId);
    int DeleteDepartmentById(long departmentId);
}
