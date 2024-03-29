package com;	

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SlowcampusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlowcampusApplication.class, args);
	}

}
//http://localhost:8080/swagger-ui.html