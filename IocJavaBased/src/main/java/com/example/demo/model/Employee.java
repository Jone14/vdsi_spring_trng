package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import lombok.Getter;
import lombok.Setter;


public class Employee {

    @Getter
    @Setter
	private long employeeId;
	
	@Autowired
	private Environment env;

	public Employee() {
		super();
	}
	
	public void init() {
		
		  System.out.println(env.getDefaultProfiles().toString());

	}
	
}
