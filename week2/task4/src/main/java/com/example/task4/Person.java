package com.example.task4;

import lombok.Getter;

public class Person {
    @Getter
    private String name;

    public Person() {
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