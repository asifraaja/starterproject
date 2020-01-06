package com.asif.spring.starterproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/asif/spring/starterproject/config.xml");
		Customer customer = (Customer) ctx.getBean("CustomerBeanUsingInnerClass");
		System.out.println(customer.getName());
		
		Customer customer2 = (Customer) ctx.getBean("CustomerBeanUsingInnerClass");
		System.out.println(customer2.getName());
		
		customer2.setName("Name Changed");
		System.out.println(customer.getName());
		System.out.println(customer2.getName());
		
		((AbstractApplicationContext) ctx).close();
	}
}
