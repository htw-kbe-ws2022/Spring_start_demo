package com.example.kbe.spring.demo.start;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public  com.example.kbe.spring.demo.start.Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new  com.example.kbe.spring.demo.start.Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}