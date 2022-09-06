package com.spring.starter.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String giveHello(){
        return "Hello";
    }
}
