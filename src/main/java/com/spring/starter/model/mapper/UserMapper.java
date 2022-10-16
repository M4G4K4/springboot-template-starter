package com.spring.starter.model.mapper;

import com.spring.starter.model.dto.UserRead;
import com.spring.starter.model.jpa.User;
import org.mapstruct.Mapper;

@Mapper
public abstract class UserMapper {
    public abstract UserRead userToUserRead(User user);
}
