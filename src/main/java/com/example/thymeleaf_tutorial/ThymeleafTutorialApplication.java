package com.example.thymeleaf_tutorial;

import com.example.thymeleaf_tutorial.model.StudentEntity;
import com.example.thymeleaf_tutorial.model.enums.Gender;
import com.example.thymeleaf_tutorial.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.UUID;

@SpringBootApplication
public class ThymeleafTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafTutorialApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(StudentRepository studentRepository) {
        return args -> {
            StudentEntity student1 = new StudentEntity(UUID.fromString("e6d1fbb3-6b5a-4fbd-bb2f-2a7f5bc4cdb1"), "Alice", "Smith", Gender.FEMALE);
            StudentEntity student2 = new StudentEntity(UUID.fromString("1b6d4a2e-8bcf-4af7-90d3-8e0b7d3e1629"), "Bob", "Johnson", Gender.MALE);
            StudentEntity student3 = new StudentEntity(UUID.fromString("9b2a3edc-4e77-45a5-815f-dc81d3a7c4fa"), "Charlie", "Brown", Gender.MALE);
            StudentEntity student4 = new StudentEntity(UUID.fromString("d8d9a3c2-47c2-44f3-92e9-4a3a4cf1c813"), "Dana", "Davis", Gender.FEMALE);
            StudentEntity student5 = new StudentEntity(UUID.fromString("fa5a9147-8659-4e57-8423-7d013be2c60e"), "Eliot", "Garcia", Gender.OTHER);

            studentRepository.saveAll(Arrays.asList(student1, student2, student3, student4, student5));
        };
    }
}
