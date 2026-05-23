package com.practice.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {
	@GetMapping("/docker")
	public String getMessage() {
		return "Welcome To Bangalore";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
		System.out.println("Application Has Started");
	}

}
