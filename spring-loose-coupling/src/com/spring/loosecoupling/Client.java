package com.spring.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml loaded");
		
		Student stu = context.getBean("student", Student.class);
		stu.cheating();
		
	}
}
