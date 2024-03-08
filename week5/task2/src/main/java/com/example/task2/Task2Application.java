package com.example.task2;

import com.example.task2.listeners.SpringBuiltInEventsListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Task2Application.class, args);

		SpringApplication springApplication =
				new SpringApplication(Task2Application.class);
		springApplication.addListeners(new SpringBuiltInEventsListener());
		springApplication.run(args);
	}

}
