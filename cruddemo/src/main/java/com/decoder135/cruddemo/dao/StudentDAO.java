package com.decoder135.cruddemo.dao;

import com.decoder135.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
