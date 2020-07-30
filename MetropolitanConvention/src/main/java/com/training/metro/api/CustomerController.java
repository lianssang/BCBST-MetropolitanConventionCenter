package com.training.metro.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.metro.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") String customerId) {
		Customer customer = new Customer(customerId, "Sang");
		return customer;
	}
	
	@PostMapping("/addCustomer")
	public ResponseEntity<?> addCustomer(@RequestBody Customer newCustomer) {
		return ResponseEntity.ok().build();
	}
}
