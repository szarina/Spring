package com.example.task3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class Task3Application {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(Task3Application.class, args);
	}

}
