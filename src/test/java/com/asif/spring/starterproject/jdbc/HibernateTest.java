package com.asif.spring.starterproject.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asif.spring.starterproject.jdbc.dao.ProductDao;
import com.asif.spring.starterproject.jdbc.dto.Product;

public class HibernateTest {
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/asif/spring/starterproject/jdbc/config.xml");
		ProductDao productDao = (ProductDao) ctx.getBean("productDao");
		
		System.out.println("One data " + productDao.get(1));
		
		System.out.println("All data " + productDao.getAll());
		
	}
}
