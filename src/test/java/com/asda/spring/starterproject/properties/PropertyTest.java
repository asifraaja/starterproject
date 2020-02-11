package com.asda.spring.starterproject.properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asif.spring.starterproject.properties.MyDAO;

public class PropertyTest {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/asif/spring/starterproject/properties/config.xml");
		MyDAO dao = (MyDAO) ctx.getBean("DAO");
		System.out.println(dao.toString());
		ctx.registerShutdownHook();
	}
}
