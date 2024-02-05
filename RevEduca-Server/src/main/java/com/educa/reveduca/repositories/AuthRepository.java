package com.educa.reveduca.repositories;

import com.educa.reveduca.entities.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, String> {
}
