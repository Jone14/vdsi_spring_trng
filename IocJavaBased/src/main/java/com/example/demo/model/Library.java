package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Library {

	
	@Setter
	private String libaryName;
	
	@Autowired(required=false)
	private List<Book> bookList;
	
	
}
