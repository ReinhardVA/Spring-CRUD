package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DepartmentController {

    @Autowired private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department SaveDepartment(@RequestBody Department department){
        return departmentService.SaveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> FetchDepartmentList(){
        return departmentService.FetchDepartmentList();
    }

    @PutMapping("/departments/{id}")
    public Department UpdateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId){
        return departmentService.UpdateDepartment(department, departmentId);
    }

    @DeleteMapping("/departments/{id}")

    public String DeleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.DeleteDepartmentById(departmentId);
        return "Deleted Successfully";
    }
}
