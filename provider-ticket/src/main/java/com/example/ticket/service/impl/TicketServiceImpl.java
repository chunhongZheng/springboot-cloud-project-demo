package com.example.ticket.service.impl;

import com.example.ticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String sayHello() {
        return "hello8003";
    }

    @Override
    public String watchTV() {
        return "watchTV";
    }

    @Override
    public String getTicket() {
        System.out.println("8003");
        return "中国梦8003";
    }
}
