package com.example.studentcourses.Employee_address.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address_table")

public class Address {
@Id
 @GeneratedValue(strategy = GenerationType.AUTO)
   private long id ;
    private  String street ;
    private  String City ;

    @Enumerated(EnumType.STRING)
    private State state;
    private  String Zipcode ;
}
