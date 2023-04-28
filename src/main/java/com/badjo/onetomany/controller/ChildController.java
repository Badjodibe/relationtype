package com.badjo.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.badjo.onetomany.model.Child;
import com.badjo.onetomany.services.ChildServices;

@RestController
public class ChildController {

	@Autowired
	private ChildServices childservice;
	
	@GetMapping("/Childs/{id}")
	public Child findChildById(@RequestParam long id) {
		return childservice.findChildById(id);
	}
	
	@PostMapping("/Child")
	public void addChild(Child child) {
		childservice.addChild(child);
	}
	@GetMapping("/Childs")
	public Iterable<Child> getAll(){
		return childservice.getAll();
	}
}
