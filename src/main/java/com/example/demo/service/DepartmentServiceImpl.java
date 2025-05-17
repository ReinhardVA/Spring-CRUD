package com.example.demo.service;


import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department SaveDepartment(long departmentId, String departmentName, String departmentAddress, String departmentCode){
        Department department = new Department();
        department.SetDepartmentId(departmentId);
        department.SetDepartmentName(departmentName);
        department.SetDepartmentAddress(departmentAddress);
        department.SetDepartmentCode(departmentCode);
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> GetAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public List<Department> GetDepartmentByDepartmentAddress(String departmentAddress) {
        List<Department> department = departmentRepository.FindByDepartmentAddress(departmentAddress);
        return department;
    }

    @Override
    public Department GetDepartmentByDepartmentId(long departmentId) {
        Department department = departmentRepository.FindByDepartmentId(departmentId);
        return department;
    }

    @Override
    public int DeleteDepartmentById(long departmentId) {
        Department department = departmentRepository.FindByDepartmentId(departmentId);
        if(department != null){
            departmentRepository.delete(department);
            return 1;
        }
        return -1;
    }
}
