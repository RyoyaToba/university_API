package com.example.demo.error;

public class UniversityEntityNotFoundException extends RuntimeException{

    private Long id;

    public UniversityEntityNotFoundException(Long id){
        super("id (id = " + id + ") is NOT Found");
        this.id = id;
    }
}
