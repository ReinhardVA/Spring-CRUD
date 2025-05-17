package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "department")
public class Department {
    @Id
    private String id;
    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public String GetId(){
        return id;
    }
    public void SetId(String id){
        this.id = id;
    }
    public long GetDepartmentId(){
        return departmentId;
    }
    public void SetDepartmentId(long departmentID){
        this.departmentId = departmentID;
    }
    public String GetDepartmentName(){
        return departmentName;
    }
    public void SetDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }
    public String GetDepartmentAddress(){
        return departmentAddress;
    }
    public void SetDepartmentAddress(String departmentAddress){
        this.departmentAddress = departmentAddress;
    }
    public String GetDepartmentCode(){
        return departmentCode;
    }
    public void SetDepartmentCode(String departmentCode){
        this.departmentCode = departmentCode;
    }
}
