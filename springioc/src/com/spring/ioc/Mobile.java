package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config file loaded...");
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
//		Airtel air = context.getBean("airtel", Airtel.class);
//		air.calling();
//		air.data();
		
//		Airtel air = (Airtel) context.getBean("airtel");
//		air.calling();
//		air.data();
		
		
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
//		
//		Sim sim = new Jio();
//		sim.calling();
//		sim.data();
	}

}
