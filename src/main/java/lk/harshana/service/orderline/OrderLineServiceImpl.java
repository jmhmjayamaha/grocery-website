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
		orderLineRepository.save(orderLine);
	}

	@Override
	public void updateOrderLine(int id, OrderLine orderLine) {
		OrderLine line = orderLineRepository.findOne(id);
		
		if(line != null ){
			orderLineRepository.save(orderLine);
		}
	}

	@Override
	public List<OrderLine> getAllOrderLine() {
		return (List<OrderLine>) orderLineRepository.findAll();
	}

	@Override
	public OrderLine getOrderLine(int id) {
		return orderLineRepository.findOne(id);
	}

	@Override
	public boolean deleteOrderLine(int id) {
		OrderLine orderLine = orderLineRepository.findOne(id);
		
		if(orderLine != null) {
			orderLineRepository.delete(orderLine);
			return true;
		}
		return false;
	}

}
