package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PartnerDriver;
import com.example.demo.repos.DriverRepository;

@Repository
public class DriverService {


	@Autowired
	private JdbcTemplate template;
	
	@Autowired
	private PartnerDriver driver;
	
	@Autowired
	public DriverRepository repo;
	
	
	public int  addDriver() {
		
		 String sql = "insert into partnerDriver values(?,?,?,?)";
		   
		int rowAdded =  template.update(sql,
				       driver.getDriverId(),
				            driver.getDriverName(),driver.getMobileNumber(),driver.getRating());
		   
		return rowAdded;
	}
	

	public List<PartnerDriver> getAllDriver(){
		
		
		return  repo.findAll();
	}
}
