package com.example.task3;
import org.springframework.stereotype.Component;

@FormatterType("Foo")
@Component
//@Component("fooFormatter")
public class FooFormatter implements Formatter {

    public String format() {
        return "foo";
    }

}