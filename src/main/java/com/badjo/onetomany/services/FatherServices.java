package com.badjo.onetomany.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badjo.onetomany.model.Father;
import com.badjo.onetomany.repositories.FatherRepository;

@Service
public class FatherServices {

	@Autowired
	private FatherRepository fathrepo;
	
	public Father findFatherById(long id) {
		return  fathrepo.findById(id).get();
	}

	public void addFather(Father father) {
		fathrepo.save(father);
	}
	public Iterable<Father> getAll(){
		return fathrepo.findAll();
	}

	
}
