package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Component;

@Component
public class UpperCaseMessage {
    MessageService messageService;
    public String UpperCaseMessage(MessageService messageService) {
        System.out.println( this.getClass().getName()+ " is created");
        this.messageService = messageService;
        return messageService.uppercase();
    }
}
