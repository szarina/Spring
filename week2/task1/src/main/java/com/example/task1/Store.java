package com.example.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Store {

    private Item item;

    public Store() {

    }
    public Store(Item item) {
        this.item = item;
    }

    public void setItem(Item item){
        this.item = item;
    }
    public Item getItem(){
        return  this.item;
    }

}