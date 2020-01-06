package com.asif.spring.starterproject.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/asif/spring/starterproject/constructorinjection/config.xml");
		Customer customer = (Customer) ctx.getBean("customerBeanWithCschema");
		System.out.println(customer.toString());
	}
}
