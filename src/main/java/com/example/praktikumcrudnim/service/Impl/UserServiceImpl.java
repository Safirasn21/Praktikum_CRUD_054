package com.example.praktikumcrudnim.service.Impl;

import com.example.praktikumcrudnim.mapper.UserMapper;
import com.example.praktikumcrudnim.model.dto.UserAddRequest;
import com.example.praktikumcrudnim.model.dto.UserDto;
import com.example.praktikumcrudnim.model.entity.User;
import com.example.praktikumcrudnim.repository.UserRepository;
import com.example.praktikumcrudnim.service.UserService;
import com.example.praktikumcrudnim.util.ValidationUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final ValidationUtil validationUtil;

    @Override
    public UserDto addUser(UserAddRequest request) {
        validationUtil.validate(request);
        User user = userMapper.toEntity(request);
        User savedUser = userRepository.save(user);
        return userMapper.toDto(savedUser);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .toList();
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = findUserById(id);
        return userMapper.toDto(user);
    }

    @Override
    public UserDto updateUser(Long id, UserAddRequest request) {
        validationUtil.validate(request);
        User user = findUserById(id);
        userMapper.updateEntityFromRequest(request, user);
        User updatedUser = userRepository.save(user);
        return userMapper.toDto(updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
        User user = findUserById(id);
        userRepository.delete(user);
    }

    private User findUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User tidak ditemukan dengan ID: " + id));
    }
}
