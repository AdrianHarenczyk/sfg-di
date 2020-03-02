package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayGreeting() {
        System.out.println(greetingService.sayGreeting());
    }
}
