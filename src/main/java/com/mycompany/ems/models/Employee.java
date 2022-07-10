package com.mycompany.ems.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@SuppressWarnings("serial")
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long empID;
    @NotEmpty
    String empName;

    long empContact;
    String empDepartment;
    @Email
    String empEmail;
    String empAddress;

    String empRole;

//    @OneToOne(cascade =  CascadeType.ALL,mappedBy = "employee")
//    private Login login;

    @OneToOne(fetch =FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "login_empID")

    private Login login;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Timesheet> timesheet;

    Employee(){

    }

    public Employee(String empName, long empContact, String empDepartment
            , String empEmail, String empAddress, String empRole){
        this.empName = empName;
        this.empContact = empContact;
        this.empDepartment = empDepartment;
        this.empEmail = empEmail;
        this.empAddress = empAddress;
        this.empRole = empRole;
    }

    Employee(String empName,Long empContact, String empDepartment
            ,String empEmail, String empAddress, String empRole, Login login){
        this.empName = empName;
        this.empContact = empContact;
        this.empDepartment = empDepartment;
        this.empEmail = empEmail;
        this.empAddress = empAddress;
        this.empRole = empRole;
        this.login = login;
    }


    @Override
    public String toString() {
        return "ems.Employee [empID=" + empID + ", empName=" + empName + ", empContact=" + empContact + ", empDepartment="
                + empDepartment + ", empEmail=" + empEmail + ", empAddress=" + empAddress + "]";
    }

}
