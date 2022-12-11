package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Component;

@Component
public class Message {

    String message = "Hello, Spring!";
    public Message(){
        System.out.println( this.getClass().getName()+ " is created");
    }

    public String getMessage() {
        return message;
    }
}
