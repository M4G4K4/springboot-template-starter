package com.spring.starter.model.mapper;

import com.spring.starter.model.dto.UserRead;
import com.spring.starter.model.jpa.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserRead userToUserRead(User user);
}
