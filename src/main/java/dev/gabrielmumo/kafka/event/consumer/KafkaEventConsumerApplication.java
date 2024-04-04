package dev.gabrielmumo.kafka.event.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaEventConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaEventConsumerApplication.class, args);
	}

}
