package com.dev.springboot.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringBoot2KafkaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2KafkaAppApplication.class, args);
	}

}
