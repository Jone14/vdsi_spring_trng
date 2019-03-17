package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.Employee;
import com.example.demo.model.Library;

@Configuration
public class ApplicationConfig {


//	@Autowired 
//	Author secondAuthor;
	
	@Autowired
	DomainConfig config;
	
	@Bean(name="firstAuthor")
	@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Author author() {
		
		// return new Author(101,"Ramesh");
		
		return new Author();
	}
	
	
	
	@Bean()
	public Book springBook() {
		
		// return new Book(202,"Spring",secondAuthor);
		
	//	return new Book();
		 return new Book(202,"Spring",author());
		
	}
	
	
	@Bean()
	public Book javaBook() {
			
		 return new Book(203,"Java 10",author());
		}
	
	@Bean()
	public Book dotNetBook() {
			
		 return new Book(204,"Mastering DOTNET",author());
		
	}
	
	@Bean
	public Library library() {
		
		Library gandhiLibrary = new Library();
		gandhiLibrary.setLibaryName("Gandhi Library");
		
		return gandhiLibrary;
	}
	
	
	@Bean(initMethod="init")
	public Employee employee() {
		
		return new Employee();
	}
}
