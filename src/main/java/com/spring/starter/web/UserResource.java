package com.spring.starter.web;

import com.spring.starter.model.dto.UserRead;
import com.spring.starter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping("/hello")
    public ResponseEntity<UserRead> getUser() {
        return new ResponseEntity<>(service.getUser(), HttpStatus.OK);
    }

    @PostMapping("/hello")
    public ResponseEntity<UserRead> createUser() {
        return new ResponseEntity<>(service.createUser(), HttpStatus.OK);
    }
}