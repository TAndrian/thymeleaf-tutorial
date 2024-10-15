package com.example.thymeleaf_tutorial.controller.views;

import com.example.thymeleaf_tutorial.dto.StudentDTO;
import com.example.thymeleaf_tutorial.model.enums.Gender;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping(path = "view/students")
@AllArgsConstructor
public class StudentViewController {


    @GetMapping("/student")
    public String studentsTemplate(Model model) {
        StudentDTO student = new StudentDTO(UUID.fromString("e6d1fbb3-6b5a-4fbd-bb2f-2a7f5bc4cdb1"), "Alice", "Smith", Gender.FEMALE);

        model.addAttribute("student", student);
        return "student-view";
    }
}
