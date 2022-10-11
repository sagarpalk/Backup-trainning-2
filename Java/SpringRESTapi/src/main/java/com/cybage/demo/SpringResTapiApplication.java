package com.cybage.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cybage")
public class SpringResTapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringResTapiApplication.class, args);
	}

}
