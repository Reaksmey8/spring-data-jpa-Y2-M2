package co.istad.springmvcy2.controller;

import co.istad.springmvcy2.dto.CreateUserRequest;
import co.istad.springmvcy2.dto.PatchUserRequest;
import co.istad.springmvcy2.dto.UpdateUserRequest;
import co.istad.springmvcy2.dto.UserResponse;
import co.istad.springmvcy2.model.User;
import co.istad.springmvcy2.repository.UserRepository;
import co.istad.springmvcy2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping
    public List<User> getAllUser(){
        return userService.selectAll();
    }

    @GetMapping("{id}")
    public User getUserById(
            @PathVariable UUID id
    ){
        return userService.getById(id);
    }

    @PutMapping("{id}")
    public User updateUser(
            @RequestBody UpdateUserRequest updateUserRequest,
            @PathVariable Integer id
    ){
        return null;
    }

    @PatchMapping("{id}")
    public UserResponse patchById(
            @RequestBody PatchUserRequest patchUserRequest,
            @PathVariable Integer id
    ){
        return null;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void  deleteUserById(
            @PathVariable UUID id
    ){
        userService.deleteById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createNewUser(
            @RequestBody CreateUserRequest createUserRequest
    ){
        return userService.createNewUser(createUserRequest);
    }
}
