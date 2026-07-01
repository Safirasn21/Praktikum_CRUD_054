package com.example.praktikumcrudnim.mapper;

import com.example.praktikumcrudnim.model.dto.UserAddRequest;
import com.example.praktikumcrudnim.model.dto.UserDto;
import com.example.praktikumcrudnim.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserAddRequest request);
    void updateEntityFromRequest(UserAddRequest request, @MappingTarget User user);
}
