package com.CustomerJDBC;

public class Customer {
	private Integer id;
	private String name;
	private String service;
	public Customer(Integer id, String name, String service) {
		super();
		this.id = id;
		this.name = name;
		this.service = service;
	}
	public Customer() {
	
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	

}
