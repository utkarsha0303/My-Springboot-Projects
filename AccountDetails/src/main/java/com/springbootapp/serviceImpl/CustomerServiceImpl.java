package com.springbootapp.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapp.Repository.CustomerRepo;
import com.springbootapp.model.Customer;
import com.springbootapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo repository;

	@Override
	public Customer createCustomer(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {

		return repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repository.findAll();
	}

	@Override
	public void deleteCustomer(Customer customer) {
		repository.delete(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		return repository.getOne((long) id);
	}
}
