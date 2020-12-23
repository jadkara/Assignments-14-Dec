package com.wipro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@GetMapping("/name")
	public String getName() {
		return "HDFC Bank";
	}
	
	@GetMapping("/address")
	public String getAddress() {
		return "Hinjewadi, Pune";
	}

}
