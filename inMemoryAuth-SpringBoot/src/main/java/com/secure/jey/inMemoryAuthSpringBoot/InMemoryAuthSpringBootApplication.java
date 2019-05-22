package com.secure.jey.inMemoryAuthSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.secure.jey")
public class InMemoryAuthSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(InMemoryAuthSpringBootApplication.class, args);
	}

}
