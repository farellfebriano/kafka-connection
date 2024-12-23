package com.example.producer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/hello")
    public String home() {
        System.out.println("Hello im producer");
        return "Hello im producer";
    }
    @RequestMapping("/send")
    public String sendMessage() {
        try {
            kafkaTemplate.send("test", "producer is alive");
            System.out.println("Message sent to Kafka");
        } catch (Exception e) {
            System.out.println("Error sending message: " + e.getMessage());
        }
        return "Message sent";
    }

}
