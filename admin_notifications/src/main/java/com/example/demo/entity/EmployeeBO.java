package com.example.demo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
@Document(collection = "AdminNotifications")
public class EmployeeBO {
	
	@Id
	int employeeId;
	String employeeName;
	String domainName;
	String domainLead;
	String projectName;
	String projectLead;
	boolean isAdmin;
	long employeeContact;

}
