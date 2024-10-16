package com.example.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
