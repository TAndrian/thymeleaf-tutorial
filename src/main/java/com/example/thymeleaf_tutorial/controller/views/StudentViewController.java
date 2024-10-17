package com.example.thymeleaf_tutorial.controller.views;

import com.example.thymeleaf_tutorial.dto.CreateStudentDTO;
import com.example.thymeleaf_tutorial.dto.StudentDTO;
import com.example.thymeleaf_tutorial.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(path = "view/student")
@AllArgsConstructor
public class StudentViewController {

    private StudentService studentService;

    @GetMapping("/")
    public String studentView(Model model) {
        StudentDTO student = new StudentDTO(
                UUID.fromString("e6d1fbb3-6b5a-4fbd-bb2f-2a7f5bc4cdb1"),
                "Alice",
                "Smith",
                "FEMALE");
        List<StudentDTO> students = studentService.getStudents();

        model.addAttribute("student", student);
        model.addAttribute("students", students);
        return "student-view";
    }

    @GetMapping("/register")
    public String registerStudentView(Model model) {

        // Empty createStudentDTO model to store data from form.
        CreateStudentDTO studentToCreate = new CreateStudentDTO(null, null, null);

        // Gender available values.
        List<String> genderList = List.of("MALE", "FEMALE", "OTHER");

        model.addAttribute("studentToCreate", studentToCreate);
        model.addAttribute("genderList", genderList);
        return "register-student-view";
    }

    @PostMapping("/register/save")
    public String handleStudentRegistrationSubmitForm(Model model,
                                                      @ModelAttribute("studentToCreate") CreateStudentDTO studentToCreate) {
        StudentDTO student = studentService.createStudent(studentToCreate);
        model.addAttribute("student", student);
        return "registration-success-view";
    }
}
