package com.krishna.repository;

import java.util.ArrayList;
import java.util.List;

import com.krishna.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.krishna.repository.CustomerRepository#findall()
	 */
	@Override
	public List<Customer> findall() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();

		customer.setFirstName("Krishna");
		customer.setLastName("Reddy");

		customers.add(customer);

		return customers;
	}
}
