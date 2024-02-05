package com.educa.reveduca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ContentActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contentActivityId;

    private String type;  //labs, assignment, quiz

    //Relationships to questions OneToMany

}
