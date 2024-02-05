package com.educa.reveduca.services;

import com.educa.reveduca.repositories.AuthRepository;

public class AuthService {

    private final AuthRepository authRepository;

    public AuthService (AuthRepository authRepository){
        this.authRepository = authRepository;
    }


}
