package io.erehsawsaltul.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	@Autowired
	Dao dao;
	
	public void init() {
		System.out.println("Initialized");
	}
	
	public void destroy() {
		System.out.println("Destroyed");
	}
	
	public void save() {
		dao.create();
	}
}
