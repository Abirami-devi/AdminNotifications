package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.EmployeeBO;
import com.example.demo.repository.EmployeeRepository;

public class AdminServiceLayer {
	
	@Autowired
	private EmployeeRepository repo;
	
	//to get user profile details
    public EmployeeBO getEmployeeDetails(int employeeId) {
		
      	 EmployeeBO details = this.repo.findByEmployeeId(employeeId);
      	 return details;
   	}

}
