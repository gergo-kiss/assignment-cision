package com.cision.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class AssignmentApp {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApp.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
