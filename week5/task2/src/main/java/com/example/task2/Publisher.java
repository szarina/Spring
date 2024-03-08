package com.example.task2;

import com.example.task2.events.UserCreatedEvent;
import com.example.task2.events.UserRemovedEvent;
import org.springframework.context.ApplicationEventPublisher;

public class Publisher {
    private final ApplicationEventPublisher publisher;

    Publisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    void publishEvent(final String name) {
        // Publishing event created by extending ApplicationEvent
        publisher.publishEvent(new UserCreatedEvent(this, name));
        // Publishing an object as an event
        publisher.publishEvent(new UserRemovedEvent(name));
    }
}
