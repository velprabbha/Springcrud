package com.project.Springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Springcrud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
