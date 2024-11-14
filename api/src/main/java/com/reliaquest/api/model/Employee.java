package com.reliaquest.api.model;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Employee {


    @javax.persistence.Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String employee_name;

    private int employee_salary;

    private int employee_age;

    private String employee_title;

    private String employee_email;

    public UUID getId() {
        return id;
    }

}
