package com.manbuegom.productspringmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductSpringMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSpringMicroserviceApplication.class, args);
	}

}
