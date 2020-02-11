package com.asif.spring.starterproject.injectinterface;

import org.springframework.stereotype.Component;

@Component("orderDao2")
public class OrderDAOImpl2 implements OrderDAO{

	public OrderDAOImpl2() {
	}

	@Override
	public void createOrder() {
		System.out.println("Using orderDaoImpl2");
	}

}
