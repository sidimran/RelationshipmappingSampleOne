package com.example.relationship.mapping.demoformapping.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.relationship.mapping.demoformapping.employee.repository.EmployeeRepository;
import com.example.relationship.mapping.demoformapping.entity.Employee;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/saveData")
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmployee(@Valid @RequestBody List<Employee> empData) {

		employeeRepository.saveAll(empData);
		return ResponseEntity.ok("Data Saved");

	}
	

}
