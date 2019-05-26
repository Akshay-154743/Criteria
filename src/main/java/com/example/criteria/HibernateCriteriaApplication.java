package com.example.criteria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HibernateCriteriaApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HibernateCriteriaApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HibernateCriteriaApplication.class);
	}
}
