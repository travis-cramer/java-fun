package com.fun.guiceexample;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Guice injection works!");
    }
}
