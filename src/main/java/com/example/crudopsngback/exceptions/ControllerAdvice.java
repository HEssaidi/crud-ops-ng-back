package com.example.crudopsngback.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException noSuchElementException){
        return new ResponseEntity<String>("No id value found", HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException nullPointerException){
        return new ResponseEntity<String>("null exception honey !!!!!!!", HttpStatus.NOT_FOUND);
    }

}
