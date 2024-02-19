package com.tu.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class TuAppApplication {
	private static final Logger log = LoggerFactory.getLogger(TuAppApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TuAppApplication.class, args);
		log.debug("Application is up and running");
	}

}
