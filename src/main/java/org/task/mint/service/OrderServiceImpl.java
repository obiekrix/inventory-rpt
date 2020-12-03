package org.task.mint.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.task.mint.dao.OrderDAO;
import org.task.mint.entity.Order;
import org.task.mint.model.OrderRpt;

import java.util.List;

/**
 * @author Christian
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;

	@Override
	@Transactional
	public List<OrderRpt> getOrderedProducts(String start, String end) {
		// TODO Auto-generated method stub
		return orderDAO.getOrdersByDateRange(start, end);
	}

}
