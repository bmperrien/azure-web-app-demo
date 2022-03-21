package com.revature.azurewebappdemo2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boot";
    }

    @GetMapping("/")
    public String test(){
        return "Testing...";
    }

    @GetMapping("/secret")
    public String secret(){
        return "You're not supposed to be here."
    }
}
