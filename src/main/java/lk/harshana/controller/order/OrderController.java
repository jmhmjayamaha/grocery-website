package lk.harshana.controller.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lk.harshana.dto.OrderDto;
import lk.harshana.model.Order;
import lk.harshana.service.order.OrderService;

@RestController
@RequestMapping(value="/grocery-website/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method= RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void createOrder(@RequestBody @Validated OrderDto orderDto) {
//		orderService.createOrder(new Order(orderDto.getOrderDate(), orderDto.getCustomer(), orderDto.getOrderLine()));
		orderService.createOrder(new Order(orderDto.getOrderDate(), null , orderDto.getOrderLine()));
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Order> getAllOrder() {
		return orderService.getAllOrder();
	}
}
