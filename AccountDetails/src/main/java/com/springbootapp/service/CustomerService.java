package com.springbootapp.service;

import java.util.List;

import com.springbootapp.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer cusomer);

	Customer updateCustomer(Customer customer);

	Customer getCustomerById(int id);

	List<Customer> getAllCustomers();

	void deleteCustomer(Customer customer);

}
