package lk.harshana.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer order_id;
	private Date orderDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "order_orderLine", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "order_line_id"))
	private Set<OrderLine> orderLine = new HashSet<OrderLine>();

	public Order() {
		
	}

	public Order(Date orderDate, Customer customer, Set<OrderLine> orderLine) {
		super();
		this.orderDate = orderDate;
		this.customer = customer;
		this.orderLine = orderLine;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Date getOderDate() {
		return orderDate;
	}

	public void setOderDate(Date oderDate) {
		this.orderDate = oderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<OrderLine> getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(Set<OrderLine> orderLine) {
		this.orderLine = orderLine;
	}
	
}
