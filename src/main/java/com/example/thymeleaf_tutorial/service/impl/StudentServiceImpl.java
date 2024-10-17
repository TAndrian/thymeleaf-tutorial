package com.example.thymeleaf_tutorial.service.impl;

import com.example.thymeleaf_tutorial.dto.CreateStudentDTO;
import com.example.thymeleaf_tutorial.dto.StudentDTO;
import com.example.thymeleaf_tutorial.mapper.StudentMapper;
import com.example.thymeleaf_tutorial.model.StudentEntity;
import com.example.thymeleaf_tutorial.repository.StudentRepository;
import com.example.thymeleaf_tutorial.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    @Override
    public List<StudentDTO> getStudents() {
        return studentMapper.toDTOs(studentRepository.findAll());
    }

    @Override
    public StudentDTO createStudent(CreateStudentDTO createStudentDTO) {
        StudentEntity studentToCreateEntity = studentMapper.fromCreateStudentDTO(createStudentDTO);
        return studentMapper.toDTO(studentRepository.save(studentToCreateEntity));
    }
}
