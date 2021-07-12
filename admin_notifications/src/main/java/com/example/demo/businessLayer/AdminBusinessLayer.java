package com.example.demo.businessLayer;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.EmployeeBO;
import com.example.demo.service.AdminServiceLayer;

public class AdminBusinessLayer {
	
	@Autowired
	private AdminServiceLayer service;
	
	
public EmployeeBO getEmployeeDetails(int employeeId){
		
		return this.service.getEmployeeDetails(employeeId);
	}

}
