package com.kit.webService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Eldest on 06.10.2016.
 */

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greetings greetings(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greetings(counter.incrementAndGet(), String.format(template, name));
    }
}
