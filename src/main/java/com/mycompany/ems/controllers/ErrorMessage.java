package com.mycompany.ems.controllers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorMessage {

    public String status;
    public String message;

    ErrorMessage(String status, String message){
        this.status = status;
        this.message= message;
    }
}
