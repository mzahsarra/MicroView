package com.pfe.serviceA.service;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Properties;

@Service
public class MessageProducer_Service {

    @Value("${kafka.bootstrap.servers}")
    private String bootstrapServers;

    private KafkaProducer<String, String> producer;

    @PostConstruct
    public void initializeProducer() {
        Properties props = new Properties();
        props.put("bootstrap.servers", bootstrapServers);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        producer = new KafkaProducer<>(props);
    }

    public void sendHelloMessage() {
        String topic = "MicroView";
        try {
            producer.send(new ProducerRecord<>(topic, "message-key", "Hello: message from producer"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
