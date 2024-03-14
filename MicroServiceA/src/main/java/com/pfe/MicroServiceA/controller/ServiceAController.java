package com.pfe.MicroServiceA.controller;

import com.pfe.MicroServiceA.services.KafkaProducerService;
import org.springframework.web.bind.annotation.*;
@RestController
public class ServiceAController {
    private KafkaProducerService kafkaProducerService;
        public ServiceAController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service A";
    }
    @PostMapping("/produce")
    public void sendMessageToKafka(@RequestBody String message) {
        kafkaProducerService.sendMessage(message);
    }
}

