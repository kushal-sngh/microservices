package net.kushal.application.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"net.kushal.application.controllers"})
public class RestBootApp {

	public static void main(String args[]){		
		SpringApplication.run(RestBootApp.class, args);		
	}
	
}
