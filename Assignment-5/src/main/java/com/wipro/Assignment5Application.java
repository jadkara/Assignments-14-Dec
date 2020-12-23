package com.wipro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.model.Employee;
import com.wipro.service.EmployeeService;

@SpringBootApplication
public class Assignment5Application implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(Assignment5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeService.saveEmployee(new Employee("Abc", "Abc@gmail.com", "Abc"));
		employeeService.saveEmployee(new Employee("Pqr", "Pqr@gmail.com", "Pqr"));
		employeeService.saveEmployee(new Employee("Xyz", "Xyz@gmail.com", "Xyz"));
	}
}
