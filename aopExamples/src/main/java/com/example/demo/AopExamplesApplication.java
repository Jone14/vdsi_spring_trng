package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo.advices.CalculateTime;
import com.example.demo.advices.FestivalOffer;
import com.example.demo.domains.Billing;
import com.example.demo.ifaces.DiscountService;



@SpringBootApplication
@EnableAspectJAutoProxy()
public class AopExamplesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(AopExamplesApplication.class, args);
		
		   DiscountService service =ctx.getBean(DiscountService.class);
		   
		   System.out.println(service.getClass());
		   
		   
				   System.out.println(service.cashDiscount());
				   
				   System.out.println(service.getCoupons());
				   
	}
	
	@Bean
	public DiscountService service() {
		return new Billing();
	}
	
	@Bean
	public FestivalOffer offer() {
		
		return new FestivalOffer();
	}
	
	
	@Bean
	public CalculateTime  time() {
		
		 return new CalculateTime();
	}

	
}
