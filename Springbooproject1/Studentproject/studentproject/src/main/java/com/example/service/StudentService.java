package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.repository.StudentRepo;
import com.example.studentproject.entity.Student;

@Service 
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
        
        public List<Student> getAllStudents()
        { 
            return studentRepo.findAll();
    }
    
    
}
