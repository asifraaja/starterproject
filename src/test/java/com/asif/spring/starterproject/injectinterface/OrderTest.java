package com.asif.spring.starterproject.injectinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/asif/spring/starterproject/injectinterface/config.xml");
		OrderBO orderBo = (OrderBO) ctx.getBean("orderBo");
		orderBo.placeOrder();
	}
}
