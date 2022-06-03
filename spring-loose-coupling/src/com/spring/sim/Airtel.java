package com.spring.sim;

public class Airtel {
	
	public Service service;

	public Airtel(Service service) {
		this.service = service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	public void activateService() {
		service.service();
	}

}
