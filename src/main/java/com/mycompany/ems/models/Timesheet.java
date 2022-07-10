package com.mycompany.ems.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Timesheet implements Serializable {


    @Id
    @GeneratedValue
    private int timesheetID;

 //   private int empID;

    private String empName;
    private int timeTotalHours;

    private Date timesheet_date;

    private String timeTask;
    private String  timeDescription;

//
//    public Timesheet(int tth, String empName, TimsheetKey key, String timeDescription, String timeTask){
//        this.timeTotalHours = tth;
//        this.empName = empName;
//        this.timeDescription = timeDescription;
//        this.timeTask = timeTask;
//        this.key = key;
//    }

}
