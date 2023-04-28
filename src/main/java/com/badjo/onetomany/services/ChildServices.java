package com.badjo.onetomany.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badjo.onetomany.model.Child;
import com.badjo.onetomany.repositories.ChildRepository;

@Service
public class ChildServices {

	@Autowired
	private ChildRepository childrepo;
	
	public Child findChildById(long id) {
		return  childrepo.findById(id).get();
	}
	
	public Iterable<Child> getAll(){
		return childrepo.findAll();
	}

	public void addChild(Child child) {
		childrepo.save(child);
		
	}
}
