package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.model.Employee;
import com.wipro.repository.EmployeeRepository;

@Controller
public class ResourceController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/displayAll")
	public ModelAndView displayAll() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("employees", employeeRepository.findAll());
		mav.setViewName("displayAll");
		return mav;
	}
	
	@GetMapping("/display/{employeeId}")
	public ModelAndView display(@PathVariable("employeeId") String employeeId) {
		ModelAndView mav = new ModelAndView();
		Employee employee = employeeRepository.findById(Long.valueOf(employeeId)).get();
		mav.addObject("employee", employee);
		mav.setViewName("display");
		return mav;
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ModelAndView display(
		@ModelAttribute("ename") String ename,
		@ModelAttribute("email") String email,
		@ModelAttribute("location") String location) {
	
		Employee employee = new Employee(ename, email, location);
		employeeRepository.save(employee);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("addEmployee");
		return mav;
	}
	

}
