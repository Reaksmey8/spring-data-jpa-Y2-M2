package co.istad.springmvcy2.service;


import co.istad.springmvcy2.dto.CreateUserRequest;
import co.istad.springmvcy2.dto.UserResponse;
import co.istad.springmvcy2.model.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<UserResponse> selectAll();

    UserResponse getById(UUID id);

    Page<UserResponse> getAllWithPaging(int pageNumber, int pageSize);


//
//    void deleteById(UUID id);
//
//    User createNewUser(CreateUserRequest createUserRequest);

}

