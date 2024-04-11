package com.example.task3.employee;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.util.Date;

@Entity
@Table(name = "person")
public class Employee {

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Size(min = 3, max = 20)
    private String name;

    private Date birthday;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}