package lk.harshana.service.orderline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.harshana.model.OrderLine;
import lk.harshana.repository.orderline.OrderLineRepository;

@Service
public class OrderLineServiceImpl implements OrderLineService {

	@Autowired
	private OrderLineRepository orderLineRepository;
	
	@Override
	public void createOrderLine(OrderLine orderLine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrderLine(int id, OrderLine orderLine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderLine> getAllOrderLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderLine getOrderLine(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOrderLine(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
