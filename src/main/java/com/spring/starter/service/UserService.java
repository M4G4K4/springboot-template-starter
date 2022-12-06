package com.spring.starter.service;


import com.spring.starter.model.dto.UserCreate;
import com.spring.starter.model.dto.UserRead;
import com.spring.starter.model.jpa.User;
import com.spring.starter.model.mapper.UserMapper;
import com.spring.starter.model.repository.UserRepository;
import com.spring.starter.utilities.exceptions.ErrorCode;
import com.spring.starter.utilities.exceptions.ServiceException;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class UserService {

    @Autowired
    protected UserMapper mapper;

    @Autowired
    protected UserRepository repository;

    public UserRead getUser(final Long id) {
        log.debug("Getting user with Id: {}", id);

        final User user = repository.findById(id).orElseThrow(() -> new ServiceException(ErrorCode.USER_NOT_FOUND));

        return mapper.userToUserRead(user);
    }

    @Transactional
    public UserRead createUser(final UserCreate userCreate) {
        log.info("Creating new user");

        final User user = User.builder()
                .name(userCreate.getName())
                .age(userCreate.getAge())
                .build();

        final User userSave = repository.save(user);

        return mapper.userToUserRead(userSave);
    }
}
