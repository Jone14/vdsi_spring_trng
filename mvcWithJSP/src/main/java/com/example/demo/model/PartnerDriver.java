package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mvcdriver")
public class PartnerDriver {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long driverId;
	private String driverName;
	private long mobileNumber;
	public double rating;
}
