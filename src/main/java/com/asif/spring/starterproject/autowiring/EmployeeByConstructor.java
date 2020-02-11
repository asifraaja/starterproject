package com.asif.spring.starterproject.autowiring;

public class EmployeeByConstructor {
	private String name;
	private Address address;
	
	public EmployeeByConstructor(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeByConstructor [name=" + name + ", address=" + address + "]";
	}
}
