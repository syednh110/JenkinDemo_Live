package com.java.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinDemoApplication {
	
	public static Logger log = LoggerFactory.getLogger(JenkinDemoApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("Application started....");
	}

	public static void main(String[] args) {
		log.info("Application started in main method... ");
		SpringApplication.run(JenkinDemoApplication.class, args);
	}

}
