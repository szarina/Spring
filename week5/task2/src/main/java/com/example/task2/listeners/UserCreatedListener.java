package com.example.task2.listeners;

import com.example.task2.events.UserCreatedEvent;
import com.example.task2.events.UserRemovedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserCreatedListener implements ApplicationListener<UserCreatedEvent>{


    @Override
    public void onApplicationEvent(UserCreatedEvent event) {
        log.info("User created event");
    }


    @EventListener(condition = "#event.name eq 'reflectoring'")
    void handleConditionalListener(UserCreatedEvent event) {
        log.info("Conditional user removed event");
    }
}
