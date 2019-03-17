package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.entity.PartnerDriver;
import com.example.demo.services.DriverService;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class UsingJdbcTemplateApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =SpringApplication.run(UsingJdbcTemplateApplication.class, args);
		
		   DriverService service = ctx.getBean(DriverService.class);
				   
				   int rowAdded = service.addDriver();
		   
		    System.out.println(rowAdded + " Rows Added")
		    ;
	}

	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource() {
		
		return  DataSourceBuilder.create().build();
		
	}
	
	@Bean
	public JdbcTemplate template() {
		
		return new JdbcTemplate(dataSource());
	}
	
	
	@Bean
	public PartnerDriver driver() {
		
		return new PartnerDriver(101, "Rakesh", 484848, 3.9);
		
	}
}
