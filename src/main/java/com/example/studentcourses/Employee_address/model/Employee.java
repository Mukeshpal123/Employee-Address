package com.example.studentcourses.Employee_address.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String firstname ;
    private String lastName ;


    @OneToOne(cascade = CascadeType.ALL)  //cascade is use if we want to save from this side

    private  Address address;
}
