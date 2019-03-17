package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;

@RestController
public class PayamentClient {

	
	@Autowired
	RestTemplate template;
	
	
//	@Autowired
//	private EurekaClient client;
	
	@GetMapping("/showOnePayment")
	public String getPayment() {
		
		
		   return   template.getForObject("http://payment-details-service/showPayment",String.class);
	}
	
}
