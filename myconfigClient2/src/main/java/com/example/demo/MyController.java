package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PartnerDriver;
import com.example.demo.services.DriverService;

import java.util.*;
@RestController
public class MyController {

	
	
	@Autowired
	public DriverService service;
	
	
	@GetMapping("/")
	public int  addDriver(){
		
		
		return  service.addDriver();
	}
	
	
	@GetMapping("/drivers")
	public List<PartnerDriver>  findDrivers(){
		
		
		return service.getAllDriver();
	}
	
}
