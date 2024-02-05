package com.educa.reveduca.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Student {
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer studentId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String email;

    //Relationships
}


