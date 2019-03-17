package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
@Data
@AllArgsConstructor
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
