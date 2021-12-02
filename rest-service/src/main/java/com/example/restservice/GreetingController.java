package com.example.restservice;


import javax.servlet.http.HttpServletResponse;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import java.util.concurrent.atomic.AtomicLong;
@RestController
public class GreetingController {

    //private static final String template = "The Average word length of the sentence is, %s!";
    //private final AtomicLong counter = new AtomicLong();
    //commit test
    // /greeting?name=Glen will print "hello Glen"
    @GetMapping("/")
    public Greeting greeting(@RequestParam(required = false, value = "sentence", defaultValue = "0") String sentence, HttpServletResponse response){
        //Greeting ouput = new Greeting(counter.incrementAndGet(), String.format(template,sentence));
        //counter.decrementAndGet();
       // double avg = ouput.getAverageLength(sentence);
        //System.out.println(avg);
        //System.out.println(sentence);
        //example localhost:8080/?sentence=test hello = 4.5

        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Content-type","application/json");


        Greeting dummy = new Greeting(sentence, 5);
        double avg = dummy.getAverageLength(sentence);
        Greeting output = new Greeting(sentence, avg);
        
        return output;




        //return new Greeting(counter.incrementAndGet(),String.format(template,avg));
    }





}