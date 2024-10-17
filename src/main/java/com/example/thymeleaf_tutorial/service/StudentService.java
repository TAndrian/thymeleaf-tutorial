package com.example.thymeleaf_tutorial.service;

import com.example.thymeleaf_tutorial.dto.CreateStudentDTO;
import com.example.thymeleaf_tutorial.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    /**
     * Get students.
     *
     * @return students.
     */
    List<StudentDTO> getStudents();

    /**
     * Create student.
     *
     * @param createStudentDTO DTO which contains student's data.
     * @return created student.
     */
    StudentDTO createStudent(CreateStudentDTO createStudentDTO);
}
