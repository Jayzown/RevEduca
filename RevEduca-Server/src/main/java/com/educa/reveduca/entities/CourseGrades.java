package com.educa.reveduca.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class CourseGrades {

    private Integer studentId;
    private Integer courseId;
    private Character grade;
    private String semester;  //example Spring2022
}
