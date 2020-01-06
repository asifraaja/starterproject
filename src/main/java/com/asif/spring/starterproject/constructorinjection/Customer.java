package com.asif.spring.starterproject.constructorinjection;

import java.util.Map;

public class Customer {
	private String name;
	private Address address;
	Customer(String name, Address address){
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() {
		return "name : "+name+ 
				"; address: "+address;
	}
	
}
