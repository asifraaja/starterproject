package com.asif.spring.starterproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/asif/spring/starterproject/config.xml");
		Employee emp = (Employee) ctx.getBean("EmployeeBean");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}
}
