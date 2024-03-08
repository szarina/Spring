package com.example.task2.listeners;

import com.example.task2.events.UserRemovedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRemovedListener {

    @EventListener(condition = "#event.name eq 'reflectoring'")
    void handleConditionalListener(UserRemovedEvent event) {
        // handle UserRemovedEvent
    }

//    @TransactionalEventListener(phase=TransactionPhase.AFTER_COMPLETION)
//    void handleAfterUserRemoved(UserRemovedEvent event) {
//        // handle UserRemovedEvent
//    }

}