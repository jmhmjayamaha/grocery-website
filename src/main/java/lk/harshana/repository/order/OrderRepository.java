package lk.harshana.repository.order;


import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import lk.harshana.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

	Order findByOrderDate(Date date);
}
