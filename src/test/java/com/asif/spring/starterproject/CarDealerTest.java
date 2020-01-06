package com.asif.spring.starterproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDealerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/asif/spring/starterproject/config.xml");
		CarDealer dealer = (CarDealer) ctx.getBean("CarDealerBean");
		System.out.println(dealer.getName());
		System.out.println(dealer.getModels());
		System.out.println(dealer.getModels().getClass());
	}
}
