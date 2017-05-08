package lk.harshana.service.order;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.harshana.model.Order;
import lk.harshana.repository.order.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void createOrder(Order order) {
		orderRepository.save(order);
	}

	@Override
	public void updateOrder(int id, Order order) {
		Order o = orderRepository.findOne(id);
		order.setOrder_id(id);
		if(o != null) {
			orderRepository.save(order);
		}
		
	}

	@Override
	public List<Order> getAllOrder() {
		return (List<Order>) orderRepository.findAll();
	}

	@Override
	public Order getOrder(Date date) {
		return orderRepository.findByOrderDate(date);
	}

	@Override
	public boolean deleteOrder(int id) {
		Order order = orderRepository.findOne(id);
		if(order != null )  {
			return true;
		}
		return false;
	}
	
}
