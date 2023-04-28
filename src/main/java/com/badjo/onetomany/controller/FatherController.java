package com.badjo.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.badjo.onetomany.model.Father;
import com.badjo.onetomany.services.FatherServices;

@RestController
public class FatherController {

	@Autowired
	private FatherServices fathservice;
	
	@GetMapping("/Fathers/{id}")
	public Father findFatherById(@RequestParam long id) {
		return fathservice.findFatherById(id);
	}
	
	@PostMapping("/Father")
	public void addFather(Father fath) {
		fathservice.addFather(fath);
	}
	@GetMapping("/Fathers")
	public Iterable<Father> getAll(){
		return fathservice.getAll();
	}
	
}
