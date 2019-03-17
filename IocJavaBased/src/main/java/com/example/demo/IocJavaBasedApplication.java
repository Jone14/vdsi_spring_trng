package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.Employee;
import com.example.demo.model.Library;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class IocJavaBasedApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(IocJavaBasedApplication.class, args);
	
//		     Author ram =(Author) ctx.getBean("firstAuthor");
////		     
//		     Author raj =(Author) ctx.getBean("firstAuthor");
//		     
//		     
//		     System.out.println("Is Singleton =:"+ ctx.isSingleton("firstAuthor"));
//		     
		          
//		     
//		     
//		  log.info(ram.toString());
//		  
//	    log.info(raj.toString());	  
//	    
	 //   Book bk = ctx.getBean(Book.class);
	    
	   // log.info(bk.toString());
		
		
//		Library library = ctx.getBean(Library.class);
//		
//		
//		library.getBookList().forEach(System.out::println);
//		
//		
//		 library.getBookList().
//		      stream().map((book)->book.getBookName()).forEach(System.out::println);
//	    
//	}

	
		Employee emp = ctx.getBean(Employee.class);
		
		System.out.println(emp);
	
	}
	
}
