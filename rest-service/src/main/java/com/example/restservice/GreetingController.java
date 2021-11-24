package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "The Average word length of the sentence is, %s!";
    private final AtomicLong counter = new AtomicLong();

    // /greeting?name=Glen will print "hello Glen"
    @GetMapping("/")
    public Greeting greeting(@RequestParam(value = "sentence", defaultValue = "0") String sentence){
        Greeting ouput = new Greeting(counter.incrementAndGet(), String.format(template,sentence));
        counter.decrementAndGet();
        double avg = ouput.getAverageLength(sentence);
        return new Greeting(counter.incrementAndGet(),String.format(template,avg));
    }





}