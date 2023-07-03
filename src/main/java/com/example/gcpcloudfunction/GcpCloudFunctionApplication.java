package com.example.gcpcloudfunction;

import com.example.gcpcloudfunction.model.PubSubMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class GcpCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpCloudFunctionApplication.class, args);
	}


	@Bean
	public Consumer<PubSubMessage> pubSubFunction() {
		return message -> System.out.println("The Pub/Sub message data: " + message.getData());
	}
}
