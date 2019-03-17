package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.repo.PaymentRepo;
import com.example.demo.utils.ClientView;
import com.fasterxml.jackson.annotation.JsonView;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class PaymentController {

	
	@Autowired
	private PaymentRepo repo;
	
	@Autowired
	@Qualifier("ramesh")
	private Payment object;
	
	
	@Autowired
	@Qualifier("suresh")
	private Payment object2;
	
	@Autowired(required=false)
	private List<Payment> list;
	
	@GetMapping("/showPayment")
	public Payment getPayment() {
		
		          return object;
	}
	
	@GetMapping("/showAll")
	@JsonView(ClientView.class)
	public List<Payment> findAll(){
				
		
		return repo.findAll();
	}
	
	@PostMapping("/addPayment")
	@ApiOperation(value="This method return")
	public Payment  addPayment(@ApiParam("Takes payment details ") @RequestBody Payment payment){
				
		
		return repo.save(payment);
	}
	
	@GetMapping("/findById/{id}")
	public Payment getPaymentById(@PathVariable long id) {
		
		if(id==1) {
			return object;
		} else {
			return object2;
		}
	}
}
