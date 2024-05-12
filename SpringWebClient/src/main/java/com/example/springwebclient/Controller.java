package com.example.springwebclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {



    @Value("${myapp.sayHello}")
    private String hello;

    @Value("${myapp.sayWorld}")
    private String world;

    @GetMapping("/message")
    public String getMessage() {
        return hello + " " + world;
    }
}
