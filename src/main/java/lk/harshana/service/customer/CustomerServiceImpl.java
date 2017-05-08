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
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer findCustomerByName(String name) {
		return customerRepository.findByName(name);
	}

	@Override
	public Customer findCustomerByAddress(String address) {
//		return  customerRepository.findByAddressWith(address);
		return null;
	}

	@Override
	public Customer findCustomerByTelNo(String telNo) {
		return customerRepository.findByTelNo(telNo);
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		Customer cus = customerRepository.findOne(id);
		customer.setId(id);
		customerRepository.save(customer);
	}

	@Override
	public boolean deleteCustomer(int id) {
		Customer customer = customerRepository.findOne(id);
		
		if(customer != null) {
			return true;
		}
		return false;
	}

}
