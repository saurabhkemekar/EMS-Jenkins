package com.mycompany.ems;

import com.mycompany.ems.controllers.EmployeeController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    EmployeeController employeeController;

    @Test
    public void SpringLoad(){
        Assert.assertNotNull(employeeController);

    }
}
