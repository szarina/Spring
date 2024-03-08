package com.example.task1part3;


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