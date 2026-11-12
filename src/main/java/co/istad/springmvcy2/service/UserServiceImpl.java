package co.istad.springmvcy2.service;

import co.istad.springmvcy2.dto.CreateUserRequest;
import co.istad.springmvcy2.model.User;
import co.istad.springmvcy2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public List<User> selectAll() {
        return userRepository.selectAll();
    }

    @Override
    public User getById(UUID id) {
        return userRepository.selectById(id)
                .orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
        userRepository.removeById(id);
    }

    @Override
    public User createNewUser(CreateUserRequest createUserRequest) {
        return userRepository.createNewUser(createUserRequest);
    }



}
