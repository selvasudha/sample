package com.example.voiz_team02.model;
import lombok.Data;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;

@Data
@Document
public class Register {

    private String id;


    @NotBlank
    @Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\.\\-]+)\\.([a-zA-Z]{2,5})$")
    private String emailAddress;


    @NotBlank
    @Size(min = 6,message = "minimum 6 characters")
    private String password;


    @NotBlank
    @Pattern(regexp = "^[a-zA-Z\\s]{2,20}$",message = "Give a valid name")
    private  String full_name;

    @Id
    @NotBlank
    @Digits(integer=10,message="Invalid no", fraction = 0)
    private String mobile_no;



    public String getId() {
        return id;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getMobile_no() {
        return mobile_no;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }



}
