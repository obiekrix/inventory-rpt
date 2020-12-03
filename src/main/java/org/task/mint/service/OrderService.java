package org.task.mint.service;

import org.task.mint.entity.Order;
import org.task.mint.model.OrderRpt;

import java.util.List;

/**
 * @author Christian
 *
 */
public interface OrderService {
	
	List<OrderRpt> getOrderedProducts(String start, String end);
}
