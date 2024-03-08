package com.example.task2.listeners;

import com.example.task2.events.UserRemovedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.transaction.event.TransactionPhase;
@Slf4j
@Component
public class UserRemovedListener {

    @EventListener(condition = "#event.name eq 'reflectoring'")
    void handleConditionalListener(UserRemovedEvent event) {
        log.info("Conditional user removed event");
    }

    @TransactionalEventListener(phase=TransactionPhase.AFTER_COMPLETION)
    void handleAfterUserRemoved(UserRemovedEvent event) {
        log.info("User removed event");
    }

}