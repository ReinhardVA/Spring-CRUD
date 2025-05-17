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
    public List<Department> GetDepartments(){
        return departmentService.GetAllDepartment();
    }

    @RequestMapping("/getDepartment")
    @ResponseBody
    public List<Department> GetDepartment(@RequestParam("departmentAddress") String departmentAddress){
        return departmentService.GetDepartmentByDepartmentAddress(departmentAddress);
    }

    @RequestMapping("/getDepartmentById")
    @ResponseBody
    public Department GetDepartmentById(@RequestParam("departmentId") long departmentId){
        return departmentService.GetDepartmentByDepartmentId(departmentId);
    }

    @RequestMapping("/addDepartment")
    @ResponseBody
    public String AddDepartment(@RequestParam("departmentId") long departmentId,
                                @RequestParam("departmentName") String departmentName,
                                @RequestParam("departmentAddress") String departmentAddress,
                                @RequestParam("departmentCode") String departmentCode){
        if(departmentService.SaveDepartment(departmentId, departmentName, departmentAddress, departmentCode) != null){
            return "Department Added!";
        }
        else{
            return "Department can not added, something went wrong.";
        }
    }

    public String DeleteDepartment(@RequestParam("departmentId") long departmentId){
        if(departmentService.DeleteDepartmentById(departmentId) == 1){
            return "Department deleted successfully";
        }
        else{
            return "Something went wrong!";
        }
    }
}
