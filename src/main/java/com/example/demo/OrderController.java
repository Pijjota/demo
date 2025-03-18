package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
}
