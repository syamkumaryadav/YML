package com.syam.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@Value("${main.fullform}")
	private String yml;
	
	
	@GetMapping("/fullform")
	public String ymlMethod() {
		return yml;
	}
	
	@Value("${messages.word}")	// @Value()----> for dynamically passing values
	private String msg;
	
	
	@GetMapping("/word")
	public String msgMethod() {
		return msg;
	}
	
	@Value("${babu.balayya}")
	private String two;
	
	
	@GetMapping("/b")
	public String twoMethod() {
		return two;
	}

}
