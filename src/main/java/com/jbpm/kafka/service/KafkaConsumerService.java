package com.jbpm.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "jbpm-topic", groupId = "my-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
        // Process the message here
    }
}
