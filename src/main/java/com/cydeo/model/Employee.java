package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee {

    private String firstName;
    private String lastName;

    //Thymeleaf accepts yyyy_MM-dd, but LocalDate accepts mm-dd-yyyy - yyyy-dd-mm
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private LocalDate birthday;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
