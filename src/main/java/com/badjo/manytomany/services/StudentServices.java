package com.badjo.manytomany.services;

import org.springframework.stereotype.Service;

import com.badjo.manytomany.model.Student;
import com.badjo.manytomany.repositories.StudentRepository;

@Service
public class StudentServices {

	private StudentRepository strepo;
	
	public Iterable<Student> getAll(){
		return strepo.findAll();
	}
	
	public Student findById(long id) {
		return strepo.findById(id).get();
	}
	public void addStudent(Student st) {
		strepo.save(st);
	}
	
}
