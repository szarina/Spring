package com.example.task1part2;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;




public class Store {
    @Autowired
    private Item item;

    public Item getItem(){
        return  this.item;
    }

    public Store(Item item) {
        this.item = item;
    }

}