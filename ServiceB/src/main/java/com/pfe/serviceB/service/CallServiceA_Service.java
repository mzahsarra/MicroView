package com.pfe.serviceB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallServiceA_Service {

    private final RestTemplate restTemplate;

    @Autowired
    public CallServiceA_Service(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String callServiceA() {
        String serviceAResponse = restTemplate.getForObject("http://localhost:8080/api/hello", String.class);
        return "Service B calling Service A: " + serviceAResponse;
    }
}

