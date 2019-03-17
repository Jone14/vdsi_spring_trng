package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchDonarController {
	
	@GetMapping("/search/{bloodGroup}")
	public String getDonarByGroup(@PathVariable String bloodGroup) {
		
		  String donarName = "Ramesh";
		  
		  if(bloodGroup.equals("bpos")) {
			  donarName = "Rajesh";
		  }
		  		  
		  return donarName;
	}
}
