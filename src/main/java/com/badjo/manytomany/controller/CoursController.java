package com.badjo.manytomany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.badjo.manytomany.model.Cours;
import com.badjo.manytomany.services.CoursServices;

@RestController
public class CoursController {

	private CoursServices crser;
	
	@GetMapping("/Courses")
	public Iterable<Cours> getAll(){
		return crser.getAll();
	}
	
	@GetMapping("/Courses/{id}")
	public Cours getCoursById(@RequestParam long id) {
		return crser.getCoursById(id);
	}
	
	@PostMapping("/Cours")
	public void addCours(@RequestParam Cours cours) {
		crser.addCours(cours);
	}
}
