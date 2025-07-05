package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GreetingService greetingService() {
        return new EnglishGreetingService(); // Or use new HindiGreetingService();
    }

    @Bean
    public GreetingController greetingController() {
        return new GreetingController(greetingService());
    }
}