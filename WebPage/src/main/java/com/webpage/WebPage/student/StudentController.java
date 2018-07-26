package com.webpage.WebPage.student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//Injection when running this controller it will instance the service 
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/student")
	public List<Student> getAllStudents() {
		return 	studentService.getAllStudents();
	}
	
	@RequestMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable long id) {
		return  studentService.getStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/student")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/student/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable String id) {
		studentService.updateStudent(id, student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/student/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentService.deleteStudent(id);
	}
	
}
