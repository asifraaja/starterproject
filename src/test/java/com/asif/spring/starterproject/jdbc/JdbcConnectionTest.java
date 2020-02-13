package com.asif.spring.starterproject.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcConnectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/asif/spring/starterproject/jdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String query = "insert into movies values (?,?,?)";
		int rowsAffected = jdbcTemplate.update(query, "024192e8-dc97-4c3d-8c83-4233dc225e63", "Kabir Singh", "3.8");
		System.out.println("Number of row affects due to insert : " + rowsAffected);
	}
}
