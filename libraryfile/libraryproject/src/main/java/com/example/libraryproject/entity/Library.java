package com.example.libraryproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Library {
    public Library(Long id, String libraryName, String location) {
        this.id = id;
        this.libraryName = libraryName;
        this.location = location;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLibraryName() {
        return libraryName;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Id 
    private Long id;
    private String libraryName;
    private String location;
    
}
