package lk.harshana.repository.customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lk.harshana.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	List<Customer> findByNameOrderByAddress(String name);
	Customer findByTelNo(String telNo);
//	Customer findByAddressWith(String address);
	
}
