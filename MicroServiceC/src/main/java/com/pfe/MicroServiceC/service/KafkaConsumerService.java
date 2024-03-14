package com.pfe.MicroServiceC.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "MicroView", groupId = "group_id_MS_C")
    public void listenGroup2(String message) {
        System.out.println("Received Message: " + message);
    }
}
