package com.example.task1part3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Slf4j

//Annotation
@SpringBootApplication
public class Task1part3Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.task1part3");
		Store store = context.getBean(Store.class);
		log.info(store.getItem().getName());
	}

}
