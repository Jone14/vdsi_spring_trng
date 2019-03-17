package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.entity.PartnerDriver;

@SpringBootApplication
public class MyconfigClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyconfigClient2Application.class, args);
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
		
		return new PartnerDriver();
	}
}
