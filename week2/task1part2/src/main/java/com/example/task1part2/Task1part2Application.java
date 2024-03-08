package com.example.task1part2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Annotation + Autowiring
@Slf4j
@SpringBootApplication
public class Task1part2Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.task1part2");
		Store store = context.getBean(Store.class);
		log.info(store.getItem().getName());
	}

}
