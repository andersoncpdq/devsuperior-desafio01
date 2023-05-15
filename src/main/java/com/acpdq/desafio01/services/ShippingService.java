package com.acpdq.desafio01.services;

import org.springframework.stereotype.Service;

import com.acpdq.desafio01.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		
		double basicValue = order.getBasic();
		double shipValue = 0.0;
		
		if (basicValue < 100.0)
			shipValue = 20.0;
		else if (basicValue >= 100.0 && basicValue < 200.0)
			shipValue = 12.0;
		
		return shipValue;
	}
}
