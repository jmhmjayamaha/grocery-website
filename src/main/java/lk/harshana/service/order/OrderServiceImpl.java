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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrder(int id, Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
