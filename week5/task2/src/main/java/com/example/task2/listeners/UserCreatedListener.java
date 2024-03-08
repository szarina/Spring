package com.example.task2.listeners;

import com.example.task2.events.UserCreatedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedListener implements ApplicationListener<UserCreatedEvent>{


    @Override
    public void onApplicationEvent(UserCreatedEvent event) {

    }
}
