package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Component;

@Component
public class LowerCaseMessage {
    MessageService messageService;
    public String LowerCaseMessage(MessageService messageService) {
        System.out.println( this.getClass().getName()+ " is created");
        this.messageService = messageService;
        return messageService.lowercase();
    }
}
