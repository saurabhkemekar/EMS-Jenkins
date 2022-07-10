package com.mycompany.ems.controllers;

import com.mycompany.ems.models.Employee;
//import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.ValidationException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntergrationTests {

    @Autowired
    EmployeeController employeeController;
    @Test
    public void createRead() throws ValidationException {
        Employee newEmp = new Employee("Ron", 12345689,"Testing",
                                    "mutant@gmail.com","multiVerse","Tester");

        Employee empResult = employeeController.create(newEmp);
        
        Iterable<Employee> empList = employeeController.read();

        Assertions.assertThat(empList).first().hasFieldOrPropertyWithValue("empName","Ron");

    }

}
