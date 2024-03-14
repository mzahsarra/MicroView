package com.pfe.MicroServiceB.controller;

import com.pfe.MicroServiceB.service.ServiceAClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ServiceBController {
    private ServiceAClient serviceAClient;
    public ServiceBController(ServiceAClient serviceAClient) {
        this.serviceAClient = serviceAClient;
    }
    @GetMapping("/call-service-a")
    public String getMessageFromA() {
        String messageFromA = serviceAClient.hello();
        return "Service B calling Service A : " + messageFromA;
    }

}
