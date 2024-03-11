package com.example.task4;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Person {
    @Getter
    private String name;

    public Person() {
        log.info("i'm here!");
    }

    public Person(final String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    public void setName(String name) {
        this.name = name;
    }
}