   package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentproject.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
