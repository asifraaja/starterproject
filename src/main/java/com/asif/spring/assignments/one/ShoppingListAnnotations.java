package com.asif.spring.assignments.one;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ShoppingListAnnotations {
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
	public double getTotalBasket() {
		return totalBasket;
	}
	public String toString() {
		return "Name = "+name+
				" Items = "+items;
	}
	
	@PostConstruct
	public void calculateTotalBasket() {
		double value = 0d;
		for(Item item : items) {
			value += (item.getPrice() * item.getQuantity());
		}
		totalBasket = value;
	}
	@PreDestroy
	public void resetTotalBasket() {
		totalBasket = 0d;
		System.out.println("totalBasket :: " + totalBasket);
	}
}
