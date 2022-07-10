package com.mycompany.ems.controllers;

import com.mycompany.ems.models.Employee;
//import com.mycompany.ems.service.EmployeeService;
import com.mycompany.ems.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.bind.ValidationException;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/emplist")
    Iterable<Employee> read(){
        return employeeService.getListofEmployee();
    }

//    @PostMapping("/add")
//    Employee create(@RequestBody Employee employee){
//
//        return employeeService.saveEmployee(employee);
//    }

    @PostMapping("/add")
    Employee create(@Valid @RequestBody Employee employee) throws ValidationException {


        if(employee.getEmpName()!=null && employee.getEmpRole() !=null && employee.getEmpDepartment() != null){
            return employeeService.saveEmployee(employee);
        }else{
            //throw new ValidationException("Please provide the name, role and department of the employee!!");
            throw new ValidationException("Please provide the name, role and department of the employee!!");
        }
    }

//    @ExceptionHandler(ValidationException.class)
//    ResponseEntity<String> exceptionHandler(ValidationException e){
//        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//    }
}
