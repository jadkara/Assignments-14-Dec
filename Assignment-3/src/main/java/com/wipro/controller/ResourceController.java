package com.wipro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.model.Branch;
import com.wipro.model.Services;

@Controller
public class ResourceController {
	
	String[] branchArray = { "KASTURBA GANDHI MARG", "MALLESWARAM", "KORAMANGALA", "AIRPORT ROAD", "M G ROAD",
			"IT PARK", "J P NAGAR", "R T NAGAR", "BANASHANKARI", "INDIRA NAGAR" };
	
	String[] servicesArray = { "Advancing of Loans.", "Overdraft.", "Discounting of Bills of Exchange.",
			"Check/Cheque Payment.", "Collection and Payment Of Credit Instruments", "Foreign Currency Exchange.",
			"Consultancy.", "Bank Guarantee.", "Remittance of Funds.", "Credit cards.", "ATMs Services.",
			"Debit cards.", "Home banking.", "Online banking", "Mobile Banking.", "Accepting Deposit.",
			"Priority banking.", "Private banking." };
	
	
	@GetMapping("/name")
	public ModelAndView getBranchName() {
		ModelAndView mv = new ModelAndView();
		List<Branch> branchList = new ArrayList<>();
		Long index = 1L;
		for(String branch:branchArray) {
			branchList.add(new Branch(index, branch));
			index++;
		}
		mv.addObject("bankName", "HDFC Bank BANGALORE");
		mv.addObject("branches", branchList);
		mv.setViewName("name");
		return mv;
	}
	
	@GetMapping("/services")
	public ModelAndView getServices() {
		ModelAndView mv = new ModelAndView();
		List<Services> servicesList = new ArrayList<>();
		Long index = 1L;
		for(String service:servicesArray) {
			servicesList.add(new Services(index, service));
			index++;
		}
		mv.addObject("bankName", "HDFC Bank BANGALORE");
		mv.addObject("services", servicesList);
		mv.setViewName("services");
		return mv;
	}

}
