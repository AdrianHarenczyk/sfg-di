package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
