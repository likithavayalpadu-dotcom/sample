package com.example.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libraryproject.entity.Book;

public interface BookRepos extends JpaRepository<Book, Long>{

    
}