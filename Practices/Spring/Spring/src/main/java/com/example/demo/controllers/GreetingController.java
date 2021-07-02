package com.example.demo.controllers;

import com.example.demo.models.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/humans")
public class GreetingController{

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), "Hello " + name, this.getClass().getSimpleName());
    }

    @GetMapping("/sayBay/{nombre}/{lastName}")
    public Greeting greeting2(@PathVariable("nombre") String name, @PathVariable String lastName){
        return new Greeting(counter.incrementAndGet(), "Bay " + name + " " + lastName, this.getClass().getSimpleName());
    }
}
