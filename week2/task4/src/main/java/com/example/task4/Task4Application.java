package com.example.task4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class Task4Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Task4Application.class, args);
		Person person1 = context.getBean("personPrototype",Person.class);
		Person person2 = context.getBean("personPrototype",Person.class);
		log.info(String.valueOf(person2 == person1));


	}

}
