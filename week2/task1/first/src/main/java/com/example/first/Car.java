package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;
    private Transmission transmission;
    @Autowired
    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public String toString(){
        return this.engine.engineName + " " + this.engine.velocity + " " +this.transmission.name;
    }
}