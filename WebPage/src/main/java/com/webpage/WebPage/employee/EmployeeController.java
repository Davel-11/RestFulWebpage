package com.webpage.WebPage.employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("/employee")
	public String employeePage() {
		return "Hi Employee";
	}

	
	
}
