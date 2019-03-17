package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class InvokeDonarService {

	
	@Autowired
	public RestTemplate template;
	
	@Autowired
	LoadBalancerClient client;
	
	@HystrixCommand(fallbackMethod="myFallBack")
	public String invoke(String bloodGroup) {
		
		System.out.println("Inside Normal Flow");
		
		ServiceInstance instance = client.choose("search-blood-donar");
		 
		 System.out.println(instance.getUri());
			String baseUrl=instance.getUri().toString();
			
	baseUrl=baseUrl+"/search/"+bloodGroup;
			
	        String response = template.getForObject(baseUrl,String.class);
	                return  response;
 
	                
	}
	public String myFallBack(String bloodGroup) {
		
		System.out.println("Fall Back Method Called");
		
		return "service down will be  get details shortly";
	}
	
	
}
