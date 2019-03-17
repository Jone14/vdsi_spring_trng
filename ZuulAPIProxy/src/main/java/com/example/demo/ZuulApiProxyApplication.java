package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.demo.filters.PreFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulApiProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiProxyApplication.class, args);
	}

	
	@Bean
	public PreFilter prefilter() {
		
		return new PreFilter();
	}
}
