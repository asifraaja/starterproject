package com.asif.spring.starterproject.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.asif.spring.starterproject.autowiring.Address;

@Component
public class Instructor {

	@Value("5")
	private int id;
	@Value("Name")
	private String name;
	@Value("#{sports}")
	private List<String> sports;
	
	@Autowired
	@Qualifier("address")
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSports() {
		return sports;
	}

	public void setSports(List<String> sports) {
		this.sports = sports;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", sports=" + sports + ", address=" + address + "]";
	}
}
