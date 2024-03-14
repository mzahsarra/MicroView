package com.pfe.serviceC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServiceCApplication {

    private final RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        SpringApplication.run(ServiceCApplication.class, args);
    }


    @GetMapping("/call-service-b")
    public String callServiceB() {
        String serviceBResponse = restTemplate.getForObject("http://localhost:8081/api/call-service-a", String.class);
        return "Service C calling Service B: " + serviceBResponse;
    }
}
