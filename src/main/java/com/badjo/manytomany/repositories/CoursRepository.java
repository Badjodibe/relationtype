package com.badjo.manytomany.repositories;

import org.springframework.data.repository.CrudRepository;

import com.badjo.manytomany.model.Cours;

public interface CoursRepository extends CrudRepository<Cours, Long>{

}
