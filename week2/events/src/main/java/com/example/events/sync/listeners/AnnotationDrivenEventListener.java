package com.example.events.sync.listeners;

import com.example.events.sync.customevents.GenericSpringEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenEventListener {
//    @EventListener
//    public void handleContextStart(ContextStartedEvent cse) {
//        System.out.println("Handling context started event.");
//    }
    @EventListener(condition = "#event.success")
    public void handleSuccessful(GenericSpringEvent<String> event) {
        System.out.println("Handling generic event (conditional).");
    }
}