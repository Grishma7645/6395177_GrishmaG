package com.example;

public class EnglishGreetingService implements GreetingService {
    @Override
    public void greet() {
        System.out.println("Hello! Welcome to Spring Dependency Injection.");
    }
}