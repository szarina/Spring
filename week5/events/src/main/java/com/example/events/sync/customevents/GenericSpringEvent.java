package com.example.events.sync.customevents;

public class GenericSpringEvent <T>{
    private T what;
    protected boolean success;

    public GenericSpringEvent(T what) {;
        this.what = what;
        this.success = success;
    }
    public T getWhat() {
        return what;
    }

    public boolean isSuccess() {
        return success;
    }

}
