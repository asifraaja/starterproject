package com.asif.spring.starterproject;

public class Address {
	private String line;
	private String zipCode;
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String toString() {
		return line + " " + zipCode;
	}
}
