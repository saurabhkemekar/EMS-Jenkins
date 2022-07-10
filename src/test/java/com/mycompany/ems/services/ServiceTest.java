package com.mycompany.ems.services;

import com.mycompany.ems.models.Employee;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class ServiceTest {

    @Autowired
    EmployeeServiceImpl employeeService;

    @Test
    public void testCreateRead(){
        Employee employee = new Employee("Ron", 12345689,"Testing",
                "mutant@gmail.com","multiVerse","Tester");

        employeeService.saveEmployee(employee);

        Iterable<Employee> emplist = employeeService.getListofEmployee();

        Assertions.assertThat(emplist).extracting(Employee::getEmpName).containsOnly("Ron");
    }

//    @Test
//    public void VerifyLoginDetails(){
//
//
//        employeeService.saveEmployee(employee);
//
//        Iterable<Employee> emplist = employeeService.getListofEmployee();
//
//        Assertions.assertThat(emplist).extracting(Employee::getEmpName).containsOnly("Ron");
//    }

}
