package com.educa.reveduca.controllers;

import com.educa.reveduca.entities.Student;
import com.educa.reveduca.services.StudentService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController (StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping(path = "/add-student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student, HttpServletResponse response){
        return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.OK);
    }

    @GetMapping(path = "/get-student")
    ResponseEntity<Student> getStudent(@RequestBody String email, HttpServletResponse response){
        return new ResponseEntity<>(studentService.findByEmail(email), HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete-student")
    public void deleteStudent(@RequestBody Student student, HttpServletResponse response){
        studentService.deleteStudent(student);
    }
}
