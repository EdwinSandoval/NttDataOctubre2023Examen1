package com.example.primerExamenv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class PrimerExamenv1Application {

	public static void main(String[] args) {
		SpringApplication.run(PrimerExamenv1Application.class, args);
	}

}
