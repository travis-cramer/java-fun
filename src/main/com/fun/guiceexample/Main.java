package com.fun.guiceexample;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

public class Main {

    @Inject
    private HelloWorldService service;

    public static void main(String[] args) {
        Main main = new Main();
        Module module = new HelloWorldModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(main);

        main.testGuice();
    }

    public void testGuice() {
        service.sayHello();
    }
}
