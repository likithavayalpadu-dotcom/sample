package com.example.libraryproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.libraryproject.entity.Book;
import com.example.libraryproject.repository.BookRepos;

@Service 
public class BookService {

    private final BookRepos bookRepos;

public BookService(BookRepos bookRepos) {
        this.bookRepos = bookRepos;
    }

    //save Book
    public List<Book> saveBookp(List<Book> book){
        return bookRepos.saveAll(book);
    }
    
    //Get- get all books
    public List<Book> getAllBooks (){
        return bookRepos.findAll();

    }
    
}
