package com.acpdq.desafio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acpdq.desafio01.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public Double total(Order order) {
		double discountValue = order.getBasic() * ( order.getDiscount() / 100.0 );
		
		return (order.getBasic() - discountValue) + shippingService.shipment(order);
	}
}
