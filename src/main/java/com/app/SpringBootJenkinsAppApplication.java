package com.app;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsAppApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsAppApplication.class);
	
	@PostConstruct
	public void initMethod() {
	logger.info("=== inside method init ====");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsAppApplication.class, args);
		logger.info("==== running SpringBootJenkinsAppApplication ...");
	}

}
