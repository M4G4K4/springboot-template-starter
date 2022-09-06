package com.spring.starter.web;

import com.spring.starter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloResource {

    @Autowired
    private HelloService service;

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    @PostMapping("/hello")
    public ResponseEntity<String> postHello() {
        return new ResponseEntity<>(service.giveHello(), HttpStatus.OK);
    }
}
