package com.krishna.service;

import java.util.List;

import com.krishna.model.Customer;
import com.krishna.repository.CustomerRepository;
import com.krishna.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository= new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.krishna.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findall();
	}
}
