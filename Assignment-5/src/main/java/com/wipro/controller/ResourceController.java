package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.Employee;
import com.wipro.service.EmployeeService;

@RestController
public class ResourceController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") String employeeId) {
		return employeeService.getEmployee(Long.valueOf(employeeId));
	}

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@PutMapping("/employees/{employeeId}")
	public Employee updateEmployee(@PathVariable("employeeId") String employeeId, @RequestBody Employee employee) {
		return employeeService.updateEmployee(Long.valueOf(employeeId), employee);
	}

	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable("employeeId") String employeeId) {
		return employeeService.deleteEmployee(Long.valueOf(employeeId));
	}
}
