package com.educa.reveduca.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="program_id")
    private Integer programId;

    @Column(name = "program_name")
    private String programName;

    private Integer durationInMonths;

    //Relationships
}
