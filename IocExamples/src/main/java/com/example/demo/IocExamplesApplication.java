package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.PartnerDriver;
import com.example.demo.model.Payment;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class IocExamplesApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx =	SpringApplication.run(IocExamplesApplication.class, args);
	
	
	  Payment payment =   ctx.getBean(Payment.class);
	     
	       PartnerDriver driver = payment.getDriver();
	  
	        driver.setDriverId(204949);
	        driver.setDriverName("Suresh");
	        driver.setMobileNumber(49494949);
	        driver.setRating(4.2);
	        
	  
	      log.info(payment.toString());
	      
	      
	}

}
