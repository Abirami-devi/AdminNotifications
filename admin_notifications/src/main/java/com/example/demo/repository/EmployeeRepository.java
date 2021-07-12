package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.entity.EmployeeBO;

public interface EmployeeRepository extends MongoRepository<EmployeeBO, Integer> {

	EmployeeBO findByEmployeeId(int employeeId);

	


}
