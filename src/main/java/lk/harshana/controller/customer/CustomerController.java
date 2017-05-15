package lk.harshana.controller.customer;

import java.util.AbstractMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lk.harshana.dto.CustomerDto;
import lk.harshana.model.Customer;
import lk.harshana.service.customer.CustomerService;

@RestController
@RequestMapping(value="/grocery-website/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void saveCustomer(@RequestBody @Validated CustomerDto customerDto) {
		customerService.createCustomer(new Customer(customerDto.getName(), customerDto.getAddress(), customerDto.getTelNo()));
	}
	
	@RequestMapping(method= RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public List<Customer> listAllCustomers() {
		return customerService.findAllCustomers();
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	@ResponseStatus(value=HttpStatus.CREATED)
	public void updateCustomer(@PathVariable("id") int id, @RequestBody @Validated CustomerDto customerDto) {
		customerService.updateCustomer(id, new Customer(customerDto.getName(), customerDto.getAddress(), customerDto.getTelNo()));
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	@ResponseStatus(value=HttpStatus.OK)
	public AbstractMap.SimpleEntry<String, String> deleteCustomer(@PathVariable("id") int id) {
		if(customerService.deleteCustomer(id)) {
			return new AbstractMap.SimpleEntry<String, String>("status", "deleted");
		}
		return new AbstractMap.SimpleEntry<String, String>("status", "deleted");
	}
}
