package com.asif.spring.starterproject.injectinterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("orderBo")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("orderDao2")
	private OrderDAO orderDao;
	
	public OrderDAO getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDAO orderDao) {
		this.orderDao = orderDao;
	}

	public OrderBOImpl() {
		System.out.println("Inside orderBoImpl");
	}

	@Override
	public void placeOrder() {
		System.out.println("Place order from implementation");
		orderDao.createOrder();
	}

}
