package com.asif.spring.starterproject.jdbc.dao;

import java.util.List;

import com.asif.spring.starterproject.jdbc.dto.Product;

public interface ProductDao {
	int create(Product product);
	
	void delete(Product product);
	
	void delete(List<Product> products);
	
	void update(Product product);
	
	Product get(int id);
	
	List<Product> getAll();
}
