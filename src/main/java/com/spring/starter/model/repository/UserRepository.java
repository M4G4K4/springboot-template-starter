package com.spring.starter.model.repository;

import com.spring.starter.model.jpa.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
