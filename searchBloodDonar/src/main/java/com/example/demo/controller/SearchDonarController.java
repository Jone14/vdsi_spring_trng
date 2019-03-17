package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SearchDonarController {

	
	@Autowired
	public RestTemplate template;
	
	@Autowired
	public LoadBalancerClient balancedClient;
	
	@GetMapping("/findDonar/{bloodGroup}")
	public String searchForDonar(@PathVariable String bloodGroup) {
		
		 ServiceInstance instance = balancedClient.choose("search-blood-donar");
		 
		 System.out.println(instance.getUri());
			String baseUrl=instance.getUri().toString();
			
	baseUrl=baseUrl+"/search/"+bloodGroup;
			
	        String response = template.getForObject(baseUrl,String.class);
	                return  response;

	}
}

