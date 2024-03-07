package com.example.xmlbased;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Slf4j
@SpringBootApplication
public class XmlBasedApplication {

	public static void main(String[] args) {

		//SpringApplication.run(XmlBasedApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("myConfig.xml");
		Car car = context.getBean(Car.class);
		log.info(car.toString());
	}

}
