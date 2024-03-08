package com.example.task2.events;

import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {
    public String name;
    public UserCreatedEvent(Object source,String name) {
        super(source);
        this.name = name;
    }

}
