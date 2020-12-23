package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.Employee;
import com.wipro.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployee(Long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	public Employee updateEmployee(Long employeeId, Employee employee) {
		employee.setEmployeeId(employeeId);
		return employeeRepository.save(employee);
	}

	public String deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
		return "Employee deleted successfully "+employeeId;
	}
}
