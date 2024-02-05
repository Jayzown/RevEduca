package com.educa.reveduca.repositories;

import com.educa.reveduca.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM students WHERE email=1?")
    Optional<Student> findByEmail(String email);
}
