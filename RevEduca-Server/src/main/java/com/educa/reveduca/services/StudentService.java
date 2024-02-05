package com.educa.reveduca.services;

import com.educa.reveduca.entities.Student;
import com.educa.reveduca.repositories.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional(Transactional.TxType.REQUIRED)
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student findByEmail(String email){
        Optional<Student> student = studentRepository.findByEmail(email);
        if (student.isEmpty()){
            throw new RuntimeException();
        }
        return student.get();
    }

    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }
}
