package com.example.events.sync.listeners;

import com.example.events.sync.CustomSpringEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.transaction.event.TransactionPhase;

@Component
public class TransactionListener {

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void handleCustom(CustomSpringEvent event) {
        System.out.println("Handling event inside a transaction BEFORE COMMIT.");
    }
}
