package com.webpage.WebPage.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;	
	
	public List<Student> getAllStudents(){
		//return students;
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	public Optional<Student> getStudent(long id) {
		//return students.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return studentRepository.findById(id);
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public void updateStudent(String id, Student student) {
		studentRepository.save(student);
	}

	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
	}
	
}
