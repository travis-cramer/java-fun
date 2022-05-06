package com.fun.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.fun.messages.Message;

import java.io.IOException;
import java.io.OutputStream;


public class MyHttpHandler implements HttpHandler {

    static String DEFAULT_RESPONSE = "Hello, world!";

    Message message;

    public MyHttpHandler() {
    }

    public void setMessage(Message _message) {
        message = _message;
    }

    public void handle(HttpExchange exchange) throws IOException {
        String responseText = (message != null) ? message.getMessage() : DEFAULT_RESPONSE;
        exchange.sendResponseHeaders(200, responseText.getBytes().length);
        OutputStream output = exchange.getResponseBody();
        output.write(responseText.getBytes());
        output.flush();
        exchange.close();
    }
}

