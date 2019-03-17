package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
@Data
@AllArgsConstructor
@Entity
@Table(name="partnerdriver")
public class PartnerDriver {

	@Id
	private long driverId;
	private String driverName;
	private long mobileNumber;
	public double rating;
	
	
	public PartnerDriver() {
		super();
		log.info("Partner Driver Initialized");
	}
}
