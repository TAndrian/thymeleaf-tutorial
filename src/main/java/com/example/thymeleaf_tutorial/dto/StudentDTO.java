package com.example.thymeleaf_tutorial.dto;

import com.example.thymeleaf_tutorial.model.enums.Gender;

import java.util.UUID;

public record StudentDTO(
        UUID id,
        String firstname,
        String lastname,
        Gender gender
) {
}
