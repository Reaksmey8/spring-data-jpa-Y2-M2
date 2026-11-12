package co.istad.springmvcy2.service;


import co.istad.springmvcy2.dto.CreateUserRequest;
import co.istad.springmvcy2.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<User> selectAll();

    User getById(UUID id);

    void deleteById(UUID id);

    User createNewUser(CreateUserRequest createUserRequest);

}

