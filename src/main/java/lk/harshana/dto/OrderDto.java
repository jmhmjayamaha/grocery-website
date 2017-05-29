package lk.harshana.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;

import lk.harshana.model.Customer;
import lk.harshana.model.OrderLine;

public class OrderDto {

	@NotNull
	private Date orderDate;

	private Customer customer;

	private Set<OrderLine> orderLine = new HashSet<OrderLine>();

	public OrderDto() {
		
	}

	public OrderDto(Date orderDate, Customer customer, Set<OrderLine> orderLine) {
		super();
		this.orderDate = orderDate;
		this.customer = customer;
		this.orderLine = orderLine;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Set<OrderLine> getOrderLine() {
		return orderLine;
	}
	
}
