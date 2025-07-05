package com.example;

public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sendGreeting() {
        greetingService.greet();
    }
}