package com.fun.messages;

public class Message {

    static String DEFAULT_MESSAGE = "Hello, world!";

    static String message;

    public Message(String customMessage) {
        message = customMessage;
    }
public void sayMessage() {
        System.out.println(message);
    }

    public String getMessage() {
        return (message != null) ? message : DEFAULT_MESSAGE;
    }
}
