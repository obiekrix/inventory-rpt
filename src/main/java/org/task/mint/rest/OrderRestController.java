/**
 * 
 */
package org.task.mint.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.task.mint.entity.Order;
import org.task.mint.model.OrderRpt;
import org.task.mint.service.OrderService;

import java.util.List;

/**
 * @author Christian
 *
 */
@RestController
@RequestMapping("/order")
public class OrderRestController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/all/{start}/{end}")
	public List<OrderRpt> getOrderedProducts(@PathVariable("start") String start, @PathVariable("end") String end) {
		return orderService.getOrderedProducts(start, end);
	}

}
