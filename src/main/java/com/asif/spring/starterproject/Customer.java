package com.asif.spring.starterproject;

import java.util.Map;

public class Customer {
	private String name;
	private Map<String, String> products;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getProducts() {
		return products;
	}
	public void setProducts(Map<String, String> products) {
		this.products = products;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() {
		return "name : "+name+ 
				"\nproducts: "+products+
				"\naddress: "+address;
	}
	
}
