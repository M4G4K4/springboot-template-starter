package com.spring.starter.service;


import com.spring.starter.model.dto.UserCreate;
import com.spring.starter.model.dto.UserRead;
import com.spring.starter.model.jpa.User;
import com.spring.starter.model.mapper.UserMapper;
import com.spring.starter.model.repository.UserRepository;
import com.spring.starter.utilities.exceptions.ErrorCode;
import com.spring.starter.utilities.exceptions.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    protected UserMapper mapper;

    @Autowired
    protected UserRepository repository;

    public UserRead getUser(final Long id) {

        final User user = repository.findById(id).orElseThrow(() -> new ServiceException(ErrorCode.USER_NOT_FOUND));

        return mapper.userToUserRead(user);
    }

    @Transactional
    public UserRead createUser(final UserCreate userCreate) {

        final User user = User.builder()
                .name(userCreate.getName())
                .age(userCreate.getAge())
                .build();

        final User userSave = repository.save(user);

        return mapper.userToUserRead(userSave);
    }
}
