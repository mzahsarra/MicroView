package com.pfe.serviceB.controller;

import com.pfe.serviceB.service.MessageConsumer_Service;
import com.pfe.serviceB.service.CallServiceA_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceBController {

    private final MessageConsumer_Service messageConsumerService;

    private final CallServiceA_Service callServiceAService;

    @Autowired
    public ServiceBController(MessageConsumer_Service messageConsumerService, CallServiceA_Service callServiceAService) {
        this.messageConsumerService = messageConsumerService;
        this.callServiceAService = callServiceAService;
    }

    @GetMapping("/call-service-a")
    public String callServiceA() {
        return callServiceAService.callServiceA();
    }

    @GetMapping("/consumer")
    public void consumeMessages() {
        messageConsumerService.consumeMessages();
    }
}
