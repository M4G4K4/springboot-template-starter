package com.spring.starter.web;

import com.spring.starter.model.dto.UserCreate;
import com.spring.starter.model.dto.UserRead;
import com.spring.starter.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserRead> getUser(@PathVariable("id") final Long id) {
        return new ResponseEntity<>(service.getUser(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserRead> createUser(@RequestBody @Valid final UserCreate userCreate) {
        return new ResponseEntity<>(service.createUser(userCreate), HttpStatus.OK);
    }
}
