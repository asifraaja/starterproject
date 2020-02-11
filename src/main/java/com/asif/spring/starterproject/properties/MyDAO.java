package com.asif.spring.starterproject.properties;

public class MyDAO {
	private String dbUrl;
	
	MyDAO(String dbUrl){
		this.dbUrl = dbUrl;
	}

	@Override
	public String toString() {
		return "MyDAO [dbUrl=" + dbUrl + "]";
	}
	
}
