package com.mycompany.ems.services;

import com.mycompany.ems.models.Employee;
import com.mycompany.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepository employeeRepository;

    public Iterable<Employee> getListofEmployee(){
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    public Employee getEmployeebyID(Long id){
        return employeeRepository.findById(id).get();
    }
}
