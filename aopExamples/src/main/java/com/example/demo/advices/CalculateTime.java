package com.example.demo.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;


@Aspect
public class CalculateTime {



	@Around("@annotation(com.example.demo.utils.ShowExecutionTime)")
	public Object countTime(ProceedingJoinPoint pjp) throws Throwable {
		
		    long current = System.currentTimeMillis();
		
		  Object obj = pjp.proceed();
		  
		    long now = System.currentTimeMillis();
		    
		    long timeElapsed = now - current;
		    
		    System.out.println("Method completed in  :="+timeElapsed);
		    
		  return obj;
	}
}
