package com.example.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libraryproject.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {
    
}
