package com.badjo.onetomany.repositories;

import org.springframework.data.repository.CrudRepository;

import com.badjo.onetomany.model.Child;

public interface ChildRepository extends CrudRepository<Child, Long> {

}
