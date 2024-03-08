package com.example.task2.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AsyncListener {

    @Async
    @EventListener
    void handleAsyncEvent(String event) {
        // handle event
        log.info("Async event");
    }
}