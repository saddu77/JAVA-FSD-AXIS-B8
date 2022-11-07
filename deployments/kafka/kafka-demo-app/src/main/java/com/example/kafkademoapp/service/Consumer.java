package com.example.kafkademoapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class Consumer {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "users",groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#####----> CONSUMED MESSAGE ---> %S",message));
       // System.out.println(String.format("#####----> CONSUMED MESSAGE ---> %S",message));
    }
}
