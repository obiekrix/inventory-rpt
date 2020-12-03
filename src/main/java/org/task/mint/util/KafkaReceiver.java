package org.task.mint.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReceiver.class);

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.consumer.group.id}")
    public void receiveMessage(Cart cart) {
        LOGGER.info("Received Kafka Message - " + cart.toString());
    }
}
