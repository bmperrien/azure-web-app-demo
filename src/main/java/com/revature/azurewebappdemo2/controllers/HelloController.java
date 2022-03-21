package com.revature.azurewebappdemo2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public void hello(){
        System.out.println("Hello from Spring Boot");
    }
}
