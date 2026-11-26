package co.istad.springmvcy2.service;

import co.istad.springmvcy2.dto.CreateUserRequest;
import co.istad.springmvcy2.dto.UserResponse;
import co.istad.springmvcy2.mapper.UserMapper;
import co.istad.springmvcy2.model.User;
import co.istad.springmvcy2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Page<UserResponse> getAllWithPaging(int pageNumber, int pageSize) {

        Pageable pageable = PageRequest.of(pageNumber, pageSize);

        return userRepository.findAll(pageable)
                .map(userMapper::mapUserToUserResponse);
    }

    @Override
    public List<UserResponse> selectAll() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::mapUserToUserResponse)
                .toList();
    }

    @Override
    public UserResponse getById(UUID id) {
        return userRepository.findById(id)
                .map(userMapper::mapUserToUserResponse)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "User with id: " + id + " not found"));
    }

}
