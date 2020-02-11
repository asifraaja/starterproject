package com.asif.spring.starterproject.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	static void byTypeTest(ApplicationContext ctx) {
		EmployeeByType ebt = (EmployeeByType) ctx.getBean("employee");
		System.out.println(ebt.toString());
	}
	
	static void byNameTest(ApplicationContext ctx) {
		EmployeeByName ebt = (EmployeeByName) ctx.getBean("employeeByName");
		System.out.println(ebt.toString());
	}
	
	static void byConstructorTest(ApplicationContext ctx) {
		EmployeeByConstructor ebt = (EmployeeByConstructor) ctx.getBean("employeeByConstructor");
		System.out.println(ebt.toString());
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/asif/spring/starterproject/autowiring/config.xml");
		byConstructorTest(ctx);
	}
}
