package com.example.DreamTeam.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class TestingWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TestingWebApplication.class, args);
	 }	
		 @Override
		    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		        return builder.sources(TestingWebApplication.class);
		    }
	}

