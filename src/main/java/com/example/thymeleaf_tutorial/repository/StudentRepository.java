package com.example.thymeleaf_tutorial.repository;

import com.example.thymeleaf_tutorial.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<StudentEntity, UUID> {
}
