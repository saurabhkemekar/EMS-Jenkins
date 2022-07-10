package com.mycompany.ems.controllers;

import com.mycompany.ems.models.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    ErrorMessage expectionHandler(ValidationException e){
        return new ErrorMessage("400", e.getMessage());
    }
}
