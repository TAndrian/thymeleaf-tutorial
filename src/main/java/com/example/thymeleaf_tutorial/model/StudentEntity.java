package com.example.thymeleaf_tutorial.model;

import com.example.thymeleaf_tutorial.model.enums.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.UUID;


@Entity
@Table(name = "student")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    @ColumnDefault("random_uuid()")
    private UUID id;
    private String firstname;
    private String lastname;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
