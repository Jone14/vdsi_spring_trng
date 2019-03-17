package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
@Data
@AllArgsConstructor
@Component
public class PartnerDriver {

	private long driverId;
	private String driverName;
	private long mobileNumber;
	public double rating;
	
	
	public PartnerDriver() {
		super();
		log.info("Partner Driver Initialized");
	}
	
	
}
