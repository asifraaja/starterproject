package com.asif.spring.starterproject.injectinterface;

import org.springframework.stereotype.Component;

@Component("orderDao")
public class OrderDAOImpl implements OrderDAO {

	public OrderDAOImpl() {
		System.out.println("Inside orderDao");
	}

	@Override
	public void createOrder() {
		System.out.println("Create the order inside the db");
	}

}
