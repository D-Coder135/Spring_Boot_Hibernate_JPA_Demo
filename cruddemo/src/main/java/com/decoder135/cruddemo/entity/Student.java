package com.decoder135.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
//    define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    define constructors

//    define getter/setter
}
