package com.example.task1part3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Item item1() {
        return new ItemImpl1(); // Assuming ItemImpl1 is your concrete implementation
    }

    @Bean
    public Store store(Item item) { // Use method parameter for dependency injection
        return new Store(item);
    }

//    @Bean
//    public Store store() {
//        Store store = new Store();
//        store.setItem(item1());
//        return store;
//    }
}