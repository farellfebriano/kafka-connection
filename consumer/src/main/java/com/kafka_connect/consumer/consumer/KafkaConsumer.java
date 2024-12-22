package com.kafka_connect.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test")
    public void processMessage(String content) {
        System.out.println("received: "+ content);
    }
}
