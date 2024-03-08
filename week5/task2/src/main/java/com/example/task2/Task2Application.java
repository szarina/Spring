package com.example.task2;

import com.example.task2.listeners.SpringBuiltInEventsListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Task2Application.class,args);

		//Testing UserCreatedListener and UserCreatedRemoved
		Publisher publisher = context.getBean(Publisher.class);
		publisher.publishEvent("Hi");
		context.close();
	}

}
