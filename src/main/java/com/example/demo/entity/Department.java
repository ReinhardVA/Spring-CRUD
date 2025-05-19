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

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public long getDepartmentId(){
        return departmentId;
    }
    public void setDepartmentId(long departmentID){
        this.departmentId = departmentID;
    }
    public String getDepartmentName(){
        return departmentName;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }
    public String getDepartmentAddress(){
        return departmentAddress;
    }
    public void setDepartmentAddress(String departmentAddress){
        this.departmentAddress = departmentAddress;
    }
    public String getDepartmentCode(){
        return departmentCode;
    }
    public void setDepartmentCode(String departmentCode){
        this.departmentCode = departmentCode;
    }
}
