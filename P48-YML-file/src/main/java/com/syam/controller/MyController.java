package com.syam.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syam.config.Properties;


@RestController
public class MyController {
	
	@Autowired
	private Properties props;
	
	@GetMapping("/welcome") 
	 public String getWelcomeMsg() { 
	  Map<String, String> messages = props.getMessages(); 
	  String value = messages.get("welcomeMsg"); 
	  return value; 
	 } 
	
	@GetMapping("greet")
	public String getGreetMeg() {
		return props.getMessages().get("greetMsg");
		 
	}
	

}
