package com.example.demo;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Payment;
import com.example.demo.repo.PaymentRepo;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
@EnableSwagger2
@EnableDiscoveryClient
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

	
	@Bean(name="ramesh")
	public Payment payment() {
		
		return new Payment(202,LocalDate.of(2018,Month.FEBRUARY, 10),4500, "Ramesh");
		
		
	}
	
	@Bean
	public Docket docket() {
		
		return new Docket(DocumentationType.SWAGGER_2).
				     select().apis(RequestHandlerSelectors.any()).build();
	}
	
	@Bean(name="suresh")
	public Payment secondPayment() {
		
		return new Payment(202,LocalDate.of(2018,Month.MARCH, 12),4500, "Suresh");
		
		
	}
	
	// @Bean
	public CommandLineRunner commandLineRunner(PaymentRepo repo) {
		
		return args ->{
			   
			repo.save(new Payment(202,LocalDate.of(2018,Month.MARCH, 12),4500, "Suresh"));
			repo.save(new Payment(203,LocalDate.of(2017,Month.FEBRUARY, 14),3500, "Magesh"));
			repo.save(new Payment(204,LocalDate.of(2016,Month.FEBRUARY, 14),13500, "Ragesh"));
			repo.save(new Payment(205,LocalDate.of(2015,Month.FEBRUARY, 14),32500, "Rakesh"));
			repo.save(new Payment(206,LocalDate.of(2014,Month.FEBRUARY, 14),35400, "Magesh"));
			repo.save(new Payment(207,LocalDate.of(2013,Month.FEBRUARY, 14),35050, "Magesh"));
			
		};
	}
	
}
