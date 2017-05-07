package lk.harshana.service.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.harshana.model.Customer;
import lk.harshana.repository.customer.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerByTelNo(String telNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
