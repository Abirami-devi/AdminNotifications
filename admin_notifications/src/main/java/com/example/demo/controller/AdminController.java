package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.businessLayer.AdminBusinessLayer;
import com.example.demo.entity.EmployeeBO;

public class AdminController {
	
	@Autowired
	private AdminBusinessLayer blObject;
	
	
	@GetMapping(path = "/userprofile/{employeeId}")
	public EmployeeBO getEmployeeDetails(@PathVariable("employeeId")int employeeId){
		
		return this.blObject.getEmployeeDetails(employeeId);
	}

}
