package lk.harshana.service.order;

import java.util.Date;
import java.util.List;

import lk.harshana.model.Order;

public interface OrderService {

	void createOrder(Order order);
	void updateOrder(int id, Order order);
	List<Order> getAllOrder();
	Order getOrder(Date date);
	boolean deleteOrder(int id);
	
}
