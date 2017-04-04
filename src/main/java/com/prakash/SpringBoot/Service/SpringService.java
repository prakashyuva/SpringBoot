package com.prakash.SpringBoot.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SpringService {

	public Map<String,String> getWelcome(){
		Map<String, String> customer = new HashMap<String, String>();
		customer.put("CustomerId", "1");
		customer.put("CellPhoneModel","iphone7");
		return customer;
	}
	
	public String addCustomer(){
		
		
		return "successfully added";
	}
}
