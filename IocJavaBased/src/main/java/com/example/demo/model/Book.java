package com.example.demo.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.example.demo.model.Author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data

@Slf4j
public class Book {

	private long bookNumber;
	private String bookName;
	
	
	
	private Author author;
	
	
	public Book() {
		
		log.info("Book Constructor Called");
		
	
	}


	public Book(long bookNumber, String bookName, Author author) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
	}
	
}
