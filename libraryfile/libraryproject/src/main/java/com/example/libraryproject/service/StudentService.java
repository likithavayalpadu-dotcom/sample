package com.example.libraryproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.libraryproject.entity.Student;
import com.example.libraryproject.repository.StudentRepo;

@Service 
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
        
    }

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }
    
}
