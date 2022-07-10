package com.mycompany.ems.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empID;


 //   private int loginID;

    private String loginUsername;

    private String loginPassword;

    private String loginStatus;



    public Login(String loginUsername, String loginPassword, String loginStatus){
        this.loginUsername = loginUsername;
        this.loginPassword = loginPassword;
        this.loginStatus = loginStatus;
    }





}
