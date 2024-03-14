package com.pfe.MicroServiceC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroServiceCApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceCApplication.class, args);
	}
}
