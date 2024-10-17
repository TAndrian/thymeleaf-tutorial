package com.example.thymeleaf_tutorial.mapper;

import com.example.thymeleaf_tutorial.dto.CreateStudentDTO;
import com.example.thymeleaf_tutorial.dto.StudentDTO;
import com.example.thymeleaf_tutorial.model.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    List<StudentDTO> toDTOs(List<StudentEntity> studentEntities);

    StudentDTO toDTO(StudentEntity studentEntities);

    StudentEntity fromCreateStudentDTO(CreateStudentDTO createStudentDTO);
}
