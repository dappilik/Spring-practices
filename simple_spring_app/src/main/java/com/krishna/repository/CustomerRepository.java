package com.krishna.repository;

import java.util.List;

import com.krishna.model.Customer;

public interface CustomerRepository {

	List<Customer> findall();

}