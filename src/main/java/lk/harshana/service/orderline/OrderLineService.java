package lk.harshana.service.orderline;

import java.util.List;

import lk.harshana.model.OrderLine;

public interface OrderLineService {

	void createOrderLine(OrderLine orderLine);
	void updateOrderLine(int id, OrderLine orderLine);
	List<OrderLine> getAllOrderLine();
	OrderLine getOrderLine(int id);
	boolean deleteOrderLine(int id);
}
