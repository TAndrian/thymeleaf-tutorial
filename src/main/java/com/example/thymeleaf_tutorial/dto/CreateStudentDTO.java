package com.example.thymeleaf_tutorial.dto;

public record CreateStudentDTO(
        String firstname,
        String lastname,
        String gender
) {
}
