package com.example.annotationconf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Slf4j
@SpringBootApplication
public class AnnotationConfApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AnnotationConfApplication.class, args);
//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ApplicationContext context = SpringApplication.run(AnnotationConfApplication.class, args);
        Car car = context.getBean(Car.class);
        log.info(car.toString());

    }

}
