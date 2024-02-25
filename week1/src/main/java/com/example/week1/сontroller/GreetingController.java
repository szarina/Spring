package com.example.week1.сontroller;

import com.example.week1.model.Greeting;
import com.example.week1.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {

    GreetingService greetingService = new GreetingService();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingService.generateGreeting(name);
    }
}
