package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    Message message;

    public MessageService(Message message){
        System.out.println( this.getClass().getName()+ " is created");
        this.message = message;
    }

    public String uppercase(){
        return message.getMessage().toUpperCase();
    }

    public String lowercase(){
        return message.getMessage().toLowerCase();
    }
}
