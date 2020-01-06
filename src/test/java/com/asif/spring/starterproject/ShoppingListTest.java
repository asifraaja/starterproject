package com.asif.spring.starterproject;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asif.spring.assignments.one.ShoppingList;

public class ShoppingListTest {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/asif/spring/starterproject/config.xml");
		ShoppingList sl = (ShoppingList) ctx.getBean("ShoppingListBeanUsingAnnotations");
		System.out.println("Sl Name : " + sl.getName());
		System.out.println("Sl Items : " + sl.getItems());
		System.out.println("Basket Value : " + sl.getTotalBasket());
		ctx.registerShutdownHook();
	}
}
