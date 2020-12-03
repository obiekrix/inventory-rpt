package org.task.mint.dao;

import org.task.mint.entity.Order;
import org.task.mint.model.OrderRpt;

import java.util.List;


public interface OrderDAO {
	
	List<OrderRpt> getOrdersByDateRange(String start, String end);

	Order getOrder(int theId);

}
