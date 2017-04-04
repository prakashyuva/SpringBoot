package com.prakash.SpringBoot.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.SpringBoot.Service.SpringService;

@RestController
public class SpringController {

	@Autowired
	public SpringService springService;

	@RequestMapping(value="/welcome")
	public 	Map<String,String> welcome(){
		return springService.getWelcome();
	}
	
	@RequestMapping(value="/addcustomer")
	public 	String add(){
		return springService.addCustomer();
	}
	
}
