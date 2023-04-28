package com.badjo.manytomany.services;

import org.springframework.stereotype.Service;

import com.badjo.manytomany.model.Cours;
import com.badjo.manytomany.repositories.CoursRepository;

@Service
public class CoursServices {

	private CoursRepository csrepo;
	
	public Iterable<Cours> getAll(){
		return csrepo.findAll();
	}
	
	public Cours getCoursById(long id) {
		return csrepo.findById(id).get();
	}
	
	public void addCours(Cours cours) {
		csrepo.save(cours);
	}
}
