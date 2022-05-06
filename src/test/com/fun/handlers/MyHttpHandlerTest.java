package com.fun.handlers;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fun.messages.Message;


public class MyHttpHandlerTest {

    MyHttpHandler handler;

    Message message;

    HttpExchange exchange;

    OutputStream outputStream;

    @Before
    public void setUp() {
        handler = new MyHttpHandler();
        message = mock(Message.class);
        exchange = mock(HttpExchange.class);
        outputStream = mock(OutputStream.class);
        when(exchange.getResponseBody()).thenReturn(outputStream);
    }

    @Test
    public void verifyThatHandlerOutputsMessage() throws IOException {
        String responseText = "Hello, world! 12345";
        when(message.getMessage()).thenReturn(responseText);
        handler.setMessage(message);
        handler.handle(exchange);
        verify(outputStream).write(responseText.getBytes());
    }
}
