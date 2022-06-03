package com.spring.ioc;

public class Airtel implements Sim {
	
	public Airtel() {
		System.out.println("Airtel Sim");
	}

	@Override
	public void calling() {
		System.out.println("Calling using Airtel sim");	
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Airtel sim");
	}

}
