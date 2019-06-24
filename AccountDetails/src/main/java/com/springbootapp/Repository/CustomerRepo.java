package com.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootapp.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{


	
}
