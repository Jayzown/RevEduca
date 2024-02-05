package com.educa.reveduca.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Auth {

    @Id
    private String email;
    private String password;
}
