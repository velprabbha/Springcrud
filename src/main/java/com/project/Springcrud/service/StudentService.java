package com.project.Springcrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.Springcrud.model.Student;

@Service
public interface StudentService {
	Student createStudent(Student student);
	Student getStudentById(long id);
	List<Student> getAllStudent(Student student);
	Student updateStudent(long id);
	String deleteStudent(long id);
}
