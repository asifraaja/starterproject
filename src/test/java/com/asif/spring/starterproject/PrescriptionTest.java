package com.asif.spring.starterproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asif.spring.starterproject.dependencycheck.Prescription;

public class PrescriptionTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/asif/spring/starterproject/dependencycheck/config.xml");
		Prescription prescription = (Prescription) ctx.getBean("PrescriptionBean");
		System.out.println(prescription.toString());
	}
}
