package com.myApplication.Entity;

public class Customerdata {
	
	private int customer_id;
	private String customer_name;
	private String customer_region;
	
	public Customerdata() {
		customer_id =1;
		customer_name="Dummy";
		customer_region ="APAC";
	}
	
	public Customerdata(int customer_id, String customer_name, String customer_region) {
		this.customer_id =customer_id;
		this.customer_name=customer_name;
		this.customer_region =customer_region;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_region() {
		return customer_region;
	}
	public void setCustomer_region(String customer_region) {
		this.customer_region = customer_region;
	}
	
	
		
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Customerdata [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_region="
				+ customer_region + "]";
	}
	
	
	
	
	

}
