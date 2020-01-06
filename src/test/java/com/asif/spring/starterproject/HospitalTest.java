package com.asif.spring.starterproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/asif/spring/starterproject/config.xml");
		Hospital hospital = (Hospital) ctx.getBean("HospitalBean");
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments());
		((ConfigurableApplicationContext)ctx).close();
	}
}
