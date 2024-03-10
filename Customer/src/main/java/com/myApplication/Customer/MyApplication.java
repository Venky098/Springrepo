package com.myApplication.Customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myApplication.Entity.Customerdata;
import com.myApplication.Service.CustomerServiceImpl;

@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		//
		System.out.println("Hi This is Spring Application");
		
		CustomerServiceImpl csi = new CustomerServiceImpl();
		Customerdata cd = new Customerdata();
		csi.createCustomer(cd);
	}

}
