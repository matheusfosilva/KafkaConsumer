package com.example.consumerKafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotifyRequestConsumer {

    @KafkaListener(
            topics = "${topics.notify.request.topic}",
            groupId = "notify-request-consumer-1"
    )
    public void consume(String message) {
        System.out.println("Messaging receive: "+ message);
    }
}
