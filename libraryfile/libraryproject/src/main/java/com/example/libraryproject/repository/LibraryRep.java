package com.example.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libraryproject.entity.Library;

public interface LibraryRep extends JpaRepository<Library,Long> {
    
}
