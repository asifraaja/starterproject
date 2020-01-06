package com.asif.spring.assignments.one;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ShoppingList implements InitializingBean,DisposableBean{
	private String name;
	private List<Item> items;
	private double totalBasket;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public void calculateTotalBasket() {
		double value = 0d;
		for(Item item : items) {
			value += (item.getPrice() * item.getQuantity());
		}
		totalBasket = value;
	}
	public void resetTotalBasket() {
		totalBasket = 0d;
		System.out.println("totalBasket :: " + totalBasket);
	}
	public double getTotalBasket() {
		return totalBasket;
	}
	public String toString() {
		return "Name = "+name+
				" Items = "+items;
	}
	/**
	 * similar to init() method
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		calculateTotalBasket();
	}
	/**
	 * similar to destroy() method
	 */
	@Override
	public void destroy() throws Exception {
//		totalBasket = 0d;
		System.out.println("totalBasket :: " + totalBasket);
	}
}
