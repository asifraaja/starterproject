package com.asif.spring.starterproject.jdbc.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.asif.spring.starterproject.jdbc.dao.ProductDao;
import com.asif.spring.starterproject.jdbc.dto.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {
	@Autowired
	@Qualifier("hibernateTemplate")
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		int result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}
	
	@Override
	@Transactional
	public void delete(List<Product> products) {
		hibernateTemplate.deleteAll(products);
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	public Product get(int id) {
		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}

}
