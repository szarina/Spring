//package com.example.events.sync.listeners;
//
//import com.example.events.sync.customevents.GenericSpringEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.lang.NonNull;
//import org.springframework.stereotype.Component;
//
//@Component
//public class GenericSpringEventListener
//        implements ApplicationListener<GenericSpringEvent<String>> {
//    @Override
//    public void onApplicationEvent(@NonNull GenericSpringEvent<String> event) {
//        System.out.println("Received spring generic event - " + event.getWhat());
//    }
//}