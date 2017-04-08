package com.smallapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.smallapp")
@EnableAutoConfiguration
public class SmallAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallAppApplication.class, args);
	}
}
