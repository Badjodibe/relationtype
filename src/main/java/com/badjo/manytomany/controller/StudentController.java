package com.badjo.manytomany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.badjo.manytomany.model.Student;
import com.badjo.manytomany.services.StudentServices;

@RestController
public class StudentController {

private StudentServices stservices;
	
	@GetMapping("/Students")
	public Iterable<Student> getAll(){
		return stservices.getAll();
	}
	
	@GetMapping("/Students/{id}")
	public Student findById(@RequestParam long id) {
		return stservices.findById(id);
	}
	
	@PostMapping("/Student")
	public void addStudent(Student st) {
		stservices.addStudent(st);
	}
}
