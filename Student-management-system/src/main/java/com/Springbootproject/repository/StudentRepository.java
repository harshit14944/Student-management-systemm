package com.Springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springbootproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
