package com.konopka.testingsimpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestingSimpleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingSimpleAppApplication.class, args);
	}


	@RestController
	public class HelloController {

		@GetMapping("/")
		public String hello() {
			return "Hello World";
		}
	}

}
