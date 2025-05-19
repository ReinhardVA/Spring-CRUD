package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired DepartmentService departmentService;

    @RequestMapping("/departments")
    @ResponseBody
    public List<Department> getDepartments(){
        return departmentService.getAllDepartment();
    }

    @RequestMapping("/getDepartment")
    @ResponseBody
    public List<Department> getDepartment(@RequestParam("departmentAddress") String departmentAddress){
        return departmentService.getDepartmentByDepartmentAddress(departmentAddress);
    }

    @RequestMapping("/getDepartmentById")
    @ResponseBody
    public Department getDepartmentById(@RequestParam("departmentId") long departmentId){
        return departmentService.getDepartmentByDepartmentId(departmentId);
    }

    @RequestMapping("/addDepartment")
    @ResponseBody
    public String addDepartment(@RequestParam("departmentId") long departmentId,
                                @RequestParam("departmentName") String departmentName,
                                @RequestParam("departmentAddress") String departmentAddress,
                                @RequestParam("departmentCode") String departmentCode){
        if(departmentService.saveDepartment(departmentId, departmentName, departmentAddress, departmentCode) != null){
            return "Department Added!";
        }
        else{
            return "Department can not added, something went wrong.";
        }
    }
    @RequestMapping("/deleteDepartment")
    public String deleteDepartment(@RequestParam("departmentId") long departmentId){
        if(departmentService.deleteDepartmentById(departmentId) == 1){
            return "Department deleted successfully";
        }
        else{
            return "Something went wrong!";
        }
    }
}
