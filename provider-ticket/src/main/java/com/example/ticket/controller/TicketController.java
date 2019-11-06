package com.example.ticket.controller;

import com.example.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    TicketService  ticketService;
    @GetMapping("/ticket")
    public String getTicket(){
        return ticketService.getTicket()+"controller:ticker";
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return ticketService.sayHello()+"controller";
    }
}
