package com.example.task3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Slf4j
@SpringBootApplication
public class Task3Application {

    public static void main(String[] args) {
        //SpringApplication.run(Task3Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        FooService fooService = ctx.getBean(FooService.class);
        log.info(fooService.doStuff());

    }

}
