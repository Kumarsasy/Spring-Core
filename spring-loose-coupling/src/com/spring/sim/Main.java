package com.spring.sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-sim.xml");
		Airtel air = context.getBean("airtel", Airtel.class);
		
		air.activateService();
	}
}
