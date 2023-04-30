package com.project.Springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.Springcrud.model.Student;
import com.project.Springcrud.repository.StudentRepository;

@Component
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository repository;
	@Override
	public Student createStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Student> getAllStudent(Student student) {
		return repository.findAll();
	}

	@Override
	public Student updateStudent(long id) {
		Student student=repository.findById(id).orElseThrow();
		return repository.save(student);
	}

	@Override
	public String deleteStudent(long id) {
		try {
			Student student=repository.findById(id).orElseThrow();
			repository.delete(student);
			return "Deleted succesfully";
		}
		catch(Exception e) {
			return "Delected unsuccesful";
		}
	}

}
