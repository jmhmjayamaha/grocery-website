package lk.harshana.customer.service;

import java.util.List;

import lk.harshana.model.Customer;

public interface CustomerService {

	void createCustomer(Customer customer);
	List<Customer> findAllCustomers();
	Customer findCustomerByName(String name);
	Customer findCustomerByAddress(String address);
	Customer findCustomerByTelNo(String telNo);
	void updateCustomer(int id, Customer customer);
	boolean deleteCustomer(int id);
	
}
