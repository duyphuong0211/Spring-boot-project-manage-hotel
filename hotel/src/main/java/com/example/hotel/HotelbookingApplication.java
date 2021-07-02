package com.example.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.example.hotel.*"})
@SpringBootApplication
public class HotelbookingApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(HotelbookingApplication.class, args);
	}

}
