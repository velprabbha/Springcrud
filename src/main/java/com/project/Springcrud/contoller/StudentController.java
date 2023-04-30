package com.project.Springcrud.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Springcrud.model.Student;
import com.project.Springcrud.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
	private final StudentService studentService;

	public StudentController(StudentService studentService) {

		this.studentService = studentService;
	}
	@PostMapping("/createstudent/{student}")
	public Student createStudent(@RequestBody Student student) {

		return studentService.createStudent(student);
	}
	@GetMapping("/getbyid/{id}")
	public Student getStudentById(@PathVariable long id) {

		return studentService.getStudentById(id);
	}
	@GetMapping("/getalldata/{student}")
	public List<Student> getAllStudent(@RequestBody Student student) {

		return studentService.getAllStudent(student);
	}
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable long id) {

		return studentService.updateStudent(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@RequestBody long id) {
		return studentService.deleteStudent(id);
	}
}
