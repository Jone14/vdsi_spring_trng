package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.InvokeDonarService;

@RestController
public class UseServiceWithFallback {

	
	@Autowired
	public InvokeDonarService service;
	
	@GetMapping("/srch/{group}")
	public String getDetails(@PathVariable  String group) {
		
		
		 return this.service.invoke(group);
	}
}
