package com.decoder135.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
//    define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;


//    define constructors

//    define getter/setter
}
