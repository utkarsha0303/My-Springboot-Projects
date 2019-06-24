package com.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapp.model.Customer;
import com.springbootapp.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/customers")
	public String createCustomer(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
		return "Customer Created";
	}

	@PutMapping("/customers/{custId}")
	public String updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
		return "Customer Updated";

	}

	@GetMapping("/customersDetails")
	public List<Customer> getCustomersDetails() {
		List<Customer> custlist = customerService.getAllCustomers();
		return custlist;
	}

	@GetMapping("/customers/{custId}")
	public Customer getCustomerDetail(@PathVariable("custId") int id) {
		return customerService.getCustomerById(id);

	}

	@DeleteMapping("/customers")
	public String deleteCustomerDetail(Customer customer) {
		customerService.deleteCustomer(customer);
		return "Customer Deleted";
	}

}
