package com.educa.reveduca.controllers;

import com.educa.reveduca.services.AuthService;
import org.springframework.web.bind.annotation.PostMapping;

public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

//    @PostMapping(path = "/auth")

}
