package com.example.myprojects.customized_skincare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CustomizedSkincareApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CustomizedSkincareApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomizedSkincareApplication.class, args);
	}

}
