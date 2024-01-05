package com.stackjava.springbootdemo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemo5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo5Application.class, args);
	}

	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
