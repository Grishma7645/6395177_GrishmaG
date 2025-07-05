package com.example;

public class HindiGreetingService implements GreetingService {
    @Override
    public void greet() {
        System.out.println("Namaste! Spring Dependency Injection mein aapka swagat hai.");
    }
}