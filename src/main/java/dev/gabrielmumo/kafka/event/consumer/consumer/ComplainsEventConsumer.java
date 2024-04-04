package dev.gabrielmumo.kafka.event.consumer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ComplainsEventConsumer {
    private static final Logger log = LoggerFactory.getLogger(ComplainsEventConsumer.class);

    @KafkaListener(topics = {"${spring.kafka.topic}"})
    public void onComplainMessage(ConsumerRecord<Integer, String> consumerRecord) {
        log.info("Received complain event: {}", consumerRecord);
    }
}
