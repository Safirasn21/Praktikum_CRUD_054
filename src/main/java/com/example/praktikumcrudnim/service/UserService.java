package com.example.praktikumcrudnim.service;

import com.example.praktikumcrudnim.model.dto.UserAddRequest;
import com.example.praktikumcrudnim.model.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto addUser(UserAddRequest request);
    List<UserDto> getAllUsers();
    UserDto getUserById(Long id);
    UserDto updateUser(Long id, UserAddRequest request);
    void deleteUser(Long id);
}
