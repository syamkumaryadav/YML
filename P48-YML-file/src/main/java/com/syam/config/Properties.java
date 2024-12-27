package com.syam.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Data 
@Configuration 
@EnableConfigurationProperties 
@ConfigurationProperties(prefix="syam")
@ComponentScan
public class Properties {
	
	private Map<String, String> messages = new HashMap<>();	
}
