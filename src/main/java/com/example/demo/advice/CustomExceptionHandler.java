package com.example.demo.advice;

import com.example.demo.error.UniversityEntityNotFoundException;
import com.example.university.model.ResourceNotFoundError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // 処理を差し込む
public class CustomExceptionHandler {

    @ExceptionHandler(UniversityEntityNotFoundException.class) //このExceptionが発生したときのハンドラーメソッドであるということ
    public ResponseEntity<ResourceNotFoundError> handleUniversityNotFoundException(UniversityEntityNotFoundException ex){
        var error = new ResourceNotFoundError();
        error.setDetail(ex.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
