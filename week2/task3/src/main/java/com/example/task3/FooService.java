package com.example.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooService {

    @Autowired
    @FormatterType("Foo")
    //@Qualifier("fooFormatter")
    private Formatter formatter;

    //Autowiring by name
    // @Autowired
    //private Formatter fooFormatter;

    @Autowired
    public FooService(@FormatterType("Foo") Formatter formatter) {
        this.formatter = formatter;
    }

    @Autowired
    public void setFormatter(@FormatterType("Foo") Formatter formatter) {
        this.formatter = formatter;
    }

    public String doStuff() {
        return formatter.format();
    }

}