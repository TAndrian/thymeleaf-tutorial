package com.example.thymeleaf_tutorial.controller.resource.v1;

import com.example.thymeleaf_tutorial.dto.StudentDTO;
import com.example.thymeleaf_tutorial.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(
  path = "api/v1/students",
  consumes = MediaType.APPLICATION_JSON_VALUE,
  produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class StudentResourceController {

  private StudentService studentService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<StudentDTO> getStudents() {
    return studentService.getStudents();
  }
}
