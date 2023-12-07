package com.segovelo.customers;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CustomersApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomersApplication.class);

	public static void main(String[] args) {
		try {
			ApplicationContext ctx = SpringApplication.run(CustomersApplication.class, args);

			Environment environment = ctx.getEnvironment();
			
	        System.out.println("Let's inspect the beans provided by Spring Boot:");
	
	        String[] beanNames = ctx.getBeanDefinitionNames();
	        Arrays.sort(beanNames);
	        for (String beanName : beanNames) {
	            System.out.println("\t" +beanName);
	        }
	  
	        logger.info("Customers Application started successfully !");
	        logger.info(
	            "Application listening on port: {}", environment.getProperty("local.server.port"));

		} catch(Exception ex) {
		      logger.error("Customers Application failed :( *** ", ex);
		      throw new RuntimeException();			
		}

	}

}
