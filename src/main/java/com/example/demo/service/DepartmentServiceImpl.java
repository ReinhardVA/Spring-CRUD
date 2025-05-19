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
    public Department saveDepartment(long departmentId, String departmentName, String departmentAddress, String departmentCode){
        Department department = new Department();
        department.setDepartmentId(departmentId);
        department.setDepartmentName(departmentName);
        department.setDepartmentAddress(departmentAddress);
        department.setDepartmentCode(departmentCode);
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public List<Department> getDepartmentByDepartmentAddress(String departmentAddress) {
        List<Department> department = departmentRepository.findByDepartmentAddress(departmentAddress);
        return department;
    }

    @Override
    public Department getDepartmentByDepartmentId(long departmentId) {
        Department department = departmentRepository.findByDepartmentId(departmentId);
        return department;
    }

    @Override
    public int deleteDepartmentById(long departmentId) {
        Department department = departmentRepository.findByDepartmentId(departmentId);
        if(department != null){
            departmentRepository.delete(department);
            return 1;
        }
        return -1;
    }
}
