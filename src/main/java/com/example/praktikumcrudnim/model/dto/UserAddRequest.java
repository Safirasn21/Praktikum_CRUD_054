package com.example.praktikumcrudnim.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserAddRequest {

    @NotBlank(message = "Nama wajib diisi")
    private String name;

    @NotNull(message = "Umur wajib diisi")
    @Min(value = 1, message = "Umur minimal 1")
    private Integer age;
}
