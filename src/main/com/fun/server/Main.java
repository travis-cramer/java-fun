package com.fun.server;

import com.sun.net.httpserver.HttpServer;
import com.fun.handlers.MyHttpHandler;
import com.fun.messages.Goodbye;
import com.fun.messages.Hello;
import com.fun.messages.Message;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        final String customMessage = (args.length == 0) ? "No message was given in args." : args[0];
        final Message message = new Message(customMessage);
        Hello.sayHello();
        message.sayMessage();
        Goodbye.sayGoodbye();
        final HttpServer server = HttpServer.create(
                new InetSocketAddress("localhost", 8080), 0);
        server.createContext("/hello", new MyHttpHandler());
        server.start();
    }
}
