package com.example.events;

import com.example.events.sync.CustomSpringEventPublisher;
import com.example.events.sync.customevents.GenericSpringEvent;
import com.example.events.sync.listeners.AnnotationDrivenEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EventsApplication.class, args);

		//Testing annotation listener
		AnnotationDrivenEventListener eventListener = context.getBean(AnnotationDrivenEventListener.class);
		eventListener.handleSuccessful(new GenericSpringEvent<>("Test"));

		//testing Custom listener
		CustomSpringEventPublisher eventPublisher = context.getBean(CustomSpringEventPublisher.class);
		eventPublisher.publishCustomEvent("Test message");

		context.close();

	}

}
