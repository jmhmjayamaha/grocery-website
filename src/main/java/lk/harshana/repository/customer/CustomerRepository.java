package lk.harshana.repository.customer;

import org.springframework.data.repository.CrudRepository;

import lk.harshana.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

//	Customer findByName();
//	Customer findByTelNo();
//	Customer findByAddressWith(String address);
	
}
