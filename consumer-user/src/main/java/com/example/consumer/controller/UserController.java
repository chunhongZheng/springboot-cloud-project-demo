package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name){
        String s="";
        s=restTemplate.getForObject("http://PROVIDER-TICKET/ticket",String.class);
        return name+"买到了"+s;
    }
    @GetMapping("/hello")
    public String sayHello(String name){
        String s="";
        s=restTemplate.getForObject("http://PROVIDER-TICKET/sayHello",String.class);
        return s;
    }
}
