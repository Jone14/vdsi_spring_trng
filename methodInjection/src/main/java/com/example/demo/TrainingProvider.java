package com.example.demo;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class TrainingProvider {

	private Course course;
	

	 public TrainingProvider() {
		super();
		 System.out.println("Training Provider Called -SINGLETON");
		 
	 }

	@Lookup
	public abstract Course getFreshCourse();
	
}
