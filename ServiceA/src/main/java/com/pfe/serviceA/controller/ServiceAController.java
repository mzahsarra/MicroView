package com.pfe.serviceA.controller;

import com.pfe.serviceA.service.MessageProducer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceAController {

    private final MessageProducer_Service messageProducerService;

    @Autowired
    public ServiceAController(MessageProducer_Service messageProducerService) {
        this.messageProducerService = messageProducerService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service A";
    }

    @GetMapping("/producer")
    public void ServiceProducer() {
        messageProducerService.sendHelloMessage();
    }
}



