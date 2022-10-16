package com.spring.starter.service;


import com.spring.starter.model.dto.UserRead;
import com.spring.starter.model.jpa.User;
import com.spring.starter.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public UserRead getUser(){

        final User user = new User();

        return mapper.userToUserRead(user);
    }

    public UserRead createUser (){
        final User user  = User.builder().build();

        return mapper.userToUserRead(user);
    }
}
