package com.example.task1b;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import  com.example.task1b.Item


@Configuration
public class AppConfig {
    //Constructor based
//    @Bean
//    public Item item1() {
//        return new Item();
//    }
//
//    @Bean
//    public Store store() {
//        return new Store(item1());
//    }


    @Bean
    public Store store() {
        Store store = new Store();
        store.setItem(item1());
        return store;
    }

}
