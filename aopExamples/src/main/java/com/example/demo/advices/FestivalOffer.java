package com.example.demo.advices;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j

public class FestivalOffer implements Ordered {

	@Before("execution(* com.example.demo.domains.*.*(..))")
	@Order(1)
	public void pongalOffer(JoinPoint jp) {
		
		log.info("Pongal Offer Called on BEFORE *****  "+jp);
		
	}
	
	
	@Around("execution(* com.example.demo.domains.*.*(..))")
	public Object specialOffer(ProceedingJoinPoint jp) throws Throwable{
		
		System.out.println("First part of Around Advice Called on "+jp);
		
		           Object obj = jp.proceed();
		           
		           if(obj instanceof Number) {
		              Double current = (Double)obj;
		              obj = current+0.5;
		           } 
		           System.out.println("Second part of Around Advice called");
		           
		           return obj;
	}


	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
