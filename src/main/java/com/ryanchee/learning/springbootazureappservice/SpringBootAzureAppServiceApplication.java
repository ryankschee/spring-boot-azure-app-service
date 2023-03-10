package com.ryanchee.learning.springbootazureappservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAzureAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzureAppServiceApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello Azure App Service!";
	}

	@GetMapping("/hello2")
	public String hello2() {
		return "Hello Azure App Service 2!";
	}
}
