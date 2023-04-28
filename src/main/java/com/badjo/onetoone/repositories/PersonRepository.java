package com.badjo.onetoone.repositories;

import org.springframework.data.repository.CrudRepository;

import com.badjo.onetoone.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
