package com.nicordesigns.helloworld.model;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
 *
 */
public class MessageStore {
    
    private String message;
    
    public MessageStore() {
        message = "Hello Struts 2 User :";
    }

    public String getMessage() {
        return message;
    }

}
