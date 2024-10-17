package com.example.thymeleaf_tutorial.dto;

import java.util.UUID;

public record StudentDTO(
        UUID id,
        String firstname,
        String lastname,
        String gender
) {
}
