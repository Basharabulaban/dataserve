package com.ds.DataServe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.DataServe.db.Subject;
import com.ds.DataServe.db.SubjectDto;
import com.ds.DataServe.service.Service;

@RestController
public class DsController {
	// abbod
	@Autowired
	Service service;
	@GetMapping("/welcome")
	public String greeting() {
		return "Hello World";
	}
	
	
	@GetMapping("/bashar")
	public String getBasharName() {
		return "Bashar abo laban";
	}
	
	
	@GetMapping("/getSubject")
	public SubjectDto getsubject(){
		return service.getsuject();
	}
	
}
