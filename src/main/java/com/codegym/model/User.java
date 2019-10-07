package com.codegym.model;

import org.springframework.stereotype.Controller;

import javax.validation.constraints.*;

@Controller
public class User {
    @NotEmpty
    @Size(min = 5, max = 45)
    private String name;


    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]*$)")
    private String phoneNumber;

    @Min(value = 18)
    private String age;

    @NotEmpty
    @Email
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
