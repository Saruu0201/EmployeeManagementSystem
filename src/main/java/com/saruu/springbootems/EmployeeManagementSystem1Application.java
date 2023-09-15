package com.saruu.springbootems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.saruu.springbootems.entities", "com.saruu.springbootems.controller","com.saruu.springbootems.services", "com.saruu.springbootems.repository"})
@EnableJpaRepositories(basePackages = "com.saruu.springbootems.repository")
public class EmployeeManagementSystem1Application {
// This is my first Spring Boot Application
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystem1Application.class, args);
	}

}
