package com.acpdq.desafio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acpdq.desafio01.entities.Order;
import com.acpdq.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// Exemplo 01
		Order orderEx1 = new Order(1034, 150.0, 20.0);
		System.out.println("Ex. 01:");
		System.out.println(orderEx1.toString());
		System.out.println("Valor total: R$ " + orderService.total(orderEx1));
		System.out.println();
		
		// Exemplo 02
		Order orderEx2 = new Order(2282, 800.0, 10.0);
		System.out.println("Ex. 02:");
		System.out.println(orderEx2.toString());
		System.out.println("Valor total: R$ " + orderService.total(orderEx2));
		System.out.println();
		
		// Exemplo 03
		Order orderEx3 = new Order(1309, 95.90, 0.0);
		System.out.println("Ex. 03:");
		System.out.println(orderEx3.toString());
		System.out.println("Valor total: R$ " + orderService.total(orderEx3));
		System.out.println();
	}

}
