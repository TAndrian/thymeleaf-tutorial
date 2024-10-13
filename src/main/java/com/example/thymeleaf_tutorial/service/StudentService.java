package com.example.thymeleaf_tutorial.service;

import com.example.thymeleaf_tutorial.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> getStudents();
}
