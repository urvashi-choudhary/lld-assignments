package com.example.ecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecom.exceptions.OrderCannotBeCancelledException;
import com.example.ecom.exceptions.OrderDoesNotBelongToUserException;
import com.example.ecom.exceptions.OrderNotFoundException;
import com.example.ecom.exceptions.UserNotFoundException;
import com.example.ecom.models.Inventory;
import com.example.ecom.models.Order;
import com.example.ecom.models.OrderDetail;
import com.example.ecom.models.OrderStatus;
import com.example.ecom.models.User;
import com.example.ecom.repositories.InventoryRepository;
import com.example.ecom.repositories.OrderDetailRepository;
import com.example.ecom.repositories.OrderRepository;
import com.example.ecom.repositories.ProductRepository;
import com.example.ecom.repositories.UserRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	@Autowired
	private InventoryRepository inventoryRepository;

	@Override
	public Order cancelOrder(int orderId, int userId) throws UserNotFoundException, OrderNotFoundException,
			OrderDoesNotBelongToUserException, OrderCannotBeCancelledException {
		User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));
		Order order = orderRepository.findById(orderId)
				.orElseThrow(() -> new OrderNotFoundException("Order not found"));
		if (order.getUser().getId() != user.getId()) {
			throw new OrderDoesNotBelongToUserException("Order doesn't belong to user");
		}
		if (order.getOrderStatus() != OrderStatus.PLACED) {
			throw new OrderCannotBeCancelledException(
					"Order cannot be cancelled as its status is " + order.getOrderStatus().toString());
		}
		List<OrderDetail> orderDetails = orderDetailRepository.findAllByOrder(order);
		for (OrderDetail orderDetail : orderDetails) {
			Inventory inventory = inventoryRepository.findByProduct(orderDetail.getProduct());
			inventory.setQuantity(inventory.getQuantity() + orderDetail.getQuantity());
			inventoryRepository.save(inventory);
		}
		order.setOrderStatus(OrderStatus.CANCELLED);
		return orderRepository.save(order);
	}
}
